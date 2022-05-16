# PokeApiClient::EvolutionChainApi

All URIs are relative to *https://pokeapi.co/api/v2*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**evolution_chain_list**](EvolutionChainApi.md#evolution_chain_list) | **GET** /api/v2/evolution-chain/ |  |
| [**evolution_chain_read**](EvolutionChainApi.md#evolution_chain_read) | **GET** /api/v2/evolution-chain/{id}/ |  |


## evolution_chain_list

> String evolution_chain_list(opts)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EvolutionChainApi.new
opts = {
  limit: 56, # Integer | 
  offset: 56 # Integer | 
}

begin
  
  result = api_instance.evolution_chain_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionChainApi->evolution_chain_list: #{e}"
end
```

#### Using the evolution_chain_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> evolution_chain_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.evolution_chain_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionChainApi->evolution_chain_list_with_http_info: #{e}"
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


## evolution_chain_read

> String evolution_chain_read(id)



### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EvolutionChainApi.new
id = 56 # Integer | 

begin
  
  result = api_instance.evolution_chain_read(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionChainApi->evolution_chain_read: #{e}"
end
```

#### Using the evolution_chain_read_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(String, Integer, Hash)> evolution_chain_read_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.evolution_chain_read_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => String
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionChainApi->evolution_chain_read_with_http_info: #{e}"
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

