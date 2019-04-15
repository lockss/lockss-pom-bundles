# `lockss-pom-bundles`

This project is a collection of ancillary Maven POM files used in LOCKSS software development.

It consists of several sub-projects:

*   JUnit-related
    *   [**`lockss-junit5-bundle`**](lockss-junit5-bundle): single Maven POM file to bundle useful JUnit 5-related dependencies
    *   [**`lockss-junit4-bundle`**](lockss-junit4-bundle): single Maven POM file to bundle useful JUnit 4-related dependencies (until the project can be migrated to JUnit 5)
*   [`lockss-core`](https://github.com/lockss/lockss-core)-related
    *   [**`lockss-core-bundle`**](lockss-core-bundle): single Maven POM file to depend on `lockss-core` with useful dependency exclusions when necessary
    *   [**`lockss-core-tests-bundle`**](lockss-core-tests-bundle): single Maven POM file to depend on `lockss-core`'s `tests` artifact in `test` scope with useful dependency exclusions when necessary

## See Also

*   [`lockss-parent-pom`](https://github.com/lockss/lockss-parent-pom): Maven POM file driving builds of LOCKSS software projects

## Resources

*   [LOCKSS Program website](https://www.lockss.org/)
*   [LOCKSS Program on GitHub](https://github.com/lockss)
*   [LOCKSS Software Pages](https://lockss.github.io/software)
*   [LOCKSS Developer Pages](https://lockss.github.io/developers)
