plugins {
    kotlin("jvm") version "2.1.21"
}

group = "io.keepcoding"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // TODO aquí añadiremos las librerías que vayamos a usar.
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}