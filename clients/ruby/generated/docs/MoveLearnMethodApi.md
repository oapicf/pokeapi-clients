# PokeApiClient::MoveLearnMethodApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**move_learn_method_list**](MoveLearnMethodApi.md#move_learn_method_list) | **GET** /api/v2/move-learn-method/ |  |
| [**move_learn_method_read**](MoveLearnMethodApi.md#move_learn_method_read) | **GET** /api/v2/move-learn-method/{id}/ |  |


## move_learn_method_list

> String move_learn_method_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MoveLearnMethodApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.move_learn_method_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveLearnMethodApi->move_learn_method_list: #{e}"
end
```

#### Using the move_learn_method_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_learn_method_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.move_learn_method_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveLearnMethodApi->move_learn_method_list_with_http_info: #{e}"
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


## move_learn_method_read

> String move_learn_method_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MoveLearnMethodApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.move_learn_method_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveLearnMethodApi->move_learn_method_read: #{e}"
end
```

#### Using the move_learn_method_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> move_learn_method_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.move_learn_method_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MoveLearnMethodApi->move_learn_method_read_with_http_info: #{e}"
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

