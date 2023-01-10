# snomed-scg

SNOMED CT Compositional Grammar Implementation with IDE integration(s), user interface using Xtext.

[![build status](https://img.shields.io/github/actions/workflow/status/b2ihealthcare/snomed-scg/maven.yml?branch=main&style=flat-square)](https://github.com/b2ihealthcare/snomed-scg/actions)
[![latest release](https://img.shields.io/github/tag/b2ihealthcare/snomed-scg.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-scg/releases/tag/v2.3.0)
[![GitHub](https://img.shields.io/github/license/b2ihealthcare/snomed-scg.svg?style=flat-square)](https://github.com/b2ihealthcare/snomed-scg/blob/main/LICENSE)

# Documentation

See the official documentation [here](http://snomed.org/scg)

# Supported versions

* 2.3.1 - https://github.com/b2ihealthcare/snomed-scg/releases/tag/v2.3.1

# Building from source

SNOMED CT SCG uses Maven for its build system. In order to run the build and create a p2 update site and the maven packages simply run the following command in the cloned directory. 

    ./mvnw clean package

The packages can be found in the `com.b2international.snomed.scg.update/target` folder, when the build is complete.

To run the test cases, use the following command:

    ./mvnw clean verify

# Contributing

Please see [CONTRIBUTING.md](CONTRIBUTING.md) for details.

# Versioning

Our [releases](https://github.com/b2ihealthcare/snomed-scg/releases) use [semantic versioning](http://semver.org). You can find a chronologically ordered list of notable changes in [CHANGELOG.md](CHANGELOG.md).
