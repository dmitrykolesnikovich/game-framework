buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.3.10")
        classpath("com.android.tools.build:gradle:3.4.0")
    }
}

plugins {
    id("base")
}

allprojects {
    repositories {
        maven("https://maven.google.com")
        jcenter()
        google()
    }
    apply(plugin = "idea")
}
