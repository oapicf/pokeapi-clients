# PokeApiClient::ContestsApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**contest_effect_list**](ContestsApi.md#contest_effect_list) | **GET** /api/v2/contest-effect/ | List contest effects |
| [**contest_effect_retrieve**](ContestsApi.md#contest_effect_retrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect |
| [**contest_type_list**](ContestsApi.md#contest_type_list) | **GET** /api/v2/contest-type/ | List contest types |
| [**contest_type_retrieve**](ContestsApi.md#contest_type_retrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type |
| [**super_contest_effect_list**](ContestsApi.md#super_contest_effect_list) | **GET** /api/v2/super-contest-effect/ | List super contest effects |
| [**super_contest_effect_retrieve**](ContestsApi.md#super_contest_effect_retrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect |


## contest_effect_list

> <PaginatedContestEffectSummaryList> contest_effect_list(opts)

List contest effects

Contest effects refer to the effects of moves when used in contests.

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

api_instance = PokeApiClient::ContestsApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List contest effects
  result = api_instance.contest_effect_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->contest_effect_list: #{e}"
end
```

#### Using the contest_effect_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedContestEffectSummaryList>, Integer, Hash)> contest_effect_list_with_http_info(opts)

```ruby
begin
  # List contest effects
  data, status_code, headers = api_instance.contest_effect_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedContestEffectSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->contest_effect_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedContestEffectSummaryList**](PaginatedContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## contest_effect_retrieve

> <ContestEffectDetail> contest_effect_retrieve(id)

Get contest effect

Contest effects refer to the effects of moves when used in contests.

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

api_instance = PokeApiClient::ContestsApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get contest effect
  result = api_instance.contest_effect_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->contest_effect_retrieve: #{e}"
end
```

#### Using the contest_effect_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ContestEffectDetail>, Integer, Hash)> contest_effect_retrieve_with_http_info(id)

```ruby
begin
  # Get contest effect
  data, status_code, headers = api_instance.contest_effect_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ContestEffectDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->contest_effect_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**ContestEffectDetail**](ContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## contest_type_list

> <PaginatedContestTypeSummaryList> contest_type_list(opts)

List contest types

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

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

api_instance = PokeApiClient::ContestsApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List contest types
  result = api_instance.contest_type_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->contest_type_list: #{e}"
end
```

#### Using the contest_type_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedContestTypeSummaryList>, Integer, Hash)> contest_type_list_with_http_info(opts)

```ruby
begin
  # List contest types
  data, status_code, headers = api_instance.contest_type_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedContestTypeSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->contest_type_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedContestTypeSummaryList**](PaginatedContestTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## contest_type_retrieve

> <ContestTypeDetail> contest_type_retrieve(id)

Get contest type

Contest types are categories judges used to weigh a Pokémon's condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

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

api_instance = PokeApiClient::ContestsApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get contest type
  result = api_instance.contest_type_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->contest_type_retrieve: #{e}"
end
```

#### Using the contest_type_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ContestTypeDetail>, Integer, Hash)> contest_type_retrieve_with_http_info(id)

```ruby
begin
  # Get contest type
  data, status_code, headers = api_instance.contest_type_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ContestTypeDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->contest_type_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**ContestTypeDetail**](ContestTypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## super_contest_effect_list

> <PaginatedSuperContestEffectSummaryList> super_contest_effect_list(opts)

List super contest effects

Super contest effects refer to the effects of moves when used in super contests.

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

api_instance = PokeApiClient::ContestsApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List super contest effects
  result = api_instance.super_contest_effect_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->super_contest_effect_list: #{e}"
end
```

#### Using the super_contest_effect_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedSuperContestEffectSummaryList>, Integer, Hash)> super_contest_effect_list_with_http_info(opts)

```ruby
begin
  # List super contest effects
  data, status_code, headers = api_instance.super_contest_effect_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedSuperContestEffectSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->super_contest_effect_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedSuperContestEffectSummaryList**](PaginatedSuperContestEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## super_contest_effect_retrieve

> <SuperContestEffectDetail> super_contest_effect_retrieve(id)

Get super contest effect

Super contest effects refer to the effects of moves when used in super contests.

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

api_instance = PokeApiClient::ContestsApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get super contest effect
  result = api_instance.super_contest_effect_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->super_contest_effect_retrieve: #{e}"
end
```

#### Using the super_contest_effect_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SuperContestEffectDetail>, Integer, Hash)> super_contest_effect_retrieve_with_http_info(id)

```ruby
begin
  # Get super contest effect
  data, status_code, headers = api_instance.super_contest_effect_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SuperContestEffectDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ContestsApi->super_contest_effect_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**SuperContestEffectDetail**](SuperContestEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

