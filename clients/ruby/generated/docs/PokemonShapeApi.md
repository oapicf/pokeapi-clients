# PokeApiClient::PokemonShapeApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**pokemon_shape_list**](PokemonShapeApi.md#pokemon_shape_list) | **GET** /api/v2/pokemon-shape/ |  |
| [**pokemon_shape_read**](PokemonShapeApi.md#pokemon_shape_read) | **GET** /api/v2/pokemon-shape/{id}/ |  |


## pokemon_shape_list

> String pokemon_shape_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::PokemonShapeApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.pokemon_shape_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonShapeApi->pokemon_shape_list: #{e}"
end
```

#### Using the pokemon_shape_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokemon_shape_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.pokemon_shape_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonShapeApi->pokemon_shape_list_with_http_info: #{e}"
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


## pokemon_shape_read

> String pokemon_shape_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::PokemonShapeApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.pokemon_shape_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonShapeApi->pokemon_shape_read: #{e}"
end
```

#### Using the pokemon_shape_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokemon_shape_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.pokemon_shape_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonShapeApi->pokemon_shape_read_with_http_info: #{e}"
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

