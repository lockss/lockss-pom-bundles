# `lockss-junit5-bundle`

This project defines a single Maven POM file that can be used to introduce a dependency on JUnit 5 in `test` scope, bundled with useful dependencies:

*   Hamcrest (`hamcrest-library`)

## Using

    <dependency>
      <groupId>org.lockss</groupId>
      <artifactId>lockss-junit5-bundle</artifactId>
      <version>${version.of.lockss-junit5-bundle}</version>
      <type>pom</type>
      <scope>test</scope>
    </dependency>

## Releases

*   [Tagged releases of `lockss-junit5-bundle` on GitHub](https://github.com/lockss/lockss-pom-bundles/releases) (tags with `lockss-junit5-bundle` in the label)
*   [`lockss-junit5-bundle` artifacts on Maven Central](https://search.maven.org/search?q=g:org.lockss%20AND%20a:lockss-junit5-bundle&core=gav)

## See Also

*   [`lockss-junit4-bundle`](https://github.com/lockss/lockss-pom-bundles/lockss-junit4-bundle): the companion to this project, to introduce a dependency on JUnit 4 in `test` scope, bundled with useful dependencies (until the project can be migrated to JUnit 5)

## Resources

*   [LOCKSS Program website](https://www.lockss.org/)
*   [LOCKSS Program on GitHub](https://github.com/lockss)
*   [LOCKSS Software Pages](https://lockss.github.io/software)
*   [LOCKSS Developer Pages](https://lockss.github.io/developers)
