plugins {
    alias(libs.plugins.android.application)
}

android {
    // Chọn một namespace phù hợp với dự án của bạn
    namespace = "com.example.dicerandom" // Hoặc "com.example.sum" hoặc "com.example.chuyendoinam"

    compileSdk = 34

    defaultConfig {
        // Chọn một applicationId phù hợp với namespace đã chọn
        applicationId = "com.example.dicerandom" // Hoặc "com.example.sum" hoặc "com.example.chuyendoinam"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}