@file:Suppress("UnstableApiUsage")

pluginManagement {
	repositories {
		gradlePluginPortal()
		mavenCentral()
		maven { url = uri("https://maven.taktik.be/content/groups/public") }
		maven { url = uri("https://plugins.gradle.org/m2/") }
		maven { url = uri("https://jitpack.io") }
	}
}

dependencyResolutionManagement {
	repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS)
	repositories {
		google()
		mavenLocal()
		mavenCentral()
		maven { url = uri("https://maven.taktik.be/content/groups/public") }
		maven { url = uri("https://jitpack.io") }
	}
}

plugins {
	id("org.gradle.toolchains.foojay-resolver-convention") version "0.8.0"
}
rootProject.name = "kraken-websocket-common"

