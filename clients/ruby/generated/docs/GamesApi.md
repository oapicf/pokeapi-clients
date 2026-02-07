# PokeApiClient::GamesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**generation_list**](GamesApi.md#generation_list) | **GET** /api/v2/generation/ | List genrations |
| [**generation_retrieve**](GamesApi.md#generation_retrieve) | **GET** /api/v2/generation/{id}/ | Get genration |
| [**pokedex_list**](GamesApi.md#pokedex_list) | **GET** /api/v2/pokedex/ | List pokedex |
| [**pokedex_retrieve**](GamesApi.md#pokedex_retrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex |
| [**version_group_list**](GamesApi.md#version_group_list) | **GET** /api/v2/version-group/ | List version groups |
| [**version_group_retrieve**](GamesApi.md#version_group_retrieve) | **GET** /api/v2/version-group/{id}/ | Get version group |
| [**version_list**](GamesApi.md#version_list) | **GET** /api/v2/version/ | List versions |
| [**version_retrieve**](GamesApi.md#version_retrieve) | **GET** /api/v2/version/{id}/ | Get version |


## generation_list

> <PaginatedGenerationSummaryList> generation_list(opts)

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Examples

```ruby
require 'time'
require 'pokeapi_client'
# setup authorization
PokeApiClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: cookieAuth
  config.api_key['sessionid'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['sessionid'] = 'Bearer'
end

api_instance = PokeApiClient::GamesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List genrations
  result = api_instance.generation_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->generation_list: #{e}"
end
```

#### Using the generation_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedGenerationSummaryList>, Integer, Hash)> generation_list_with_http_info(opts)

```ruby
begin
  # List genrations
  data, status_code, headers = api_instance.generation_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedGenerationSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->generation_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedGenerationSummaryList**](PaginatedGenerationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## generation_retrieve

> <GenerationDetail> generation_retrieve(id)

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Examples

```ruby
require 'time'
require 'pokeapi_client'
# setup authorization
PokeApiClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: cookieAuth
  config.api_key['sessionid'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['sessionid'] = 'Bearer'
end

api_instance = PokeApiClient::GamesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get genration
  result = api_instance.generation_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->generation_retrieve: #{e}"
end
```

#### Using the generation_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerationDetail>, Integer, Hash)> generation_retrieve_with_http_info(id)

```ruby
begin
  # Get genration
  data, status_code, headers = api_instance.generation_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerationDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->generation_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**GenerationDetail**](GenerationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokedex_list

> <PaginatedPokedexSummaryList> pokedex_list(opts)

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Examples

```ruby
require 'time'
require 'pokeapi_client'
# setup authorization
PokeApiClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: cookieAuth
  config.api_key['sessionid'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['sessionid'] = 'Bearer'
end

api_instance = PokeApiClient::GamesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List pokedex
  result = api_instance.pokedex_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->pokedex_list: #{e}"
end
```

#### Using the pokedex_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedPokedexSummaryList>, Integer, Hash)> pokedex_list_with_http_info(opts)

```ruby
begin
  # List pokedex
  data, status_code, headers = api_instance.pokedex_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedPokedexSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->pokedex_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedPokedexSummaryList**](PaginatedPokedexSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokedex_retrieve

> <PokedexDetail> pokedex_retrieve(id)

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Examples

```ruby
require 'time'
require 'pokeapi_client'
# setup authorization
PokeApiClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: cookieAuth
  config.api_key['sessionid'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['sessionid'] = 'Bearer'
end

api_instance = PokeApiClient::GamesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get pokedex
  result = api_instance.pokedex_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->pokedex_retrieve: #{e}"
end
```

#### Using the pokedex_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PokedexDetail>, Integer, Hash)> pokedex_retrieve_with_http_info(id)

```ruby
begin
  # Get pokedex
  data, status_code, headers = api_instance.pokedex_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PokedexDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->pokedex_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**PokedexDetail**](PokedexDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## version_group_list

> <PaginatedVersionGroupSummaryList> version_group_list(opts)

List version groups

Version groups categorize highly similar versions of the games.

### Examples

```ruby
require 'time'
require 'pokeapi_client'
# setup authorization
PokeApiClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: cookieAuth
  config.api_key['sessionid'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['sessionid'] = 'Bearer'
end

api_instance = PokeApiClient::GamesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List version groups
  result = api_instance.version_group_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->version_group_list: #{e}"
end
```

#### Using the version_group_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedVersionGroupSummaryList>, Integer, Hash)> version_group_list_with_http_info(opts)

```ruby
begin
  # List version groups
  data, status_code, headers = api_instance.version_group_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedVersionGroupSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->version_group_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedVersionGroupSummaryList**](PaginatedVersionGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## version_group_retrieve

> <VersionGroupDetail> version_group_retrieve(id)

Get version group

Version groups categorize highly similar versions of the games.

### Examples

```ruby
require 'time'
require 'pokeapi_client'
# setup authorization
PokeApiClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: cookieAuth
  config.api_key['sessionid'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['sessionid'] = 'Bearer'
end

api_instance = PokeApiClient::GamesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get version group
  result = api_instance.version_group_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->version_group_retrieve: #{e}"
end
```

#### Using the version_group_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<VersionGroupDetail>, Integer, Hash)> version_group_retrieve_with_http_info(id)

```ruby
begin
  # Get version group
  data, status_code, headers = api_instance.version_group_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <VersionGroupDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->version_group_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**VersionGroupDetail**](VersionGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## version_list

> <PaginatedVersionSummaryList> version_list(opts)

List versions

Versions of the games, e.g., Red, Blue or Yellow.

### Examples

```ruby
require 'time'
require 'pokeapi_client'
# setup authorization
PokeApiClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: cookieAuth
  config.api_key['sessionid'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['sessionid'] = 'Bearer'
end

api_instance = PokeApiClient::GamesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List versions
  result = api_instance.version_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->version_list: #{e}"
end
```

#### Using the version_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedVersionSummaryList>, Integer, Hash)> version_list_with_http_info(opts)

```ruby
begin
  # List versions
  data, status_code, headers = api_instance.version_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedVersionSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->version_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedVersionSummaryList**](PaginatedVersionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## version_retrieve

> <VersionDetail> version_retrieve(id)

Get version

Versions of the games, e.g., Red, Blue or Yellow.

### Examples

```ruby
require 'time'
require 'pokeapi_client'
# setup authorization
PokeApiClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: cookieAuth
  config.api_key['sessionid'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['sessionid'] = 'Bearer'
end

api_instance = PokeApiClient::GamesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get version
  result = api_instance.version_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->version_retrieve: #{e}"
end
```

#### Using the version_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<VersionDetail>, Integer, Hash)> version_retrieve_with_http_info(id)

```ruby
begin
  # Get version
  data, status_code, headers = api_instance.version_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <VersionDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling GamesApi->version_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**VersionDetail**](VersionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

