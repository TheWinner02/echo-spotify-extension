package dev.brahmkshatriya.echo.extension.spotify

object AudioFormat {
    const val OGG_VORBIS_96 = 0
    const val OGG_VORBIS_160 = 1
    const val OGG_VORBIS_320 = 2
    const val MP3_256 = 3
    const val MP3_320 = 4
    const val MP3_160 = 5
    const val MP3_96 = 6
    const val MP3_160_ENC = 7
    const val AAC_24 = 8
    const val AAC_48 = 9
    const val MP4_128 = 10
    const val MP4_256 = 11
    const val MP4_128_DUAL = 12
    const val MP4_256_DUAL = 13
    const val MP4_128_CBCS = 14
    const val MP4_256_CBCS = 15
    const val FLAC_FLAC = 16
    const val MP4_FLAC = 17
    const val XHE_AAC_24 = 18
    const val XHE_AAC_16 = 19
    const val XHE_AAC_12 = 20
    const val HE_AAC_64 = 21
    const val FLAC_FLAC_24BIT = 22
    const val MP4_FLAC_24BIT = 23

    fun name(format: Int): String = when (format) {
        OGG_VORBIS_96 -> "OGG_VORBIS_96"
        OGG_VORBIS_160 -> "OGG_VORBIS_160"
        OGG_VORBIS_320 -> "OGG_VORBIS_320"
        MP3_256 -> "MP3_256"
        MP3_320 -> "MP3_320"
        MP3_160 -> "MP3_160"
        MP3_96 -> "MP3_96"
        MP3_160_ENC -> "MP3_160_ENC"
        AAC_24 -> "AAC_24"
        AAC_48 -> "AAC_48"
        MP4_128 -> "MP4_128"
        MP4_256 -> "MP4_256"
        MP4_128_DUAL -> "MP4_128_DUAL"
        MP4_256_DUAL -> "MP4_256_DUAL"
        MP4_128_CBCS -> "MP4_128_CBCS"
        MP4_256_CBCS -> "MP4_256_CBCS"
        FLAC_FLAC -> "FLAC_FLAC"
        MP4_FLAC -> "MP4_FLAC"
        XHE_AAC_24 -> "XHE_AAC_24"
        XHE_AAC_16 -> "XHE_AAC_16"
        XHE_AAC_12 -> "XHE_AAC_12"
        HE_AAC_64 -> "HE_AAC_64"
        FLAC_FLAC_24BIT -> "FLAC_FLAC_24BIT"
        MP4_FLAC_24BIT -> "MP4_FLAC_24BIT"
        else -> "UNKNOWN"
    }

    fun quality(format: Int): Int = when (format) {
        OGG_VORBIS_96 -> 96
        OGG_VORBIS_160 -> 160
        OGG_VORBIS_320 -> 320
        MP3_96 -> 96
        MP3_160, MP3_160_ENC -> 160
        MP3_256 -> 256
        MP3_320 -> 320
        AAC_24 -> 24
        AAC_48 -> 48
        HE_AAC_64 -> 64
        XHE_AAC_12 -> 12
        XHE_AAC_16 -> 16
        XHE_AAC_24 -> 24
        MP4_128, MP4_128_DUAL, MP4_128_CBCS -> 128
        MP4_256, MP4_256_DUAL, MP4_256_CBCS -> 256
        FLAC_FLAC, MP4_FLAC -> 1411
        FLAC_FLAC_24BIT, MP4_FLAC_24BIT -> 4608
        else -> 0
    }
}
