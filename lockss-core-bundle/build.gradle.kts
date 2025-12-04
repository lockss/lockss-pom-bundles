/*
 * LOCKSS Core Bundle
 *
 * POM bundle that provides lockss-core and its dependencies.
 * This is a dependency-only project (equivalent to Maven pom packaging).
 */

plugins {
    id("lockss-pom-bundle-conventions")
}

version = "2.10.0-SNAPSHOT"
description = "POM bundle providing lockss-core and its dependencies"

dependencies {
    // Will depend on lockss-core project once migrated
    // api(project(":lockss-core"))
}
