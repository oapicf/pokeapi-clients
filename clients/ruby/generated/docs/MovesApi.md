# PokeApiClient::MovesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**move_ailment_list**](MovesApi.md#move_ailment_list) | **GET** /api/v2/move-ailment/ | List move meta ailments |
| [**move_ailment_retrieve**](MovesApi.md#move_ailment_retrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment |
| [**move_battle_style_list**](MovesApi.md#move_battle_style_list) | **GET** /api/v2/move-battle-style/ | List move battle styles |
| [**move_battle_style_retrieve**](MovesApi.md#move_battle_style_retrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style |
| [**move_category_list**](MovesApi.md#move_category_list) | **GET** /api/v2/move-category/ | List move meta categories |
| [**move_category_retrieve**](MovesApi.md#move_category_retrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category |
| [**move_learn_method_list**](MovesApi.md#move_learn_method_list) | **GET** /api/v2/move-learn-method/ | List move learn methods |
| [**move_learn_method_retrieve**](MovesApi.md#move_learn_method_retrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method |
| [**move_list**](MovesApi.md#move_list) | **GET** /api/v2/move/ | List moves |
| [**move_retrieve**](MovesApi.md#move_retrieve) | **GET** /api/v2/move/{id}/ | Get move |
| [**move_target_list**](MovesApi.md#move_target_list) | **GET** /api/v2/move-target/ | List move targets |
| [**move_target_retrieve**](MovesApi.md#move_target_retrieve) | **GET** /api/v2/move-target/{id}/ | Get move target |


## move_ailment_list

> <PaginatedMoveMetaAilmentSummaryList> move_ailment_list(opts)

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

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

api_instance = PokeApiClient::MovesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List move meta ailments
  result = api_instance.move_ailment_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_ailment_list: #{e}"
end
```

#### Using the move_ailment_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedMoveMetaAilmentSummaryList>, Integer, Hash)> move_ailment_list_with_http_info(opts)

```ruby
begin
  # List move meta ailments
  data, status_code, headers = api_instance.move_ailment_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedMoveMetaAilmentSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_ailment_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedMoveMetaAilmentSummaryList**](PaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_ailment_retrieve

> <MoveMetaAilmentDetail> move_ailment_retrieve(id)

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

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

api_instance = PokeApiClient::MovesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get move meta ailment
  result = api_instance.move_ailment_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_ailment_retrieve: #{e}"
end
```

#### Using the move_ailment_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MoveMetaAilmentDetail>, Integer, Hash)> move_ailment_retrieve_with_http_info(id)

```ruby
begin
  # Get move meta ailment
  data, status_code, headers = api_instance.move_ailment_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MoveMetaAilmentDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_ailment_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**MoveMetaAilmentDetail**](MoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_battle_style_list

> <PaginatedMoveBattleStyleSummaryList> move_battle_style_list(opts)

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

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

api_instance = PokeApiClient::MovesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List move battle styles
  result = api_instance.move_battle_style_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_battle_style_list: #{e}"
end
```

#### Using the move_battle_style_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedMoveBattleStyleSummaryList>, Integer, Hash)> move_battle_style_list_with_http_info(opts)

```ruby
begin
  # List move battle styles
  data, status_code, headers = api_instance.move_battle_style_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedMoveBattleStyleSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_battle_style_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedMoveBattleStyleSummaryList**](PaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_battle_style_retrieve

> <MoveBattleStyleDetail> move_battle_style_retrieve(id)

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

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

api_instance = PokeApiClient::MovesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get move battle style
  result = api_instance.move_battle_style_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_battle_style_retrieve: #{e}"
end
```

#### Using the move_battle_style_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MoveBattleStyleDetail>, Integer, Hash)> move_battle_style_retrieve_with_http_info(id)

```ruby
begin
  # Get move battle style
  data, status_code, headers = api_instance.move_battle_style_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MoveBattleStyleDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_battle_style_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**MoveBattleStyleDetail**](MoveBattleStyleDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_category_list

> <PaginatedMoveMetaCategorySummaryList> move_category_list(opts)

List move meta categories

Very general categories that loosely group move effects.

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

api_instance = PokeApiClient::MovesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List move meta categories
  result = api_instance.move_category_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_category_list: #{e}"
end
```

#### Using the move_category_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedMoveMetaCategorySummaryList>, Integer, Hash)> move_category_list_with_http_info(opts)

```ruby
begin
  # List move meta categories
  data, status_code, headers = api_instance.move_category_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedMoveMetaCategorySummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_category_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedMoveMetaCategorySummaryList**](PaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_category_retrieve

> <MoveMetaCategoryDetail> move_category_retrieve(id)

Get move meta category

Very general categories that loosely group move effects.

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

api_instance = PokeApiClient::MovesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get move meta category
  result = api_instance.move_category_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_category_retrieve: #{e}"
end
```

#### Using the move_category_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MoveMetaCategoryDetail>, Integer, Hash)> move_category_retrieve_with_http_info(id)

```ruby
begin
  # Get move meta category
  data, status_code, headers = api_instance.move_category_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MoveMetaCategoryDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_category_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**MoveMetaCategoryDetail**](MoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_learn_method_list

> <PaginatedMoveLearnMethodSummaryList> move_learn_method_list(opts)

List move learn methods

Methods by which Pokémon can learn moves.

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

api_instance = PokeApiClient::MovesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List move learn methods
  result = api_instance.move_learn_method_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_learn_method_list: #{e}"
end
```

#### Using the move_learn_method_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedMoveLearnMethodSummaryList>, Integer, Hash)> move_learn_method_list_with_http_info(opts)

```ruby
begin
  # List move learn methods
  data, status_code, headers = api_instance.move_learn_method_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedMoveLearnMethodSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_learn_method_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedMoveLearnMethodSummaryList**](PaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_learn_method_retrieve

> <MoveLearnMethodDetail> move_learn_method_retrieve(id)

Get move learn method

Methods by which Pokémon can learn moves.

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

api_instance = PokeApiClient::MovesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get move learn method
  result = api_instance.move_learn_method_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_learn_method_retrieve: #{e}"
end
```

#### Using the move_learn_method_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MoveLearnMethodDetail>, Integer, Hash)> move_learn_method_retrieve_with_http_info(id)

```ruby
begin
  # Get move learn method
  data, status_code, headers = api_instance.move_learn_method_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MoveLearnMethodDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_learn_method_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**MoveLearnMethodDetail**](MoveLearnMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_list

> <PaginatedMoveSummaryList> move_list(opts)

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

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

api_instance = PokeApiClient::MovesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List moves
  result = api_instance.move_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_list: #{e}"
end
```

#### Using the move_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedMoveSummaryList>, Integer, Hash)> move_list_with_http_info(opts)

```ruby
begin
  # List moves
  data, status_code, headers = api_instance.move_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedMoveSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedMoveSummaryList**](PaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_retrieve

> <MoveDetail> move_retrieve(id)

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

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

api_instance = PokeApiClient::MovesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get move
  result = api_instance.move_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_retrieve: #{e}"
end
```

#### Using the move_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MoveDetail>, Integer, Hash)> move_retrieve_with_http_info(id)

```ruby
begin
  # Get move
  data, status_code, headers = api_instance.move_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MoveDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**MoveDetail**](MoveDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_target_list

> <PaginatedMoveTargetSummaryList> move_target_list(opts)

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

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

api_instance = PokeApiClient::MovesApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List move targets
  result = api_instance.move_target_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_target_list: #{e}"
end
```

#### Using the move_target_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedMoveTargetSummaryList>, Integer, Hash)> move_target_list_with_http_info(opts)

```ruby
begin
  # List move targets
  data, status_code, headers = api_instance.move_target_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedMoveTargetSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_target_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedMoveTargetSummaryList**](PaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_target_retrieve

> <MoveTargetDetail> move_target_retrieve(id)

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

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

api_instance = PokeApiClient::MovesApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get move target
  result = api_instance.move_target_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_target_retrieve: #{e}"
end
```

#### Using the move_target_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MoveTargetDetail>, Integer, Hash)> move_target_retrieve_with_http_info(id)

```ruby
begin
  # Get move target
  data, status_code, headers = api_instance.move_target_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MoveTargetDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling MovesApi->move_target_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**MoveTargetDetail**](MoveTargetDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

