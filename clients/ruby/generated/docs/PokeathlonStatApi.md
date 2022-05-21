# PokeApiClient::PokeathlonStatApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**pokeathlon_stat_list**](PokeathlonStatApi.md#pokeathlon_stat_list) | **GET** /api/v2/pokeathlon-stat/ |  |
| [**pokeathlon_stat_read**](PokeathlonStatApi.md#pokeathlon_stat_read) | **GET** /api/v2/pokeathlon-stat/{id}/ |  |


## pokeathlon_stat_list

> String pokeathlon_stat_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::PokeathlonStatApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.pokeathlon_stat_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokeathlonStatApi->pokeathlon_stat_list: #{e}"
end
```

#### Using the pokeathlon_stat_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokeathlon_stat_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.pokeathlon_stat_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokeathlonStatApi->pokeathlon_stat_list_with_http_info: #{e}"
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


## pokeathlon_stat_read

> String pokeathlon_stat_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::PokeathlonStatApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.pokeathlon_stat_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokeathlonStatApi->pokeathlon_stat_read: #{e}"
end
```

#### Using the pokeathlon_stat_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokeathlon_stat_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.pokeathlon_stat_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokeathlonStatApi->pokeathlon_stat_read_with_http_info: #{e}"
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

