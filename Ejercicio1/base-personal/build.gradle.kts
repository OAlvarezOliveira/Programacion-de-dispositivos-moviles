plugins {
    kotlin("jvm") version "2.0.20"
}

repositories {
    mavenCentral()
}

sourceSets {
    main {
        kotlin.srcDirs("ejercicios", "katas", "clase")
    }
}

tasks.test {
    useJUnitPlatform()
}
