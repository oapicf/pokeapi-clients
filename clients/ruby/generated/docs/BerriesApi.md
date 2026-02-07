# PokeApiClient::BerriesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**berry_firmness_list**](BerriesApi.md#berry_firmness_list) | **GET** /api/v2/berry-firmness/ | List berry firmness |
| [**berry_firmness_retrieve**](BerriesApi.md#berry_firmness_retrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness |
| [**berry_flavor_list**](BerriesApi.md#berry_flavor_list) | **GET** /api/v2/berry-flavor/ | List berry flavors |
| [**berry_flavor_retrieve**](BerriesApi.md#berry_flavor_retrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor |
| [**berry_list**](BerriesApi.md#berry_list) | **GET** /api/v2/berry/ | List berries |
| [**berry_retrieve**](BerriesApi.md#berry_retrieve) | **GET** /api/v2/berry/{id}/ | Get a berry |


## berry_firmness_list

> <PaginatedBerryFirmnessSummaryList> berry_firmness_list(opts)

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

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

api_instance = PokeApiClient::BerriesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List berry firmness
  result = api_instance.berry_firmness_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_firmness_list: #{e}"
end
```

#### Using the berry_firmness_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedBerryFirmnessSummaryList>, Integer, Hash)> berry_firmness_list_with_http_info(opts)

```ruby
begin
  # List berry firmness
  data, status_code, headers = api_instance.berry_firmness_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedBerryFirmnessSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_firmness_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedBerryFirmnessSummaryList**](PaginatedBerryFirmnessSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## berry_firmness_retrieve

> <BerryFirmnessDetail> berry_firmness_retrieve(id)

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

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

api_instance = PokeApiClient::BerriesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get berry by firmness
  result = api_instance.berry_firmness_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_firmness_retrieve: #{e}"
end
```

#### Using the berry_firmness_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BerryFirmnessDetail>, Integer, Hash)> berry_firmness_retrieve_with_http_info(id)

```ruby
begin
  # Get berry by firmness
  data, status_code, headers = api_instance.berry_firmness_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BerryFirmnessDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_firmness_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**BerryFirmnessDetail**](BerryFirmnessDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## berry_flavor_list

> <PaginatedBerryFlavorSummaryList> berry_flavor_list(opts)

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

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

api_instance = PokeApiClient::BerriesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List berry flavors
  result = api_instance.berry_flavor_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_flavor_list: #{e}"
end
```

#### Using the berry_flavor_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedBerryFlavorSummaryList>, Integer, Hash)> berry_flavor_list_with_http_info(opts)

```ruby
begin
  # List berry flavors
  data, status_code, headers = api_instance.berry_flavor_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedBerryFlavorSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_flavor_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedBerryFlavorSummaryList**](PaginatedBerryFlavorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## berry_flavor_retrieve

> <BerryFlavorDetail> berry_flavor_retrieve(id)

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

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

api_instance = PokeApiClient::BerriesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get berries by flavor
  result = api_instance.berry_flavor_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_flavor_retrieve: #{e}"
end
```

#### Using the berry_flavor_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BerryFlavorDetail>, Integer, Hash)> berry_flavor_retrieve_with_http_info(id)

```ruby
begin
  # Get berries by flavor
  data, status_code, headers = api_instance.berry_flavor_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BerryFlavorDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_flavor_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**BerryFlavorDetail**](BerryFlavorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## berry_list

> <PaginatedBerrySummaryList> berry_list(opts)

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

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

api_instance = PokeApiClient::BerriesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List berries
  result = api_instance.berry_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_list: #{e}"
end
```

#### Using the berry_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedBerrySummaryList>, Integer, Hash)> berry_list_with_http_info(opts)

```ruby
begin
  # List berries
  data, status_code, headers = api_instance.berry_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedBerrySummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedBerrySummaryList**](PaginatedBerrySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## berry_retrieve

> <BerryDetail> berry_retrieve(id)

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

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

api_instance = PokeApiClient::BerriesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get a berry
  result = api_instance.berry_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_retrieve: #{e}"
end
```

#### Using the berry_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<BerryDetail>, Integer, Hash)> berry_retrieve_with_http_info(id)

```ruby
begin
  # Get a berry
  data, status_code, headers = api_instance.berry_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <BerryDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling BerriesApi->berry_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**BerryDetail**](BerryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

