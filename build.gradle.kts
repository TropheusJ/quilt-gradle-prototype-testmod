import org.quiltmc.quilt_gradle.remapping.RemapTransform

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
    mappings {
        // declare all needed mappings
        addMappings("obfuscated", "mojmap", files("client.txt"))
        addMappings("obfuscated", "intermediary", "net.fabricmc:intermediary:1.20.4")
        addMappings("intermediary", "quilt-mappings", "org.quiltmc:quilt-mappings:1.20.4+build.3:intermediary-v2")
        // choose target
        setTargetMappings("mojmap")
        // declare mapped dependencies
        remap(implementation("net.minecraft:minecraft-client:1.20.4")) {
            setSourceMappings("obfuscated")
        }
//        remap(implementation("org.quiltmc:qsl:8.0.0-alpha.13+1.20.4"))
    }
}
