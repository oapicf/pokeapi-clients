# PokeApiClient::ItemCategoryApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**item_category_list**](ItemCategoryApi.md#item_category_list) | **GET** /api/v2/item-category/ |  |
| [**item_category_read**](ItemCategoryApi.md#item_category_read) | **GET** /api/v2/item-category/{id}/ |  |


## item_category_list

> String item_category_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::ItemCategoryApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.item_category_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemCategoryApi->item_category_list: #{e}"
end
```

#### Using the item_category_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> item_category_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.item_category_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemCategoryApi->item_category_list_with_http_info: #{e}"
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


## item_category_read

> String item_category_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::ItemCategoryApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.item_category_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemCategoryApi->item_category_read: #{e}"
end
```

#### Using the item_category_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> item_category_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.item_category_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemCategoryApi->item_category_read_with_http_info: #{e}"
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

