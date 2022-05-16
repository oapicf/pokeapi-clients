# PokeApiClient::PalParkAreaApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**pal_park_area_list**](PalParkAreaApi.md#pal_park_area_list) | **GET** /api/v2/pal-park-area/ |  |
| [**pal_park_area_read**](PalParkAreaApi.md#pal_park_area_read) | **GET** /api/v2/pal-park-area/{id}/ |  |


## pal_park_area_list

> String pal_park_area_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::PalParkAreaApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.pal_park_area_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PalParkAreaApi->pal_park_area_list: #{e}"
end
```

#### Using the pal_park_area_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pal_park_area_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.pal_park_area_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling PalParkAreaApi->pal_park_area_list_with_http_info: #{e}"
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


## pal_park_area_read

> String pal_park_area_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::PalParkAreaApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.pal_park_area_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PalParkAreaApi->pal_park_area_read: #{e}"
end
```

#### Using the pal_park_area_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> pal_park_area_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.pal_park_area_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling PalParkAreaApi->pal_park_area_read_with_http_info: #{e}"
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

