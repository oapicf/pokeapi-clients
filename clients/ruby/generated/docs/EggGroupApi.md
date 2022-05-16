# OpenapiClient::EggGroupApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**egg_group_list**](EggGroupApi.md#egg_group_list) | **GET** /api/v2/egg-group/ |  |
| [**egg_group_read**](EggGroupApi.md#egg_group_read) | **GET** /api/v2/egg-group/{id}/ |  |


## egg_group_list

> String egg_group_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::EggGroupApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.egg_group_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling EggGroupApi->egg_group_list: #{e}"
end
```

#### Using the egg_group_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> egg_group_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.egg_group_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling EggGroupApi->egg_group_list_with_http_info: #{e}"
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


## egg_group_read

> String egg_group_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::EggGroupApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.egg_group_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling EggGroupApi->egg_group_read: #{e}"
end
```

#### Using the egg_group_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> egg_group_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.egg_group_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling EggGroupApi->egg_group_read_with_http_info: #{e}"
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

