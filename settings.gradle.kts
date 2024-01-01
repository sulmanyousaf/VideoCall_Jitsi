pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven(url = "https://github.com/jitsi/jitsi-maven-repository/raw/master/releases")
        maven(url = "https://www.jitpack.io")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://github.com/jitsi/jitsi-maven-repository/raw/master/releases")
        maven(url = "https://www.jitpack.io")
    }
}

rootProject.name = "VideoCall"
include(":app")
 