plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.michaeltroger.yogabug"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.michaeltroger.yogabug"
        minSdk = 28
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }
}

kotlin {
    jvmToolchain(17)
}

dependencies {
    implementation(libs.yoga)
    implementation(libs.soloader)
    implementation(libs.activity.ktx)
}