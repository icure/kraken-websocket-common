plugins {
    alias(libs.plugins.kotlin)
    alias(libs.plugins.gitVersion)
    alias(libs.plugins.mavenRepository)
    `maven-publish`
}

group = "com.icure"
val gitVersion: String? by project
version = gitVersion ?: "0.0.1-SNAPSHOT"

dependencies {
    implementation(libs.springBootWebflux)
    implementation(libs.springBootSecurity)
    implementation(libs.kotlinxCoroutinesCore)
    implementation(libs.kotlinxCoroutinesReactor)
}

kotlin {
    jvmToolchain(21)

    compilerOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        allWarningsAsErrors = true
    }
}

java {
    sourceCompatibility = JavaVersion.VERSION_21
    targetCompatibility = JavaVersion.VERSION_21
}
