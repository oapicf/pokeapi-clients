# OpenapiClient::PokemonApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**pokemon_list**](PokemonApi.md#pokemon_list) | **GET** /api/v2/pokemon/ |  |
| [**pokemon_read**](PokemonApi.md#pokemon_read) | **GET** /api/v2/pokemon/{id}/ |  |


## pokemon_list

> String pokemon_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.pokemon_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_list: #{e}"
end
```

#### Using the pokemon_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokemon_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.pokemon_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_list_with_http_info: #{e}"
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


## pokemon_read

> String pokemon_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::PokemonApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.pokemon_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_read: #{e}"
end
```

#### Using the pokemon_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokemon_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.pokemon_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_read_with_http_info: #{e}"
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

