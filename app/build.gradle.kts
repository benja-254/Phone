android {
    namespace = "com.auradial.glassdialer"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.auradial.glassdialer"
        minSdk = 26
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
    ...
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.14"
    }
}

dependencies {
    val composeBom = platform("androidx.compose:compose-bom:2024.06.00")
    implementation(composeBom)
    ...
}
