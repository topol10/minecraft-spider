plugins {
    kotlin("jvm") version "2.0.0"
}

group = "com.heledron"
version = "4.0-SNAPSHOT"

repositories {
    mavenCentral()
    // Подключаем официальный репозиторий PaperMC, откуда скачаются нужные библиотеки
    maven("https://papermc.io")
    maven("https://sonatype.org")
}

dependencies {
    // Подтягиваем библиотеки Paper API напрямую из интернета для компиляции
    compileOnly("io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "21"
    }
}
