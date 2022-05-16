# OpenapiClient::PokedexApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**pokedex_list**](PokedexApi.md#pokedex_list) | **GET** /api/v2/pokedex/ |  |
| [**pokedex_read**](PokedexApi.md#pokedex_read) | **GET** /api/v2/pokedex/{id}/ |  |


## pokedex_list

> String pokedex_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::PokedexApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.pokedex_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokedexApi->pokedex_list: #{e}"
end
```

#### Using the pokedex_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokedex_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.pokedex_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokedexApi->pokedex_list_with_http_info: #{e}"
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


## pokedex_read

> String pokedex_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::PokedexApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.pokedex_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokedexApi->pokedex_read: #{e}"
end
```

#### Using the pokedex_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pokedex_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.pokedex_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling PokedexApi->pokedex_read_with_http_info: #{e}"
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

