import java.net.URI

include(":ui-module-b")


include(":ui-module-a")


include(":ui-dashboard")


pluginManagement {
    resolutionStrategy {
        eachPlugin {
            when(requested.id.toString()) {
                in listOf(
                    "com.google.gms.google-services"
                ) -> useModule("com.google.gms:google-services:${requested.version}")
                in listOf(
                    "kotlin-serialization"
                ) -> useModule("org.jetbrains.kotlin:kotlin-serialization:${requested.version}")
                else -> return@eachPlugin
            }
        }
    }

    repositories {
        gradlePluginPortal()
        mavenCentral()
        google()
    }
}

dependencyResolutionManagement {
    versionCatalogs {
        create("libs") {
            from(files("./gradle/version-catalog/libs.versions.toml"))
        }
    }

    repositories {
        google()
        mavenCentral()
        maven { url = URI("https://jitpack.io") }
    }
}

rootProject.name = "KLNDemo"
include(":ui-app-runner")
 