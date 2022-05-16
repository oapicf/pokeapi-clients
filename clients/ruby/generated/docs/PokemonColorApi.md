# OpenapiClient::PokemonColorApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**pokemon_color_list**](PokemonColorApi.md#pokemon_color_list) | **GET** /api/v2/pokemon-color/ |  |
| [**pokemon_color_read**](PokemonColorApi.md#pokemon_color_read) | **GET** /api/v2/pokemon-color/{id}/ |  |


## pokemon_color_list

> String pokemon_color_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::PokemonColorApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.pokemon_color_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonColorApi->pokemon_color_list: #{e}"
end
```

#### Using the pokemon_color_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokemon_color_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.pokemon_color_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonColorApi->pokemon_color_list_with_http_info: #{e}"
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


## pokemon_color_read

> String pokemon_color_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::PokemonColorApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.pokemon_color_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonColorApi->pokemon_color_read: #{e}"
end
```

#### Using the pokemon_color_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokemon_color_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.pokemon_color_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonColorApi->pokemon_color_read_with_http_info: #{e}"
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

