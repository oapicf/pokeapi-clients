# PokeApiClient::ItemsApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**item_attribute_list**](ItemsApi.md#item_attribute_list) | **GET** /api/v2/item-attribute/ | List item attributes |
| [**item_attribute_retrieve**](ItemsApi.md#item_attribute_retrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute |
| [**item_category_list**](ItemsApi.md#item_category_list) | **GET** /api/v2/item-category/ | List item categories |
| [**item_category_retrieve**](ItemsApi.md#item_category_retrieve) | **GET** /api/v2/item-category/{id}/ | Get item category |
| [**item_fling_effect_list**](ItemsApi.md#item_fling_effect_list) | **GET** /api/v2/item-fling-effect/ | List item fling effects |
| [**item_fling_effect_retrieve**](ItemsApi.md#item_fling_effect_retrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect |
| [**item_list**](ItemsApi.md#item_list) | **GET** /api/v2/item/ | List items |
| [**item_pocket_list**](ItemsApi.md#item_pocket_list) | **GET** /api/v2/item-pocket/ | List item pockets |
| [**item_pocket_retrieve**](ItemsApi.md#item_pocket_retrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket |
| [**item_retrieve**](ItemsApi.md#item_retrieve) | **GET** /api/v2/item/{id}/ | Get item |


## item_attribute_list

> <PaginatedItemAttributeSummaryList> item_attribute_list(opts)

List item attributes

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

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

api_instance = PokeApiClient::ItemsApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List item attributes
  result = api_instance.item_attribute_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_attribute_list: #{e}"
end
```

#### Using the item_attribute_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedItemAttributeSummaryList>, Integer, Hash)> item_attribute_list_with_http_info(opts)

```ruby
begin
  # List item attributes
  data, status_code, headers = api_instance.item_attribute_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedItemAttributeSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_attribute_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedItemAttributeSummaryList**](PaginatedItemAttributeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## item_attribute_retrieve

> <ItemAttributeDetail> item_attribute_retrieve(id)

Get item attribute

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

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

api_instance = PokeApiClient::ItemsApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get item attribute
  result = api_instance.item_attribute_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_attribute_retrieve: #{e}"
end
```

#### Using the item_attribute_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ItemAttributeDetail>, Integer, Hash)> item_attribute_retrieve_with_http_info(id)

```ruby
begin
  # Get item attribute
  data, status_code, headers = api_instance.item_attribute_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ItemAttributeDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_attribute_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**ItemAttributeDetail**](ItemAttributeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## item_category_list

> <PaginatedItemCategorySummaryList> item_category_list(opts)

List item categories

Item categories determine where items will be placed in the players bag.

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

api_instance = PokeApiClient::ItemsApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List item categories
  result = api_instance.item_category_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_category_list: #{e}"
end
```

#### Using the item_category_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedItemCategorySummaryList>, Integer, Hash)> item_category_list_with_http_info(opts)

```ruby
begin
  # List item categories
  data, status_code, headers = api_instance.item_category_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedItemCategorySummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_category_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedItemCategorySummaryList**](PaginatedItemCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## item_category_retrieve

> <ItemCategoryDetail> item_category_retrieve(id)

Get item category

Item categories determine where items will be placed in the players bag.

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

api_instance = PokeApiClient::ItemsApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get item category
  result = api_instance.item_category_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_category_retrieve: #{e}"
end
```

#### Using the item_category_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ItemCategoryDetail>, Integer, Hash)> item_category_retrieve_with_http_info(id)

```ruby
begin
  # Get item category
  data, status_code, headers = api_instance.item_category_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ItemCategoryDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_category_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**ItemCategoryDetail**](ItemCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## item_fling_effect_list

> <PaginatedItemFlingEffectSummaryList> item_fling_effect_list(opts)

List item fling effects

The various effects of the move\"Fling\" when used with different items.

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

api_instance = PokeApiClient::ItemsApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List item fling effects
  result = api_instance.item_fling_effect_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_fling_effect_list: #{e}"
end
```

#### Using the item_fling_effect_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedItemFlingEffectSummaryList>, Integer, Hash)> item_fling_effect_list_with_http_info(opts)

```ruby
begin
  # List item fling effects
  data, status_code, headers = api_instance.item_fling_effect_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedItemFlingEffectSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_fling_effect_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedItemFlingEffectSummaryList**](PaginatedItemFlingEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## item_fling_effect_retrieve

> <ItemFlingEffectDetail> item_fling_effect_retrieve(id)

Get item fling effect

The various effects of the move\"Fling\" when used with different items.

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

api_instance = PokeApiClient::ItemsApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get item fling effect
  result = api_instance.item_fling_effect_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_fling_effect_retrieve: #{e}"
end
```

#### Using the item_fling_effect_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ItemFlingEffectDetail>, Integer, Hash)> item_fling_effect_retrieve_with_http_info(id)

```ruby
begin
  # Get item fling effect
  data, status_code, headers = api_instance.item_fling_effect_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ItemFlingEffectDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_fling_effect_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**ItemFlingEffectDetail**](ItemFlingEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## item_list

> <PaginatedItemSummaryList> item_list(opts)

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

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

api_instance = PokeApiClient::ItemsApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List items
  result = api_instance.item_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_list: #{e}"
end
```

#### Using the item_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedItemSummaryList>, Integer, Hash)> item_list_with_http_info(opts)

```ruby
begin
  # List items
  data, status_code, headers = api_instance.item_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedItemSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedItemSummaryList**](PaginatedItemSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## item_pocket_list

> <PaginatedItemPocketSummaryList> item_pocket_list(opts)

List item pockets

Pockets within the players bag used for storing items by category.

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

api_instance = PokeApiClient::ItemsApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List item pockets
  result = api_instance.item_pocket_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_pocket_list: #{e}"
end
```

#### Using the item_pocket_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedItemPocketSummaryList>, Integer, Hash)> item_pocket_list_with_http_info(opts)

```ruby
begin
  # List item pockets
  data, status_code, headers = api_instance.item_pocket_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedItemPocketSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_pocket_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedItemPocketSummaryList**](PaginatedItemPocketSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## item_pocket_retrieve

> <ItemPocketDetail> item_pocket_retrieve(id)

Get item pocket

Pockets within the players bag used for storing items by category.

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

api_instance = PokeApiClient::ItemsApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get item pocket
  result = api_instance.item_pocket_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_pocket_retrieve: #{e}"
end
```

#### Using the item_pocket_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ItemPocketDetail>, Integer, Hash)> item_pocket_retrieve_with_http_info(id)

```ruby
begin
  # Get item pocket
  data, status_code, headers = api_instance.item_pocket_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ItemPocketDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_pocket_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**ItemPocketDetail**](ItemPocketDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## item_retrieve

> <ItemDetail> item_retrieve(id)

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

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

api_instance = PokeApiClient::ItemsApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get item
  result = api_instance.item_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_retrieve: #{e}"
end
```

#### Using the item_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<ItemDetail>, Integer, Hash)> item_retrieve_with_http_info(id)

```ruby
begin
  # Get item
  data, status_code, headers = api_instance.item_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <ItemDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling ItemsApi->item_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**ItemDetail**](ItemDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

