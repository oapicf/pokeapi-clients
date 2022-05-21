# PokeApiClient::MoveDamageClassApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**move_damage_class_list**](MoveDamageClassApi.md#move_damage_class_list) | **GET** /api/v2/move-damage-class/ |  |
| [**move_damage_class_read**](MoveDamageClassApi.md#move_damage_class_read) | **GET** /api/v2/move-damage-class/{id}/ |  |


## move_damage_class_list

> String move_damage_class_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MoveDamageClassApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.move_damage_class_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveDamageClassApi->move_damage_class_list: #{e}"
end
```

#### Using the move_damage_class_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_damage_class_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.move_damage_class_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveDamageClassApi->move_damage_class_list_with_http_info: #{e}"
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


## move_damage_class_read

> String move_damage_class_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MoveDamageClassApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.move_damage_class_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveDamageClassApi->move_damage_class_read: #{e}"
end
```

#### Using the move_damage_class_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_damage_class_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.move_damage_class_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveDamageClassApi->move_damage_class_read_with_http_info: #{e}"
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

