# OpenapiClient::PokemonHabitatApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**pokemon_habitat_list**](PokemonHabitatApi.md#pokemon_habitat_list) | **GET** /api/v2/pokemon-habitat/ |  |
| [**pokemon_habitat_read**](PokemonHabitatApi.md#pokemon_habitat_read) | **GET** /api/v2/pokemon-habitat/{id}/ |  |


## pokemon_habitat_list

> String pokemon_habitat_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::PokemonHabitatApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.pokemon_habitat_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonHabitatApi->pokemon_habitat_list: #{e}"
end
```

#### Using the pokemon_habitat_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokemon_habitat_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.pokemon_habitat_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonHabitatApi->pokemon_habitat_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** |  | [optional] |
| **offset** | **Integer** |  | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain


## pokemon_habitat_read

> String pokemon_habitat_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::PokemonHabitatApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.pokemon_habitat_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonHabitatApi->pokemon_habitat_read: #{e}"
end
```

#### Using the pokemon_habitat_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokemon_habitat_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.pokemon_habitat_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonHabitatApi->pokemon_habitat_read_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **Integer** |  |  |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: text/plain

