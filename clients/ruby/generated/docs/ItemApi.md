# OpenapiClient::ItemApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**item_list**](ItemApi.md#item_list) | **GET** /api/v2/item/ |  |
| [**item_read**](ItemApi.md#item_read) | **GET** /api/v2/item/{id}/ |  |


## item_list

> String item_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ItemApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.item_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ItemApi->item_list: #{e}"
end
```

#### Using the item_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> item_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.item_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling ItemApi->item_list_with_http_info: #{e}"
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


## item_read

> String item_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::ItemApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.item_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ItemApi->item_read: #{e}"
end
```

#### Using the item_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> item_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.item_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling ItemApi->item_read_with_http_info: #{e}"
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

