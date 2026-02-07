# PokeApiClient::MachinesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**machine_list**](MachinesApi.md#machine_list) | **GET** /api/v2/machine/ | List machines |
| [**machine_retrieve**](MachinesApi.md#machine_retrieve) | **GET** /api/v2/machine/{id}/ | Get machine |


## machine_list

> <PaginatedMachineSummaryList> machine_list(opts)

List machines

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Examples

```ruby
require 'time'
require 'pokeapi_client'
# setup authorization
PokeApiClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: cookieAuth
  config.api_key['sessionid'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['sessionid'] = 'Bearer'
end

api_instance = PokeApiClient::MachinesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List machines
  result = api_instance.machine_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MachinesApi->machine_list: #{e}"
end
```

#### Using the machine_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedMachineSummaryList>, Integer, Hash)> machine_list_with_http_info(opts)

```ruby
begin
  # List machines
  data, status_code, headers = api_instance.machine_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedMachineSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MachinesApi->machine_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedMachineSummaryList**](PaginatedMachineSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## machine_retrieve

> <MachineDetail> machine_retrieve(id)

Get machine

Machines are the representation of items that teach moves to Pokémon. They vary from version to version, so it is not certain that one specific TM or HM corresponds to a single Machine.

### Examples

```ruby
require 'time'
require 'pokeapi_client'
# setup authorization
PokeApiClient.configure do |config|
  # Configure HTTP basic authorization: basicAuth
  config.username = 'YOUR USERNAME'
  config.password = 'YOUR PASSWORD'

  # Configure API key authorization: cookieAuth
  config.api_key['sessionid'] = 'YOUR API KEY'
  # Uncomment the following line to set a prefix for the API key, e.g. 'Bearer' (defaults to nil)
  # config.api_key_prefix['sessionid'] = 'Bearer'
end

api_instance = PokeApiClient::MachinesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get machine
  result = api_instance.machine_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MachinesApi->machine_retrieve: #{e}"
end
```

#### Using the machine_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MachineDetail>, Integer, Hash)> machine_retrieve_with_http_info(id)

```ruby
begin
  # Get machine
  data, status_code, headers = api_instance.machine_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MachineDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MachinesApi->machine_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**MachineDetail**](MachineDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

