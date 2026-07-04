package dev.brahmkshatriya.echo.extension

import android.annotation.SuppressLint
import android.app.Application
import dev.brahmkshatriya.echo.extension.spotify.Json
import java.io.File


@Suppress("unused")
class ADSpotifyExtension : SpotifyExtension() {

    @SuppressLint("PrivateApi")
    private fun getApplication(): Application {
        return Class.forName("android.app.ActivityThread").getMethod("currentApplication")
            .invoke(null) as Application
    }

    override val filesDir by lazy { File(getApplication().filesDir, "spotify") }
    override val showWidevineStreams = true

    override suspend fun getKey(json: Json, accessToken: String, fileId: String): ByteArray {
        throw Exception("unplayplay library missing")
    }
}
