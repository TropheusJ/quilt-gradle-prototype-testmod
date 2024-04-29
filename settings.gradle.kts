rootProject.name = "quilt-gradle-testmod"
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")

pluginManagement {
    repositories {
        mavenCentral()
        maven("https://libraries.minecraft.net")
        maven("https://maven.fabricmc.net")
    }

    includeBuild("../quilt-gradle-prototype")
}
