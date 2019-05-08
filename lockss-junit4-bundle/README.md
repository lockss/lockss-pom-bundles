# `lockss-junit4-bundle`

This project defines a single Maven POM file that can be used to introduce a dependency on JUnit 4 in `test` scope, bundled with useful dependencies (until the project can be migrated to JUnit 5):

*   Hamcrest (`hamcrest-library`)

## Using

    <dependency>
      <groupId>org.lockss</groupId>
      <artifactId>lockss-junit4-bundle</artifactId>
      <version>${version.of.lockss-junit4-bundle}</version>
      <type>pom</type>
      <scope>test</scope>
    </dependency>

## Releases

*   [Tagged releases of `lockss-junit4-bundle` on GitHub](https://github.com/lockss/lockss-pom-bundles/releases) (tags with `lockss-junit4-bundle` in the label)
*   [`lockss-junit4-bundle` artifacts on Maven Central](https://search.maven.org/search?q=g:org.lockss%20AND%20a:lockss-junit4-bundle&core=gav)

## See Also

*   [`lockss-junit5-bundle`](https://github.com/lockss/lockss-pom-bundles/lockss-junit4-bundle): the companion to this project, to introduce a dependency on JUnit 4 in `test` scope, bundled with useful dependencies

## Resources

*   [LOCKSS Program website](https://www.lockss.org/)
*   [LOCKSS Program on GitHub](https://github.com/lockss)
*   [LOCKSS Software Pages](https://lockss.github.io/software)
*   [LOCKSS Developer Pages](https://lockss.github.io/developers)
