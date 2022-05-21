# PokeApiClient::MoveTargetApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**move_target_list**](MoveTargetApi.md#move_target_list) | **GET** /api/v2/move-target/ |  |
| [**move_target_read**](MoveTargetApi.md#move_target_read) | **GET** /api/v2/move-target/{id}/ |  |


## move_target_list

> String move_target_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MoveTargetApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.move_target_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveTargetApi->move_target_list: #{e}"
end
```

#### Using the move_target_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_target_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.move_target_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveTargetApi->move_target_list_with_http_info: #{e}"
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


## move_target_read

> String move_target_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MoveTargetApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.move_target_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveTargetApi->move_target_read: #{e}"
end
```

#### Using the move_target_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_target_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.move_target_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveTargetApi->move_target_read_with_http_info: #{e}"
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

