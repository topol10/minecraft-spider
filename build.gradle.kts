plugins {
    kotlin("jvm") version "2.0.0"
}

group = "com.heledron"
version = "4.0-SNAPSHOT"

repositories {
    mavenCentral()
    // Этот адрес скачает нужные библиотеки майнкрафта, чтобы код не выдавал ошибку на 300 строк
    maven("https://papermc.io")
    maven("https://sonatype.org")
}

dependencies {
    // Подключаем стабильное Paper API
    compileOnly("io.papermc.paper:paper-api:1.21.1-R0.1-SNAPSHOT")
    implementation("org.jetbrains.kotlin:kotlin-stdlib")
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().configureEach {
    kotlinOptions {
        jvmTarget = "21"
    }
}
