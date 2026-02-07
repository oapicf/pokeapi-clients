# PokeApiClient::LocationApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**location_area_list**](LocationApi.md#location_area_list) | **GET** /api/v2/location-area/ | List location areas |
| [**location_area_retrieve**](LocationApi.md#location_area_retrieve) | **GET** /api/v2/location-area/{id}/ | Get location area |
| [**location_list**](LocationApi.md#location_list) | **GET** /api/v2/location/ | List locations |
| [**location_retrieve**](LocationApi.md#location_retrieve) | **GET** /api/v2/location/{id}/ | Get location |
| [**pal_park_area_list**](LocationApi.md#pal_park_area_list) | **GET** /api/v2/pal-park-area/ | List pal park areas |
| [**pal_park_area_retrieve**](LocationApi.md#pal_park_area_retrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area |
| [**region_list**](LocationApi.md#region_list) | **GET** /api/v2/region/ | List regions |
| [**region_retrieve**](LocationApi.md#region_retrieve) | **GET** /api/v2/region/{id}/ | Get region |


## location_area_list

> <PaginatedLocationAreaSummaryList> location_area_list(opts)

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

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

api_instance = PokeApiClient::LocationApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56 # Integer | The initial index from which to return the results.
}

begin
  # List location areas
  result = api_instance.location_area_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->location_area_list: #{e}"
end
```

#### Using the location_area_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedLocationAreaSummaryList>, Integer, Hash)> location_area_list_with_http_info(opts)

```ruby
begin
  # List location areas
  data, status_code, headers = api_instance.location_area_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedLocationAreaSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->location_area_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |

### Return type

[**PaginatedLocationAreaSummaryList**](PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## location_area_retrieve

> <LocationAreaDetail> location_area_retrieve(id)

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

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

api_instance = PokeApiClient::LocationApi.new
id = 56 # Integer | A unique integer value identifying this location area.

begin
  # Get location area
  result = api_instance.location_area_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->location_area_retrieve: #{e}"
end
```

#### Using the location_area_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LocationAreaDetail>, Integer, Hash)> location_area_retrieve_with_http_info(id)

```ruby
begin
  # Get location area
  data, status_code, headers = api_instance.location_area_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LocationAreaDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->location_area_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** | A unique integer value identifying this location area. |  |

### Return type

[**LocationAreaDetail**](LocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## location_list

> <PaginatedLocationSummaryList> location_list(opts)

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

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

api_instance = PokeApiClient::LocationApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List locations
  result = api_instance.location_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->location_list: #{e}"
end
```

#### Using the location_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedLocationSummaryList>, Integer, Hash)> location_list_with_http_info(opts)

```ruby
begin
  # List locations
  data, status_code, headers = api_instance.location_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedLocationSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->location_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedLocationSummaryList**](PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## location_retrieve

> <LocationDetail> location_retrieve(id)

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

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

api_instance = PokeApiClient::LocationApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get location
  result = api_instance.location_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->location_retrieve: #{e}"
end
```

#### Using the location_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LocationDetail>, Integer, Hash)> location_retrieve_with_http_info(id)

```ruby
begin
  # Get location
  data, status_code, headers = api_instance.location_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LocationDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->location_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**LocationDetail**](LocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pal_park_area_list

> <PaginatedPalParkAreaSummaryList> pal_park_area_list(opts)

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

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

api_instance = PokeApiClient::LocationApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List pal park areas
  result = api_instance.pal_park_area_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->pal_park_area_list: #{e}"
end
```

#### Using the pal_park_area_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedPalParkAreaSummaryList>, Integer, Hash)> pal_park_area_list_with_http_info(opts)

```ruby
begin
  # List pal park areas
  data, status_code, headers = api_instance.pal_park_area_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedPalParkAreaSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->pal_park_area_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedPalParkAreaSummaryList**](PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pal_park_area_retrieve

> <PalParkAreaDetail> pal_park_area_retrieve(id)

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

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

api_instance = PokeApiClient::LocationApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get pal park area
  result = api_instance.pal_park_area_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->pal_park_area_retrieve: #{e}"
end
```

#### Using the pal_park_area_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PalParkAreaDetail>, Integer, Hash)> pal_park_area_retrieve_with_http_info(id)

```ruby
begin
  # Get pal park area
  data, status_code, headers = api_instance.pal_park_area_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PalParkAreaDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->pal_park_area_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**PalParkAreaDetail**](PalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## region_list

> <PaginatedRegionSummaryList> region_list(opts)

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

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

api_instance = PokeApiClient::LocationApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List regions
  result = api_instance.region_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->region_list: #{e}"
end
```

#### Using the region_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedRegionSummaryList>, Integer, Hash)> region_list_with_http_info(opts)

```ruby
begin
  # List regions
  data, status_code, headers = api_instance.region_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedRegionSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->region_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedRegionSummaryList**](PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## region_retrieve

> <RegionDetail> region_retrieve(id)

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

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

api_instance = PokeApiClient::LocationApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get region
  result = api_instance.region_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->region_retrieve: #{e}"
end
```

#### Using the region_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<RegionDetail>, Integer, Hash)> region_retrieve_with_http_info(id)

```ruby
begin
  # Get region
  data, status_code, headers = api_instance.region_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <RegionDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling LocationApi->region_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**RegionDetail**](RegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

