plugins {
    kotlin("jvm") version "1.5.10"
    java
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))

    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.+")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")

    // https://mockk.io/ & https://kotest.io/
    testImplementation("io.mockk:mockk:1.12.2")
    testImplementation("io.kotest:kotest-assertions-core:5.1.0")

    // coroutine
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.2")

    // rsync
    // https://mvnrepository.com/artifact/com.github.fracpete/rsync4j-pom
    implementation("com.github.fracpete:rsync4j-all:3.2.3-9")

    // hibernate-core
    // https://mvnrepository.com/artifact/org.hibernate/hibernate-core
    implementation("org.hibernate:hibernate-core:5.6.7.Final")

    // h2
    // https://mvnrepository.com/artifact/com.h2database/h2
    implementation("com.h2database:h2:2.1.212")


}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "11"
    targetCompatibility = "11"
}