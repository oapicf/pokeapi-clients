# OpenapiClient::MoveApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**move_list**](MoveApi.md#move_list) | **GET** /api/v2/move/ |  |
| [**move_read**](MoveApi.md#move_read) | **GET** /api/v2/move/{id}/ |  |


## move_list

> String move_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MoveApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.move_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MoveApi->move_list: #{e}"
end
```

#### Using the move_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.move_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling MoveApi->move_list_with_http_info: #{e}"
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


## move_read

> String move_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MoveApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.move_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MoveApi->move_read: #{e}"
end
```

#### Using the move_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.move_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling MoveApi->move_read_with_http_info: #{e}"
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

