/*
 * LOCKSS JUnit 4 Bundle
 *
 * POM bundle for LOCKSS projects using JUnit 4.
 * This is a dependency-only project (equivalent to Maven pom packaging).
 */

plugins {
    id("lockss-pom-bundle-conventions")
}

version = "1.9.0-SNAPSHOT"
description = "POM bundle for LOCKSS projects using JUnit 4"

dependencies {
    constraints {
        api(libs.junit4)
        api(libs.hamcrest.library)
    }

    api(platform(project(":")))  // Import root constraints if any

    // JUnit 4
    api(libs.junit4)

    // Hamcrest
    api(libs.hamcrest.library)
}
