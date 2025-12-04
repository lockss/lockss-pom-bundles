/*
 * LOCKSS JUnit 5 Bundle
 *
 * POM bundle for LOCKSS projects using JUnit 5.
 * This is a dependency-only project (equivalent to Maven pom packaging).
 */

plugins {
    id("lockss-pom-bundle-conventions")
}

version = "1.9.0-SNAPSHOT"
description = "POM bundle for LOCKSS projects using JUnit 5"

dependencies {
    constraints {
        api(libs.junit.jupiter.engine)
        api(libs.junit.jupiter.params)
        api(libs.junit4)
        api(libs.hamcrest.library)
    }

    // JUnit 5 Jupiter
    api(libs.junit.jupiter.engine)
    api(libs.junit.jupiter.params)

    // JUnit 4 (for vintage support)
    api(libs.junit4)

    // Hamcrest
    api(libs.hamcrest.library)
}
