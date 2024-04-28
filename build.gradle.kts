plugins {
    id("java")
    id("org.quiltmc.quilt-gradle")
    id("maven-publish")
}

group = "org.quiltmc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("net.minecraft:minecraft-client:1.20.4")
}
