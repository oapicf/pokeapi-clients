# PokeApiClient::ContestTypeApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**contest_type_list**](ContestTypeApi.md#contest_type_list) | **GET** /api/v2/contest-type/ |  |
| [**contest_type_read**](ContestTypeApi.md#contest_type_read) | **GET** /api/v2/contest-type/{id}/ |  |


## contest_type_list

> String contest_type_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::ContestTypeApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.contest_type_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestTypeApi->contest_type_list: #{e}"
end
```

#### Using the contest_type_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> contest_type_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.contest_type_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestTypeApi->contest_type_list_with_http_info: #{e}"
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


## contest_type_read

> String contest_type_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::ContestTypeApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.contest_type_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestTypeApi->contest_type_read: #{e}"
end
```

#### Using the contest_type_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> contest_type_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.contest_type_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestTypeApi->contest_type_read_with_http_info: #{e}"
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

