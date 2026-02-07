# PokeApiClient::EncountersApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**encounter_condition_list**](EncountersApi.md#encounter_condition_list) | **GET** /api/v2/encounter-condition/ | List encounter conditions |
| [**encounter_condition_retrieve**](EncountersApi.md#encounter_condition_retrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition |
| [**encounter_condition_value_list**](EncountersApi.md#encounter_condition_value_list) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values |
| [**encounter_condition_value_retrieve**](EncountersApi.md#encounter_condition_value_retrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value |
| [**encounter_method_list**](EncountersApi.md#encounter_method_list) | **GET** /api/v2/encounter-method/ | List encounter methods |
| [**encounter_method_retrieve**](EncountersApi.md#encounter_method_retrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method |


## encounter_condition_list

> <PaginatedEncounterConditionSummaryList> encounter_condition_list(opts)

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

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

api_instance = PokeApiClient::EncountersApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List encounter conditions
  result = api_instance.encounter_condition_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_condition_list: #{e}"
end
```

#### Using the encounter_condition_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedEncounterConditionSummaryList>, Integer, Hash)> encounter_condition_list_with_http_info(opts)

```ruby
begin
  # List encounter conditions
  data, status_code, headers = api_instance.encounter_condition_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedEncounterConditionSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_condition_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedEncounterConditionSummaryList**](PaginatedEncounterConditionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## encounter_condition_retrieve

> <EncounterConditionDetail> encounter_condition_retrieve(id)

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

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

api_instance = PokeApiClient::EncountersApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get encounter condition
  result = api_instance.encounter_condition_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_condition_retrieve: #{e}"
end
```

#### Using the encounter_condition_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EncounterConditionDetail>, Integer, Hash)> encounter_condition_retrieve_with_http_info(id)

```ruby
begin
  # Get encounter condition
  data, status_code, headers = api_instance.encounter_condition_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EncounterConditionDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_condition_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**EncounterConditionDetail**](EncounterConditionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## encounter_condition_value_list

> <PaginatedEncounterConditionValueSummaryList> encounter_condition_value_list(opts)

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

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

api_instance = PokeApiClient::EncountersApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List encounter condition values
  result = api_instance.encounter_condition_value_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_condition_value_list: #{e}"
end
```

#### Using the encounter_condition_value_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedEncounterConditionValueSummaryList>, Integer, Hash)> encounter_condition_value_list_with_http_info(opts)

```ruby
begin
  # List encounter condition values
  data, status_code, headers = api_instance.encounter_condition_value_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedEncounterConditionValueSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_condition_value_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedEncounterConditionValueSummaryList**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## encounter_condition_value_retrieve

> <EncounterConditionValueDetail> encounter_condition_value_retrieve(id)

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

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

api_instance = PokeApiClient::EncountersApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get encounter condition value
  result = api_instance.encounter_condition_value_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_condition_value_retrieve: #{e}"
end
```

#### Using the encounter_condition_value_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EncounterConditionValueDetail>, Integer, Hash)> encounter_condition_value_retrieve_with_http_info(id)

```ruby
begin
  # Get encounter condition value
  data, status_code, headers = api_instance.encounter_condition_value_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EncounterConditionValueDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_condition_value_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**EncounterConditionValueDetail**](EncounterConditionValueDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## encounter_method_list

> <PaginatedEncounterMethodSummaryList> encounter_method_list(opts)

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

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

api_instance = PokeApiClient::EncountersApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List encounter methods
  result = api_instance.encounter_method_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_method_list: #{e}"
end
```

#### Using the encounter_method_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedEncounterMethodSummaryList>, Integer, Hash)> encounter_method_list_with_http_info(opts)

```ruby
begin
  # List encounter methods
  data, status_code, headers = api_instance.encounter_method_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedEncounterMethodSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_method_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedEncounterMethodSummaryList**](PaginatedEncounterMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## encounter_method_retrieve

> <EncounterMethodDetail> encounter_method_retrieve(id)

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

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

api_instance = PokeApiClient::EncountersApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get encounter method
  result = api_instance.encounter_method_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_method_retrieve: #{e}"
end
```

#### Using the encounter_method_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EncounterMethodDetail>, Integer, Hash)> encounter_method_retrieve_with_http_info(id)

```ruby
begin
  # Get encounter method
  data, status_code, headers = api_instance.encounter_method_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EncounterMethodDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncountersApi->encounter_method_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**EncounterMethodDetail**](EncounterMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

