plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
//    id("kotlin-kapt")
//    id ("org.jetbrains.kotlin.kapt")
}

android {
    namespace = "ru.gb.dz17"
    compileSdk = 35

    defaultConfig {
        applicationId = "ru.gb.dz17"
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
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
        dataBinding = true
    }
}

dependencies {
    implementation("androidx.recyclerview:recyclerview:1.3.2")

    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.7")
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")

//Retrofit
    implementation("com.squareup.retrofit2:retrofit:2.11.0")

//Moshi
    implementation ("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")
    implementation ("com.squareup.moshi:moshi-kotlin:1.14.0")
    implementation("com.squareup.retrofit2:converter-moshi:2.11.0")
    implementation("com.squareup.moshi:moshi:1.15.1")
//    kapt("com.squareup.moshi:moshi-kotlin-codegen:1.14.0")

//    Coil
    implementation("io.coil-kt:coil:0.13.0")
    implementation("androidx.fragment:fragment-ktx:1.8.5")
    implementation ("androidx.navigation:navigation-fragment-ktx:2.8.5")
    implementation ("androidx.navigation:navigation-ui-ktx:2.8.5")

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)

    implementation("androidx.paging:paging-runtime:3.3.5")
    implementation("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")
//    Coroutines
//    implementation("org.jetbrains.kotlin:kotlin-coroutines-core:1.3.9")
//    implementation("org.jetbrains.kotlin:kotlin-coroutines-android:1.5.0")

    implementation("com.google.code.gson:gson:2.10.1")

    implementation("com.squareup.retrofit2:converter-gson:2.11.0")
//    implementation (libs.converter.gson)

    implementation ("com.github.bumptech.glide:glide:4.13.0")
    annotationProcessor("com.github.bumptech.glide:compiler:4.13.0")

    implementation ("com.squareup.okhttp3:okhttp:4.9.2")
    implementation("com.squareup.okhttp3:logging-interceptor:4.9.2")
}