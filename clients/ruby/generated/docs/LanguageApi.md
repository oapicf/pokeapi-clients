# OpenapiClient::LanguageApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**language_list**](LanguageApi.md#language_list) | **GET** /api/v2/language/ |  |
| [**language_read**](LanguageApi.md#language_read) | **GET** /api/v2/language/{id}/ |  |


## language_list

> String language_list(opts)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::LanguageApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.language_list(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling LanguageApi->language_list: #{e}"
end
```

#### Using the language_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> language_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.language_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling LanguageApi->language_list_with_http_info: #{e}"
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


## language_read

> String language_read(id)



### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::LanguageApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.language_read(id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling LanguageApi->language_read: #{e}"
end
```

#### Using the language_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> language_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.language_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue OpenapiClient::ApiError => e
  puts "Error when calling LanguageApi->language_read_with_http_info: #{e}"
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

