# PokeApiClient::MachineApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**machine_list**](MachineApi.md#machine_list) | **GET** /api/v2/machine/ |  |
| [**machine_read**](MachineApi.md#machine_read) | **GET** /api/v2/machine/{id}/ |  |


## machine_list

> String machine_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MachineApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.machine_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MachineApi->machine_list: #{e}"
end
```

#### Using the machine_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> machine_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.machine_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MachineApi->machine_list_with_http_info: #{e}"
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


## machine_read

> String machine_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::MachineApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.machine_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MachineApi->machine_read: #{e}"
end
```

#### Using the machine_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> machine_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.machine_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling MachineApi->machine_read_with_http_info: #{e}"
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

