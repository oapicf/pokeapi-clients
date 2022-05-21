# PokeApiClient::GenderApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**gender_list**](GenderApi.md#gender_list) | **GET** /api/v2/gender/ |  |
| [**gender_read**](GenderApi.md#gender_read) | **GET** /api/v2/gender/{id}/ |  |


## gender_list

> String gender_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::GenderApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.gender_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GenderApi->gender_list: #{e}"
end
```

#### Using the gender_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> gender_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.gender_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling GenderApi->gender_list_with_http_info: #{e}"
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


## gender_read

> String gender_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::GenderApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.gender_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GenderApi->gender_read: #{e}"
end
```

#### Using the gender_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> gender_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.gender_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling GenderApi->gender_read_with_http_info: #{e}"
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

