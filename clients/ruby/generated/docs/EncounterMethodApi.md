# PokeApiClient::EncounterMethodApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**encounter_method_list**](EncounterMethodApi.md#encounter_method_list) | **GET** /api/v2/encounter-method/ |  |
| [**encounter_method_read**](EncounterMethodApi.md#encounter_method_read) | **GET** /api/v2/encounter-method/{id}/ |  |


## encounter_method_list

> String encounter_method_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EncounterMethodApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.encounter_method_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncounterMethodApi->encounter_method_list: #{e}"
end
```

#### Using the encounter_method_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> encounter_method_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.encounter_method_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncounterMethodApi->encounter_method_list_with_http_info: #{e}"
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


## encounter_method_read

> String encounter_method_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EncounterMethodApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.encounter_method_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncounterMethodApi->encounter_method_read: #{e}"
end
```

#### Using the encounter_method_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> encounter_method_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.encounter_method_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncounterMethodApi->encounter_method_read_with_http_info: #{e}"
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

