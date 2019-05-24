import org.jetbrains.kotlin.config.KotlinCompilerVersion

buildscript {
    dependencies {
        classpath("com.android.tools.build:gradle:3.4.0")
    }
}

plugins {
    id("com.android.application")
    kotlin("android")
    kotlin("android.extensions")
}

android {
    compileSdkVersion(27)
    defaultConfig {
        applicationId = "game.sample.android"
        minSdkVersion(15)
        targetSdkVersion(27)
        versionCode = 1
        versionName = "1"
    }  
}

dependencies {
    implementation(fileTree(mapOf("dir" to "libs", "include" to listOf("*.jar"))))
    implementation(kotlin("stdlib-jdk7", KotlinCompilerVersion.VERSION))
    implementation("com.android.support:appcompat-v7:27.1.1")
    implementation("com.android.support.constraint:constraint-layout:1.1.0")
}
