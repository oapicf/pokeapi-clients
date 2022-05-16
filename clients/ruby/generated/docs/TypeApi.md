# PokeApiClient::TypeApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**type_list**](TypeApi.md#type_list) | **GET** /api/v2/type/ |  |
| [**type_read**](TypeApi.md#type_read) | **GET** /api/v2/type/{id}/ |  |


## type_list

> String type_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::TypeApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.type_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling TypeApi->type_list: #{e}"
end
```

#### Using the type_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> type_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.type_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling TypeApi->type_list_with_http_info: #{e}"
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


## type_read

> String type_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::TypeApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.type_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling TypeApi->type_read: #{e}"
end
```

#### Using the type_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> type_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.type_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling TypeApi->type_read_with_http_info: #{e}"
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

