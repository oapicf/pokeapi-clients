<img align="right" src="https://raw.github.com/oapicf/pokeapi-clients/main/avatar.jpg" alt="Avatar"/>

[![Build Status](https://github.com/oapicf/pokeapi-clients/actions/workflows/ci-workflow.yaml/badge.svg)](https://github.com/oapicf/pokeapi-clients/actions/workflows/ci-workflow.yaml)
<br/>

PokéAPI Clients
---------------

PokéAPI Clients is a set of generated API clients for [Poké API](https://www.pokeapi.co/) from an OpenAPI v3 specification.

Credit goes to [Niccolò Maltoni](https://github.com/NiccoMlt) for building [the baseline version of PokéAPI specification](https://gist.github.com/NiccoMlt/073b18934a6001fc5a2414c590e3b8ba) which was used by PokéAPI Clients up to version 1.2.0 .

Starting from PokéAPI Clients 2.0.0, we've started using the [official OpenAPI specification from PokéAPI project](https://github.com/PokeAPI/pokeapi/blob/master/openapi.yml).

The API clients are generated using [OpenAPI Generator](https://openapi-generator.tech/).

Published packages
------------------

| Language | Package | Status | Documentation |
|----------|---------|--------|---------------|
| JavaScript | [pokeapi-client]((http://www.npmjs.com/package/pokeapi-client)) | [![Published Version](https://img.shields.io/npm/v/pokeapi-client.svg)](http://www.npmjs.com/package/pokeapi-client) | [README](https://github.com/oapicf/pokeapi-client/blob/main/clients/javascript/generated/README.md) |
| Python | [pokeapiclient]((https://pypi.python.org/pypi/pokeapiclient)) | [![Published Version](https://img.shields.io/pypi/v/pokeapiclient.svg)](https://pypi.python.org/pypi/pokeapiclient) | [README](https://github.com/oapicf/pokeapi-client/blob/main/clients/python/generated/README.md) |
| Ruby | [pokeapi_client]((https://rubygems.org/gems/pokeapi_client)) | [![Published Version](https://img.shields.io/gem/v/pokeapi_client.svg)](https://rubygems.org/gems/pokeapi_client) | [README](https://github.com/oapicf/pokeapi-client/blob/main/clients/ruby/generated/README.md) |

Version matrix
--------------

Note: Version 0.9.0 returns response as String since the specification does not yet include any response schema.

| PokéAPI Clients Version | PokéAPI OpenAPI Spec Version | OpenAPI Version | OpenAPI Generator Version |
|-------------------------|------------------------------|-----------------|---------------------------|
| 2.0.0 | 2.9.0 | 3.1.0 | 7.18.0 |
| 1.2.0 | 20220523 | 3.0.0 | 7.18.0 |
| 1.1.0 | 20220523 | 3.0.0 | 7.6.0 |
| 1.0.0 | 20220523 | 3.0.0 | 7.4.0 |
| 0.10.0 | 20220523 | 3.0.0 | 6.0.1 |
| 0.9.1 | 20220523 | 3.0.0 | 5.4.0 |

Installation
------------

You can either use the generated clients from `clients/<lang>/generated/` directory.

Or you can use the published packages like below:

Install JavaScript client:

    npm install pokeapi-client

Install Python client:

    pip install pokeapiclient

Install Ruby client:

    gem install pokeapi_client

Colophon
--------

* [API Documentation](https://oapicf.github.io/pokeapi-clients/api/latest/)
