# Changelog
All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## 2.1.0 - 2026-08-30
### Added
- Add examples
- Add new generators: aspnet-fastendpoints, cpp-boost-beast-client, cpp-httplib-server, cpp-oatpp-client, cpp-oatpp-server, cpp-restbed-server-deprecated, csharp-functions, gdscript, java-dubbo, java-helidon-client, java-helidon-server, java-microprofile, java-wiremock, jetbrains-http-client, julia-client, julia-server, kotlin-misk, kotlin-wiremock, n4js, php-flight, php-nextgen, postgresql-schema, postman-collection, python-pydantic-v1, ruby-nextgen, rust-salvo, rust-server-deprecated, scala-cask, scala-http4s-server, scala-http4s, scala-pekko, scala-sttp4-jsoniter, scala-sttp4, swift-combine, swift6, terraform-provider, typescript-nestjs-server

### Changed
- Upgrade Swaggy C to 6.6.0
- Upgrade OpenAPI Generator to 7.24.0

### Fixed
- Fix Python generation error due to Pydantic incompat with nullable
- Fix Ruby generation error due to lengthy names

## 2.0.0 - 2026-02-07
### Added
- Add x-init-spec with removal of Pokemon Encounters to avoid generating class and doc longer than 100 chars [#4]

### Changed
- Switch OpenAPI specification to official one from PokeAPI

### Removed
- Remove pokemon encounters endpoint which generates files with names > 100 chars [#4]

### Fixed
- Fix empty type fields which cause Python generator error [#5]

## 1.2.0 - 2026-01-25
### Added
- Add Ruby test

### Changed
- Switch release GH Actions to use cliffano/release-action
- Upgrade Swaggy C to 5.1.0
- Upgrade OpenAPI Generator to 7.18.0

## 1.1.0 - 2024-07-09
### Changed
- Upgrade Swaggy C to 4.5.0
- Upgrade OpenAPI Generator to 7.6.0

## 1.0.0 - 2024-03-15
### Changed
- Handover repo to OpenAPI Clients Factory project
- Upgrade Swaggy C to 4.3.0
- Upgrade OpenAPI Generator to 7.4.0

## 0.10.0 - 2022-08-17
### Changed
- Switch build system to use Swaggy C
- Upgrade OpenAPI Generator to 6.0.1

## 0.9.1 - 2022-05-24
### Fixed
- Fix missing generated source

## 0.9.0 - 2022-05-23
### Added
- Initial version
