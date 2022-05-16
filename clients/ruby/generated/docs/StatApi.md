# OpenapiClient::StatApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**stat_list**](StatApi.md#stat_list) | **GET** /api/v2/stat/ |  |
| [**stat_read**](StatApi.md#stat_read) | **GET** /api/v2/stat/{id}/ |  |


## stat_list

> String stat_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StatApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.stat_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StatApi->stat_list: #{e}"
end
```

#### Using the stat_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> stat_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.stat_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling StatApi->stat_list_with_http_info: #{e}"
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


## stat_read

> String stat_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::StatApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.stat_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StatApi->stat_read: #{e}"
end
```

#### Using the stat_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> stat_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.stat_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling StatApi->stat_read_with_http_info: #{e}"
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

