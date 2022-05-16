# OpenapiClient::MoveAilmentApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**move_ailment_list**](MoveAilmentApi.md#move_ailment_list) | **GET** /api/v2/move-ailment/ |  |
| [**move_ailment_read**](MoveAilmentApi.md#move_ailment_read) | **GET** /api/v2/move-ailment/{id}/ |  |


## move_ailment_list

> String move_ailment_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MoveAilmentApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.move_ailment_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MoveAilmentApi->move_ailment_list: #{e}"
end
```

#### Using the move_ailment_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_ailment_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.move_ailment_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling MoveAilmentApi->move_ailment_list_with_http_info: #{e}"
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


## move_ailment_read

> String move_ailment_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::MoveAilmentApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.move_ailment_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling MoveAilmentApi->move_ailment_read: #{e}"
end
```

#### Using the move_ailment_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_ailment_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.move_ailment_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling MoveAilmentApi->move_ailment_read_with_http_info: #{e}"
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

