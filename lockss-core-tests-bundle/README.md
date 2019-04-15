# `lockss-core-tests-bundle`

This project defines a single Maven POM file that can be used to introduce a dependency on [`lockss-core`](https://github.com/lockss/lockss-core)'s `tests` artifact in `test` scope with useful dependency exclusions when necessary.

The version of `lockss-core-tests-bundle` corresponds to a matching version of `lockss-core`.

## Using

        <dependency>
          <groupId>org.lockss</groupId>
          <artifactId>lockss-core-tests-bundle</artifactId>
          <version>${version.of.lockss-core-tests-bundle}</version>
          <type>pom</type>
          <scope>tests</scope>
        </dependency>

## Releases

*   [Tagged releases of `lockss-core-tests-bundle` on GitHub](https://github.com/lockss/lockss-pom-bundles/releases) (tags with `lockss-core-tests-bundle` in the label)
*   [`lockss-core-tests-bundle` artifacts on Maven Central](https://search.maven.org/search?q=g:org.lockss%20AND%20a:lockss-core-tests-bundle&core=gav)

## See Also

*   [`lockss-core`](https://github.com/lockss/lockss-core): LOCKSS Core Functionality Library
*   [`lockss-core-bundle`](https://github.com/lockss/lockss-pom-bundles/lockss-core-bundle): the companion to this project, for depending on `lockss-core` with useful dependency exclusions when necessary

## Resources

*   [LOCKSS Program website](https://www.lockss.org/)
*   [LOCKSS Program on GitHub](https://github.com/lockss)
*   [LOCKSS Software Pages](https://lockss.github.io/software)
*   [LOCKSS Developer Pages](https://lockss.github.io/developers)
