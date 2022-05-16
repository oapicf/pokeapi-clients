# PokeApiClient::MoveCategoryApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**move_category_list**](MoveCategoryApi.md#move_category_list) | **GET** /api/v2/move-category/ |  |
| [**move_category_read**](MoveCategoryApi.md#move_category_read) | **GET** /api/v2/move-category/{id}/ |  |


## move_category_list

> String move_category_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MoveCategoryApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.move_category_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveCategoryApi->move_category_list: #{e}"
end
```

#### Using the move_category_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_category_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.move_category_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveCategoryApi->move_category_list_with_http_info: #{e}"
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


## move_category_read

> String move_category_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MoveCategoryApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.move_category_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveCategoryApi->move_category_read: #{e}"
end
```

#### Using the move_category_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_category_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.move_category_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveCategoryApi->move_category_read_with_http_info: #{e}"
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

