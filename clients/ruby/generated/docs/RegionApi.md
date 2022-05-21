# PokeApiClient::RegionApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**region_list**](RegionApi.md#region_list) | **GET** /api/v2/region/ |  |
| [**region_read**](RegionApi.md#region_read) | **GET** /api/v2/region/{id}/ |  |


## region_list

> String region_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::RegionApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.region_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling RegionApi->region_list: #{e}"
end
```

#### Using the region_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> region_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.region_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling RegionApi->region_list_with_http_info: #{e}"
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


## region_read

> String region_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::RegionApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.region_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling RegionApi->region_read: #{e}"
end
```

#### Using the region_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> region_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.region_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling RegionApi->region_read_with_http_info: #{e}"
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

