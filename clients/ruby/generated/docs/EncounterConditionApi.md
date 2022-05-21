# PokeApiClient::EncounterConditionApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**encounter_condition_list**](EncounterConditionApi.md#encounter_condition_list) | **GET** /api/v2/encounter-condition/ |  |
| [**encounter_condition_read**](EncounterConditionApi.md#encounter_condition_read) | **GET** /api/v2/encounter-condition/{id}/ |  |


## encounter_condition_list

> String encounter_condition_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EncounterConditionApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.encounter_condition_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncounterConditionApi->encounter_condition_list: #{e}"
end
```

#### Using the encounter_condition_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> encounter_condition_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.encounter_condition_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncounterConditionApi->encounter_condition_list_with_http_info: #{e}"
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


## encounter_condition_read

> String encounter_condition_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EncounterConditionApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.encounter_condition_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncounterConditionApi->encounter_condition_read: #{e}"
end
```

#### Using the encounter_condition_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> encounter_condition_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.encounter_condition_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling EncounterConditionApi->encounter_condition_read_with_http_info: #{e}"
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

