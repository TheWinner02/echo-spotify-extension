package dev.brahmkshatriya.echo.extension.spotify

object WebPlayerConfig {
    const val USER_AGENT =
        "Mozilla/5.0 (Linux; Android 10; K) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/131.0.0.0 Mobile Safari/537.36"

    const val SEC_CH_UA =
        "\"Chromium\";v=\"131\", \"Google Chrome\";v=\"131\", \"Not_A Brand\";v=\"24\""
    const val SEC_CH_UA_MOBILE = "?1"
    const val SEC_CH_UA_PLATFORM = "\"Android\""

    const val ORIGIN = "https://open.spotify.com"
    const val REFERER = "https://open.spotify.com/"
    const val APP_PLATFORM = "WebPlayer"
    const val ACCEPT_LANGUAGE = "en-US,en;q=0.9"

    const val CLIENT_ID = "d8a5ed958d274c2e8ee717e6a4b0971d"

    @Volatile
    var appVersion: String = "1.2.88.248.g539a4816"
}
