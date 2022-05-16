# PokeApiClient::SuperContestEffectApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**super_contest_effect_list**](SuperContestEffectApi.md#super_contest_effect_list) | **GET** /api/v2/super-contest-effect/ |  |
| [**super_contest_effect_read**](SuperContestEffectApi.md#super_contest_effect_read) | **GET** /api/v2/super-contest-effect/{id}/ |  |


## super_contest_effect_list

> String super_contest_effect_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::SuperContestEffectApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.super_contest_effect_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling SuperContestEffectApi->super_contest_effect_list: #{e}"
end
```

#### Using the super_contest_effect_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> super_contest_effect_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.super_contest_effect_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling SuperContestEffectApi->super_contest_effect_list_with_http_info: #{e}"
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


## super_contest_effect_read

> String super_contest_effect_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::SuperContestEffectApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.super_contest_effect_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling SuperContestEffectApi->super_contest_effect_read: #{e}"
end
```

#### Using the super_contest_effect_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> super_contest_effect_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.super_contest_effect_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling SuperContestEffectApi->super_contest_effect_read_with_http_info: #{e}"
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

