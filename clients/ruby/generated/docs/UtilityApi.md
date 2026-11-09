# PokeApiClient::UtilityApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**language_list**](UtilityApi.md#language_list) | **GET** /api/v2/language/ | List languages |
| [**language_retrieve**](UtilityApi.md#language_retrieve) | **GET** /api/v2/language/{id}/ | Get language |
| [**meta_retrieve**](UtilityApi.md#meta_retrieve) | **GET** /api/v2/meta/ | Get API metadata |


## language_list

> <PaginatedLanguageSummaryList> language_list(opts)

List languages

Languages for translations of API resource information.

### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::UtilityApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List languages
  result = api_instance.language_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling UtilityApi->language_list: #{e}"
end
```

#### Using the language_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedLanguageSummaryList>, Integer, Hash)> language_list_with_http_info(opts)

```ruby
begin
  # List languages
  data, status_code, headers = api_instance.language_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedLanguageSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling UtilityApi->language_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedLanguageSummaryList**](PaginatedLanguageSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## language_retrieve

> <LanguageDetail> language_retrieve(id)

Get language

Languages for translations of API resource information.

### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::UtilityApi.new
id = '1' # String | This parameter can be a string or an integer.

begin
  # Get language
  result = api_instance.language_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling UtilityApi->language_retrieve: #{e}"
end
```

#### Using the language_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<LanguageDetail>, Integer, Hash)> language_retrieve_with_http_info(id)

```ruby
begin
  # Get language
  data, status_code, headers = api_instance.language_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <LanguageDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling UtilityApi->language_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**LanguageDetail**](LanguageDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## meta_retrieve

> <PokeapiMetaResponse> meta_retrieve

Get API metadata

Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).

### Examples

```ruby
require 'time'
require 'pokeapi_client'

api_instance = PokeApiClient::UtilityApi.new

begin
  # Get API metadata
  result = api_instance.meta_retrieve
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling UtilityApi->meta_retrieve: #{e}"
end
```

#### Using the meta_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PokeapiMetaResponse>, Integer, Hash)> meta_retrieve_with_http_info

```ruby
begin
  # Get API metadata
  data, status_code, headers = api_instance.meta_retrieve_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PokeapiMetaResponse>
rescue PokeApiClient::ApiError => e
  puts "Error when calling UtilityApi->meta_retrieve_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**PokeapiMetaResponse**](PokeapiMetaResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

