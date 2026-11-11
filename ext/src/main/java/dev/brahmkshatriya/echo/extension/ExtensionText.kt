package dev.brahmkshatriya.echo.extension

import dev.brahmkshatriya.echo.common.settings.Settings
import java.util.Locale

/** UI strings supplied by Echo; older hosts retain the English fallback. */
internal object ExtensionText {
    @Volatile var settings: Settings? = null

    fun locale(): Locale = runCatching {
        settings?.getString("echo.l10n.locale")?.let(Locale::forLanguageTag)
    }.getOrNull() ?: Locale.getDefault()

    fun get(key: String, fallback: String, vararg arguments: Any): String {
        val translated = runCatching { settings?.getString("echo.l10n.$key") }
            .getOrNull()?.takeIf { it.isNotBlank() } ?: fallback
        if (arguments.isEmpty()) return translated
        return try { String.format(locale(), translated, *arguments) }
        catch (_: java.util.IllegalFormatException) { String.format(locale(), fallback, *arguments) }
    }

    fun country(code: String): String = Locale("", code).getDisplayCountry(locale())
        .takeIf { it.isNotBlank() } ?: code

    fun category(id: String): String = when (id.lowercase(Locale.ROOT)) {
        "all" -> get("providers.all_a52ace", "All")
        "you" -> get("providers.you_08b041", "You")
        "song" -> get("providers.songs_bc6761", "Songs")
        "songs" -> get("providers.songs_bc6761", "Songs")
        "track" -> get("providers.tracks_889801", "Tracks")
        "tracks" -> get("providers.tracks_889801", "Tracks")
        "album" -> get("providers.albums_57bca6", "Albums")
        "albums" -> get("providers.albums_57bca6", "Albums")
        "artist" -> get("providers.artists_94e3e8", "Artists")
        "artists" -> get("providers.artists_94e3e8", "Artists")
        "playlist" -> get("providers.playlists_dcd0a4", "Playlists")
        "playlists" -> get("providers.playlists_dcd0a4", "Playlists")
        "podcast" -> get("providers.podcasts_6ac749", "Podcasts")
        "podcasts" -> get("providers.podcasts_6ac749", "Podcasts")
        "shows" -> get("providers.podcasts_6ac749", "Podcasts")
        "episodes" -> get("providers.episodes_83f972", "Episodes")
        "users" -> get("providers.users_6b0cc9", "Users")
        "genres" -> get("providers.genres_3561ab", "Genres")
        "videos" -> get("providers.videos_c9a963", "Videos")
        "history" -> get("providers.history_0e7696", "History")
        else -> id.lowercase(Locale.ROOT).replaceFirstChar { it.titlecase(locale()) }
    }
}
