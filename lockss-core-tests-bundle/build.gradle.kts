/*
 * LOCKSS Core Tests Bundle
 *
 * POM bundle that provides lockss-core test dependencies.
 * This is a dependency-only project (equivalent to Maven pom packaging).
 */

plugins {
    id("lockss-pom-bundle-conventions")
}

version = "2.10.0-SNAPSHOT"
description = "POM bundle providing lockss-core test dependencies"

dependencies {
    // Will depend on lockss-core test artifacts once migrated
    // api(project(":lockss-core", configuration = "testArtifacts"))
}
