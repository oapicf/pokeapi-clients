# PokeApiClient::NatureApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**nature_list**](NatureApi.md#nature_list) | **GET** /api/v2/nature/ |  |
| [**nature_read**](NatureApi.md#nature_read) | **GET** /api/v2/nature/{id}/ |  |


## nature_list

> String nature_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::NatureApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.nature_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling NatureApi->nature_list: #{e}"
end
```

#### Using the nature_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> nature_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.nature_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling NatureApi->nature_list_with_http_info: #{e}"
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


## nature_read

> String nature_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::NatureApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.nature_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling NatureApi->nature_read: #{e}"
end
```

#### Using the nature_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> nature_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.nature_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling NatureApi->nature_read_with_http_info: #{e}"
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

