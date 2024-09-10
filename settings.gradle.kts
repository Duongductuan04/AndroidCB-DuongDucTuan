pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
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

<<<<<<< HEAD
rootProject.name = "Dice Random"
include(":app")
=======
<<<<<<< HEAD
rootProject.name = "Sum"
=======
rootProject.name = "ChuyendoiNAM"
>>>>>>> 9f28a4658eccf6c129811a56fa26fe8962302069
include(":app")
 
>>>>>>> ac72a9768226d9cc28e07fca2b242f46b0e785d5
