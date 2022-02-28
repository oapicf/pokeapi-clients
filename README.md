<img align="right" src="https://raw.github.com/cliffano/pokeapi-client/master/avatar.jpg" alt="Avatar"/>

[![Build Status](https://github.com/cliffano/pokeapi-client/actions/workflows/ci-workflow.yaml/badge.svg)](https://github.com/cliffano/pokeapi-client/actions/workflows/ci-workflow.yaml)
<br/>

PokéAPI Clients
---------------

PokéAPI Clients is a set of generated API clients for [Poké API](https://www.pokeapi.co/) from an OpenAPI v3 specification.

The API clients are generated using [OpenAPI Generator](https://openapi-generator.tech/).

Published packages
------------------

| Language | Package | Status |
|----------|---------|--------|
| JavaScript | [pokeapi-client]((http://www.npmjs.com/package/pokeapi-client)) | [![Published Version](https://img.shields.io/npm/v/pokeapi-client.svg)](http://www.npmjs.com/package/pokeapi-client) |
| Python | [pokeapiclient]((https://pypi.python.org/pypi/pokeapiclient)) | [![Published Version](https://img.shields.io/pypi/v/pokeapiclient.svg)](https://pypi.python.org/pypi/pokeapiclient) |
| Ruby | [pokeapi_client]((https://rubygems.org/gems/pokeapi_client)) | [![Published Version](https://img.shields.io/gem/v/pokeapi_client.svg)](https://rubygems.org/gems/pokeapi_client) |

Version Matrix
--------------

| PokéAPI Clients Version | OpenAPI Version | OpenAPI Generator Version |
|-------------------------|-----------------|---------------------------|
| 1.0.0 | 3.0.0 | 5.4.0 |

Usage
-----

Generate API clients of the currently supported languages:

    make generate GEN_BASE_DIR=<path/to/pokeapi-client>

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

* [API Documentation](http://cliffano.github.io/pokeapi-client/api/latest/)
