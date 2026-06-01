buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    id("com.android.application") version "8.1.2" apply false
    kotlin("android") version "1.9.10" apply false
}

task("clean", Delete::class) {
    delete(rootProject.buildDir)
}
