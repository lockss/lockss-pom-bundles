# `lockss-core-bundle`

This project defines a single Maven POM file that can be used to introduce a dependency on [`lockss-core`](https://github.com/lockss/lockss-core) with useful dependency exclusions when necessary.

The version of `lockss-core-bundle` corresponds to a matching version of `lockss-core`.

## Using

        <dependency>
          <groupId>org.lockss</groupId>
          <artifactId>lockss-core-bundle</artifactId>
          <version>${version.of.lockss-core-bundle}</version>
          <type>pom</type>
        </dependency>

## Releases

*   [Tagged releases of `lockss-core-bundle` on GitHub](https://github.com/lockss/lockss-pom-bundles/lockss-pom-bundles/releases) (tags with `lockss-core-bundle` in the label)
*   [`lockss-core-bundle` artifacts on Maven Central](https://search.maven.org/search?q=g:org.lockss%20AND%20a:lockss-core-bundle&core=gav)

## See Also

*   [`lockss-core`](https://github.com/lockss/lockss-core): LOCKSS Core Functionality Library
*   [`lockss-core-tests-bundle`](https://github.com/lockss/lockss-core-tests-bundle): the companion to this project, for depending on `lockss-core`'s `tests` artifact in `test` scope with useful dependency exclusions when necessary

## Resources

*   [LOCKSS Program website](https://www.lockss.org/)
*   [LOCKSS Program on GitHub](https://github.com/lockss)
*   [LOCKSS Software Pages](https://lockss.github.io/software)
*   [LOCKSS Developer Pages](https://lockss.github.io/developers)
