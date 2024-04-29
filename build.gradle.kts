plugins {
    id("java")
    id("org.quiltmc.quilt-gradle")
    id("maven-publish")
}

group = "org.quiltmc"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven { setUrl("https://maven.quiltmc.org/repository/release") }
}

dependencies {
    implementation("net.minecraft:minecraft-client:1.20.4")
//    implementation("org.quiltmc:qsl:8.0.0-alpha.13+1.20.4")
}
