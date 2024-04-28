rootProject.name = "quilt-gradle-testmod"
enableFeaturePreview("STABLE_CONFIGURATION_CACHE")

pluginManagement {
    repositories {
        mavenCentral()
        maven { setUrl("https://libraries.minecraft.net") }
    }

    includeBuild("../quilt-gradle-prototype")
}
