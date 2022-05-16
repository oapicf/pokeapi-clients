# PokeApiClient::MoveBattleStyleApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**move_battle_style_list**](MoveBattleStyleApi.md#move_battle_style_list) | **GET** /api/v2/move-battle-style/ |  |
| [**move_battle_style_read**](MoveBattleStyleApi.md#move_battle_style_read) | **GET** /api/v2/move-battle-style/{id}/ |  |


## move_battle_style_list

> String move_battle_style_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MoveBattleStyleApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.move_battle_style_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveBattleStyleApi->move_battle_style_list: #{e}"
end
```

#### Using the move_battle_style_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_battle_style_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.move_battle_style_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveBattleStyleApi->move_battle_style_list_with_http_info: #{e}"
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


## move_battle_style_read

> String move_battle_style_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MoveBattleStyleApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.move_battle_style_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveBattleStyleApi->move_battle_style_read: #{e}"
end
```

#### Using the move_battle_style_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_battle_style_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.move_battle_style_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveBattleStyleApi->move_battle_style_read_with_http_info: #{e}"
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

