pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

if (extra.has("localYogaPath")) {
    includeBuild(extra.get("localYogaPath")!!) {
        dependencySubstitution {
            substitute(module("com.facebook.yoga:yoga")).using(project(":yoga"))
        }
    }
}

rootProject.name = "Yoga Bug"
include(":app")
 