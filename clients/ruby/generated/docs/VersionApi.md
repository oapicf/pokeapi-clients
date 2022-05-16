# OpenapiClient::VersionApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**version_list**](VersionApi.md#version_list) | **GET** /api/v2/version/ |  |
| [**version_read**](VersionApi.md#version_read) | **GET** /api/v2/version/{id}/ |  |


## version_list

> String version_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::VersionApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.version_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling VersionApi->version_list: #{e}"
end
```

#### Using the version_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> version_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.version_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling VersionApi->version_list_with_http_info: #{e}"
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


## version_read

> String version_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::VersionApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.version_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling VersionApi->version_read: #{e}"
end
```

#### Using the version_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> version_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.version_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling VersionApi->version_read_with_http_info: #{e}"
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

