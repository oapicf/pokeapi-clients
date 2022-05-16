# PokeApiClient::ItemPocketApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**item_pocket_list**](ItemPocketApi.md#item_pocket_list) | **GET** /api/v2/item-pocket/ |  |
| [**item_pocket_read**](ItemPocketApi.md#item_pocket_read) | **GET** /api/v2/item-pocket/{id}/ |  |


## item_pocket_list

> String item_pocket_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::ItemPocketApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.item_pocket_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemPocketApi->item_pocket_list: #{e}"
end
```

#### Using the item_pocket_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> item_pocket_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.item_pocket_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemPocketApi->item_pocket_list_with_http_info: #{e}"
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


## item_pocket_read

> String item_pocket_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::ItemPocketApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.item_pocket_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemPocketApi->item_pocket_read: #{e}"
end
```

#### Using the item_pocket_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> item_pocket_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.item_pocket_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemPocketApi->item_pocket_read_with_http_info: #{e}"
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

