buildscript {
    repositories {
        google()
        mavenCentral()
    }
}

plugins {
    `java-gradle-plugin`
    alias(libs.plugins.kotlin.jvm)
}

group = "tech.dalapenko.pluginexample"
version = "handmade"

gradlePlugin {
    plugins {
        register("plugin-example") {
            id = "plugin-example"
            implementationClass = "tech.dalapenko.pluginexample.ExamplePlugin"
        }
    }
}

dependencies {
    testImplementation(libs.junit)
}