# PokeApiClient::EvolutionApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**evolution_chain_list**](EvolutionApi.md#evolution_chain_list) | **GET** /api/v2/evolution-chain/ | List evolution chains |
| [**evolution_chain_retrieve**](EvolutionApi.md#evolution_chain_retrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain |
| [**evolution_trigger_list**](EvolutionApi.md#evolution_trigger_list) | **GET** /api/v2/evolution-trigger/ | List evolution triggers |
| [**evolution_trigger_retrieve**](EvolutionApi.md#evolution_trigger_retrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger |
| [**evolution_variable_list**](EvolutionApi.md#evolution_variable_list) | **GET** /api/v2/evolution-variable/ | List evolution variables |
| [**evolution_variable_retrieve**](EvolutionApi.md#evolution_variable_retrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable |


## evolution_chain_list

> <PaginatedEvolutionChainSummaryList> evolution_chain_list(opts)

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EvolutionApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56 # Integer | The initial index from which to return the results.
}

begin
  # List evolution chains
  result = api_instance.evolution_chain_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_chain_list: #{e}"
end
```

#### Using the evolution_chain_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedEvolutionChainSummaryList>, Integer, Hash)> evolution_chain_list_with_http_info(opts)

```ruby
begin
  # List evolution chains
  data, status_code, headers = api_instance.evolution_chain_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedEvolutionChainSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_chain_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |

### Return type

[**PaginatedEvolutionChainSummaryList**](PaginatedEvolutionChainSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## evolution_chain_retrieve

> <EvolutionChainDetail> evolution_chain_retrieve(id)

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EvolutionApi.new
id = '1' # String | This parameter can be a string or an integer.

begin
  # Get evolution chain
  result = api_instance.evolution_chain_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_chain_retrieve: #{e}"
end
```

#### Using the evolution_chain_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EvolutionChainDetail>, Integer, Hash)> evolution_chain_retrieve_with_http_info(id)

```ruby
begin
  # Get evolution chain
  data, status_code, headers = api_instance.evolution_chain_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EvolutionChainDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_chain_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**EvolutionChainDetail**](EvolutionChainDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## evolution_trigger_list

> <PaginatedEvolutionTriggerSummaryList> evolution_trigger_list(opts)

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EvolutionApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List evolution triggers
  result = api_instance.evolution_trigger_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_trigger_list: #{e}"
end
```

#### Using the evolution_trigger_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedEvolutionTriggerSummaryList>, Integer, Hash)> evolution_trigger_list_with_http_info(opts)

```ruby
begin
  # List evolution triggers
  data, status_code, headers = api_instance.evolution_trigger_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedEvolutionTriggerSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_trigger_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedEvolutionTriggerSummaryList**](PaginatedEvolutionTriggerSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## evolution_trigger_retrieve

> <EvolutionTriggerDetail> evolution_trigger_retrieve(id)

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EvolutionApi.new
id = '1' # String | This parameter can be a string or an integer.

begin
  # Get evolution trigger
  result = api_instance.evolution_trigger_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_trigger_retrieve: #{e}"
end
```

#### Using the evolution_trigger_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EvolutionTriggerDetail>, Integer, Hash)> evolution_trigger_retrieve_with_http_info(id)

```ruby
begin
  # Get evolution trigger
  data, status_code, headers = api_instance.evolution_trigger_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EvolutionTriggerDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_trigger_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**EvolutionTriggerDetail**](EvolutionTriggerDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## evolution_variable_list

> <PaginatedEvolutionVariableSummaryList> evolution_variable_list(opts)

List evolution variables

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EvolutionApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List evolution variables
  result = api_instance.evolution_variable_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_variable_list: #{e}"
end
```

#### Using the evolution_variable_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedEvolutionVariableSummaryList>, Integer, Hash)> evolution_variable_list_with_http_info(opts)

```ruby
begin
  # List evolution variables
  data, status_code, headers = api_instance.evolution_variable_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedEvolutionVariableSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_variable_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedEvolutionVariableSummaryList**](PaginatedEvolutionVariableSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## evolution_variable_retrieve

> <EvolutionVariableDetail> evolution_variable_retrieve(id)

Get evolution variable

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::EvolutionApi.new
id = '1' # String | This parameter can be a string or an integer.

begin
  # Get evolution variable
  result = api_instance.evolution_variable_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_variable_retrieve: #{e}"
end
```

#### Using the evolution_variable_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EvolutionVariableDetail>, Integer, Hash)> evolution_variable_retrieve_with_http_info(id)

```ruby
begin
  # Get evolution variable
  data, status_code, headers = api_instance.evolution_variable_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EvolutionVariableDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling EvolutionApi->evolution_variable_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**EvolutionVariableDetail**](EvolutionVariableDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

