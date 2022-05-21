# PokeApiClient::AbilityApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ability_list**](AbilityApi.md#ability_list) | **GET** /api/v2/ability/ |  |
| [**ability_read**](AbilityApi.md#ability_read) | **GET** /api/v2/ability/{id}/ |  |


## ability_list

> String ability_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::AbilityApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.ability_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling AbilityApi->ability_list: #{e}"
end
```

#### Using the ability_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> ability_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.ability_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling AbilityApi->ability_list_with_http_info: #{e}"
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


## ability_read

> String ability_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::AbilityApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.ability_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling AbilityApi->ability_read: #{e}"
end
```

#### Using the ability_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> ability_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.ability_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling AbilityApi->ability_read_with_http_info: #{e}"
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

