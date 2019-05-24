buildscript {
    repositories {
        jcenter()
        google()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.2.61")
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
