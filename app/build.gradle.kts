plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
    kotlin("kapt")
}

android {
    namespace = "com.bignerdranch.android.criminallntent_"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.bignerdranch.android.criminallntent_"
        minSdk = 28
        targetSdk = 33
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
    kotlinOptions {
        jvmTarget = "1.8"
    }
    /*kapt {
        arguments {
            arg("room.schemaLocation",
                "some/path/goes/here/")
        }
    }*/

}

dependencies {

    implementation("androidx.core:core-ktx:1.9.0")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.10.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    implementation("androidx.lifecycle:lifecycle-extensions:2.0.0")
    implementation("androidx.recyclerview:recyclerview:1.0.0")
    implementation("androidx.room:room-common:2.6.0")
    //implementation("androidx.room:room-compiler:2.6.0")

    implementation( "androidx.room:room-runtime:2.1.0-alpha04")
    implementation("org.jetbrains:annotations:12.0")
    kapt("androidx.room:room-compiler:2.1.0-alpha04")

    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")

}

