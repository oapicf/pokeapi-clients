# PokeApiClient::GenerationApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**generation_list**](GenerationApi.md#generation_list) | **GET** /api/v2/generation/ |  |
| [**generation_read**](GenerationApi.md#generation_read) | **GET** /api/v2/generation/{id}/ |  |


## generation_list

> String generation_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::GenerationApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.generation_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GenerationApi->generation_list: #{e}"
end
```

#### Using the generation_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> generation_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.generation_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling GenerationApi->generation_list_with_http_info: #{e}"
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


## generation_read

> String generation_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::GenerationApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.generation_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GenerationApi->generation_read: #{e}"
end
```

#### Using the generation_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> generation_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.generation_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling GenerationApi->generation_read_with_http_info: #{e}"
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

