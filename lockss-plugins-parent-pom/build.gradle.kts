/*
 * LOCKSS Plugins Parent POM
 *
 * POM bundle that serves as a parent for LOCKSS plugin projects.
 * This is a dependency-only project (equivalent to Maven pom packaging).
 */

plugins {
    id("lockss-pom-bundle-conventions")
}

version = "1.7.0-SNAPSHOT"
description = "Parent POM for LOCKSS plugin projects"

dependencies {
    // Base dependencies for plugins will be added here
}
