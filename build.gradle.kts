import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.0-dev-1470"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev")
}

dependencies {
    implementation("org.jspecify:jspecify:0.2.0")
    implementation("org.jetbrains:annotations:22.0.0")
    implementation("io.reactivex.rxjava3:rxjava:3.1.3")
    implementation("com.github.akarnokd.rxjava3:rxjava3-common:0.1.0")
    implementation("io.reactivex:rxjava:1.3.8")
    implementation("com.google.code.findbugs:jsr305:3.0.2")
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
    kotlinOptions.languageVersion = "1.6"
}

application {
    mainClass.set("MainKt")
}