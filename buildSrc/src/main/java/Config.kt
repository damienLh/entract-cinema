/*
 * Copyright 2018 Stéphane Baiget
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

import org.gradle.api.JavaVersion

object Versions {
    val java = JavaVersion.VERSION_1_8
    val androidGradle = "3.3.0"
    val kotlin = "1.3.20"
    val googleServices = "4.2.0"
    val coroutines = "1.1.1"
    val appcompat = "1.1.0-alpha01"
    val vectorDrawable = "1.1.0-alpha01"
    val recyclerView = "1.1.0-alpha02"
    val material = "1.1.0-alpha03"
    val constraintLayout = "2.0.0-alpha3"
    val lifecyle = "2.1.0-alpha02"
    val timber = "4.7.1"
    val retrofit = "2.5.0"
    val retrofitCoroutines = "0.9.2"
    val anko = "0.10.8"
    val koin = "2.0.0-beta-1"
    val ktx = "1.1.0-alpha04"
    val glide = "4.8.0"
    val jsr310 = "1.1.1"
    val firebaseCore = "16.0.7"
    val firebaseMessaging = "17.3.4"
}

object Build {
    val androidGradle = "com.android.tools.build:gradle:${Versions.androidGradle}"
    val googleServices = "com.google.gms:google-services:${Versions.googleServices}"
}

object Android {
    val minSdkVersion = 21
    val targetSdkVersion = 28
    val compileSdkVersion = targetSdkVersion
}

object Libs {
    val coroutinesCore = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
    val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
    val anko = "org.jetbrains.anko:anko-commons:${Versions.anko}"

    val appcompat = "androidx.appcompat:appcompat:${Versions.appcompat}"
    val vectorDrawable = "androidx.vectordrawable:vectordrawable:${Versions.vectorDrawable}"
    val recyclerview = "androidx.recyclerview:recyclerview:${Versions.recyclerView}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Versions.constraintLayout}"
    val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Versions.lifecyle}"
    val lifecycleCompiler = "androidx.lifecycle:lifecycle-compiler:${Versions.lifecyle}"
    val ktx = "androidx.core:core-ktx:${Versions.ktx}"

    val material = "com.google.android.material:material:${Versions.material}"
    val firebaseCore = "com.google.firebase:firebase-core:${Versions.firebaseCore}"
    val firebaseMessaging = "com.google.firebase:firebase-messaging:${Versions.firebaseMessaging}"

    val timber = "com.jakewharton.timber:timber:${Versions.timber}"
    val retrofit = "com.squareup.retrofit2:retrofit:${Versions.retrofit}"
    val retrofitConverterMoshi = "com.squareup.retrofit2:converter-moshi:${Versions.retrofit}"
    val retrofitAdapterCoroutines =
        "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Versions.retrofitCoroutines}"
    val koinAndroid = "org.koin:koin-androidx-viewmodel:${Versions.koin}"
    val glide = "com.github.bumptech.glide:glide:${Versions.glide}"
    val jsr310 = "com.jakewharton.threetenabp:threetenabp:${Versions.jsr310}"
}
