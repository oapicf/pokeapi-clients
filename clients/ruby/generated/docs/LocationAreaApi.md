# OpenapiClient::LocationAreaApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**location_area_list**](LocationAreaApi.md#location_area_list) | **GET** /api/v2/location-area/ |  |
| [**location_area_read**](LocationAreaApi.md#location_area_read) | **GET** /api/v2/location-area/{id}/ |  |


## location_area_list

> String location_area_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::LocationAreaApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.location_area_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling LocationAreaApi->location_area_list: #{e}"
end
```

#### Using the location_area_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> location_area_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.location_area_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling LocationAreaApi->location_area_list_with_http_info: #{e}"
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


## location_area_read

> String location_area_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::LocationAreaApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.location_area_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling LocationAreaApi->location_area_read: #{e}"
end
```

#### Using the location_area_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> location_area_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.location_area_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling LocationAreaApi->location_area_read_with_http_info: #{e}"
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

