# PokeApiClient::GrowthRateApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**growth_rate_list**](GrowthRateApi.md#growth_rate_list) | **GET** /api/v2/growth-rate/ |  |
| [**growth_rate_read**](GrowthRateApi.md#growth_rate_read) | **GET** /api/v2/growth-rate/{id}/ |  |


## growth_rate_list

> String growth_rate_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::GrowthRateApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.growth_rate_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GrowthRateApi->growth_rate_list: #{e}"
end
```

#### Using the growth_rate_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> growth_rate_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.growth_rate_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling GrowthRateApi->growth_rate_list_with_http_info: #{e}"
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


## growth_rate_read

> String growth_rate_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::GrowthRateApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.growth_rate_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling GrowthRateApi->growth_rate_read: #{e}"
end
```

#### Using the growth_rate_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> growth_rate_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.growth_rate_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling GrowthRateApi->growth_rate_read_with_http_info: #{e}"
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

