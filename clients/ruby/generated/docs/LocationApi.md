# OpenapiClient::LocationApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**location_list**](LocationApi.md#location_list) | **GET** /api/v2/location/ |  |
| [**location_read**](LocationApi.md#location_read) | **GET** /api/v2/location/{id}/ |  |


## location_list

> String location_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::LocationApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.location_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling LocationApi->location_list: #{e}"
end
```

#### Using the location_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> location_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.location_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling LocationApi->location_list_with_http_info: #{e}"
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


## location_read

> String location_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::LocationApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.location_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling LocationApi->location_read: #{e}"
end
```

#### Using the location_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> location_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.location_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling LocationApi->location_read_with_http_info: #{e}"
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

