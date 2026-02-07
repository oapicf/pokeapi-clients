# PokeApiClient::PokemonApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**ability_list**](PokemonApi.md#ability_list) | **GET** /api/v2/ability/ |  |
| [**ability_retrieve**](PokemonApi.md#ability_retrieve) | **GET** /api/v2/ability/{id}/ |  |
| [**characteristic_list**](PokemonApi.md#characteristic_list) | **GET** /api/v2/characteristic/ | List charecterictics |
| [**characteristic_retrieve**](PokemonApi.md#characteristic_retrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic |
| [**egg_group_list**](PokemonApi.md#egg_group_list) | **GET** /api/v2/egg-group/ | List egg groups |
| [**egg_group_retrieve**](PokemonApi.md#egg_group_retrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group |
| [**gender_list**](PokemonApi.md#gender_list) | **GET** /api/v2/gender/ | List genders |
| [**gender_retrieve**](PokemonApi.md#gender_retrieve) | **GET** /api/v2/gender/{id}/ | Get gender |
| [**growth_rate_list**](PokemonApi.md#growth_rate_list) | **GET** /api/v2/growth-rate/ | List growth rates |
| [**growth_rate_retrieve**](PokemonApi.md#growth_rate_retrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate |
| [**move_damage_class_list**](PokemonApi.md#move_damage_class_list) | **GET** /api/v2/move-damage-class/ | List move damage classes |
| [**move_damage_class_retrieve**](PokemonApi.md#move_damage_class_retrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class |
| [**nature_list**](PokemonApi.md#nature_list) | **GET** /api/v2/nature/ | List natures |
| [**nature_retrieve**](PokemonApi.md#nature_retrieve) | **GET** /api/v2/nature/{id}/ | Get nature |
| [**pokeathlon_stat_list**](PokemonApi.md#pokeathlon_stat_list) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats |
| [**pokeathlon_stat_retrieve**](PokemonApi.md#pokeathlon_stat_retrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat |
| [**pokemon_color_list**](PokemonApi.md#pokemon_color_list) | **GET** /api/v2/pokemon-color/ | List pokemon colors |
| [**pokemon_color_retrieve**](PokemonApi.md#pokemon_color_retrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color |
| [**pokemon_form_list**](PokemonApi.md#pokemon_form_list) | **GET** /api/v2/pokemon-form/ | List pokemon forms |
| [**pokemon_form_retrieve**](PokemonApi.md#pokemon_form_retrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form |
| [**pokemon_habitat_list**](PokemonApi.md#pokemon_habitat_list) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas |
| [**pokemon_habitat_retrieve**](PokemonApi.md#pokemon_habitat_retrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita |
| [**pokemon_list**](PokemonApi.md#pokemon_list) | **GET** /api/v2/pokemon/ | List pokemon |
| [**pokemon_retrieve**](PokemonApi.md#pokemon_retrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon |
| [**pokemon_shape_list**](PokemonApi.md#pokemon_shape_list) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes |
| [**pokemon_shape_retrieve**](PokemonApi.md#pokemon_shape_retrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape |
| [**pokemon_species_list**](PokemonApi.md#pokemon_species_list) | **GET** /api/v2/pokemon-species/ | List pokemon species |
| [**pokemon_species_retrieve**](PokemonApi.md#pokemon_species_retrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species |
| [**stat_list**](PokemonApi.md#stat_list) | **GET** /api/v2/stat/ | List stats |
| [**stat_retrieve**](PokemonApi.md#stat_retrieve) | **GET** /api/v2/stat/{id}/ | Get stat |
| [**type_list**](PokemonApi.md#type_list) | **GET** /api/v2/type/ | List types |
| [**type_retrieve**](PokemonApi.md#type_retrieve) | **GET** /api/v2/type/{id}/ | Get types |


## ability_list

> <PaginatedAbilitySummaryList> ability_list(opts)



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  
  result = api_instance.ability_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->ability_list: #{e}"
end
```

#### Using the ability_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedAbilitySummaryList>, Integer, Hash)> ability_list_with_http_info(opts)

```ruby
begin
  
  data, status_code, headers = api_instance.ability_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedAbilitySummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->ability_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedAbilitySummaryList**](PaginatedAbilitySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## ability_retrieve

> <AbilityDetail> ability_retrieve(id)



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  
  result = api_instance.ability_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->ability_retrieve: #{e}"
end
```

#### Using the ability_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<AbilityDetail>, Integer, Hash)> ability_retrieve_with_http_info(id)

```ruby
begin
  
  data, status_code, headers = api_instance.ability_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <AbilityDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->ability_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**AbilityDetail**](AbilityDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## characteristic_list

> <PaginatedCharacteristicSummaryList> characteristic_list(opts)

List charecterictics

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List charecterictics
  result = api_instance.characteristic_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->characteristic_list: #{e}"
end
```

#### Using the characteristic_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedCharacteristicSummaryList>, Integer, Hash)> characteristic_list_with_http_info(opts)

```ruby
begin
  # List charecterictics
  data, status_code, headers = api_instance.characteristic_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedCharacteristicSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->characteristic_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedCharacteristicSummaryList**](PaginatedCharacteristicSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## characteristic_retrieve

> <CharacteristicDetail> characteristic_retrieve(id)

Get characteristic

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get characteristic
  result = api_instance.characteristic_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->characteristic_retrieve: #{e}"
end
```

#### Using the characteristic_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CharacteristicDetail>, Integer, Hash)> characteristic_retrieve_with_http_info(id)

```ruby
begin
  # Get characteristic
  data, status_code, headers = api_instance.characteristic_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CharacteristicDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->characteristic_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**CharacteristicDetail**](CharacteristicDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## egg_group_list

> <PaginatedEggGroupSummaryList> egg_group_list(opts)

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List egg groups
  result = api_instance.egg_group_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->egg_group_list: #{e}"
end
```

#### Using the egg_group_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedEggGroupSummaryList>, Integer, Hash)> egg_group_list_with_http_info(opts)

```ruby
begin
  # List egg groups
  data, status_code, headers = api_instance.egg_group_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedEggGroupSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->egg_group_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedEggGroupSummaryList**](PaginatedEggGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## egg_group_retrieve

> <EggGroupDetail> egg_group_retrieve(id)

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get egg group
  result = api_instance.egg_group_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->egg_group_retrieve: #{e}"
end
```

#### Using the egg_group_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EggGroupDetail>, Integer, Hash)> egg_group_retrieve_with_http_info(id)

```ruby
begin
  # Get egg group
  data, status_code, headers = api_instance.egg_group_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EggGroupDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->egg_group_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**EggGroupDetail**](EggGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## gender_list

> <PaginatedGenderSummaryList> gender_list(opts)

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List genders
  result = api_instance.gender_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->gender_list: #{e}"
end
```

#### Using the gender_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedGenderSummaryList>, Integer, Hash)> gender_list_with_http_info(opts)

```ruby
begin
  # List genders
  data, status_code, headers = api_instance.gender_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedGenderSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->gender_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedGenderSummaryList**](PaginatedGenderSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## gender_retrieve

> <GenderDetail> gender_retrieve(id)

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get gender
  result = api_instance.gender_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->gender_retrieve: #{e}"
end
```

#### Using the gender_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenderDetail>, Integer, Hash)> gender_retrieve_with_http_info(id)

```ruby
begin
  # Get gender
  data, status_code, headers = api_instance.gender_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenderDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->gender_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**GenderDetail**](GenderDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## growth_rate_list

> <PaginatedGrowthRateSummaryList> growth_rate_list(opts)

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List growth rates
  result = api_instance.growth_rate_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->growth_rate_list: #{e}"
end
```

#### Using the growth_rate_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedGrowthRateSummaryList>, Integer, Hash)> growth_rate_list_with_http_info(opts)

```ruby
begin
  # List growth rates
  data, status_code, headers = api_instance.growth_rate_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedGrowthRateSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->growth_rate_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedGrowthRateSummaryList**](PaginatedGrowthRateSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## growth_rate_retrieve

> <GrowthRateDetail> growth_rate_retrieve(id)

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get growth rate
  result = api_instance.growth_rate_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->growth_rate_retrieve: #{e}"
end
```

#### Using the growth_rate_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GrowthRateDetail>, Integer, Hash)> growth_rate_retrieve_with_http_info(id)

```ruby
begin
  # Get growth rate
  data, status_code, headers = api_instance.growth_rate_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GrowthRateDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->growth_rate_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**GrowthRateDetail**](GrowthRateDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_damage_class_list

> <PaginatedMoveDamageClassSummaryList> move_damage_class_list(opts)

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List move damage classes
  result = api_instance.move_damage_class_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->move_damage_class_list: #{e}"
end
```

#### Using the move_damage_class_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedMoveDamageClassSummaryList>, Integer, Hash)> move_damage_class_list_with_http_info(opts)

```ruby
begin
  # List move damage classes
  data, status_code, headers = api_instance.move_damage_class_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedMoveDamageClassSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->move_damage_class_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedMoveDamageClassSummaryList**](PaginatedMoveDamageClassSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## move_damage_class_retrieve

> <MoveDamageClassDetail> move_damage_class_retrieve(id)

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get move damage class
  result = api_instance.move_damage_class_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->move_damage_class_retrieve: #{e}"
end
```

#### Using the move_damage_class_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<MoveDamageClassDetail>, Integer, Hash)> move_damage_class_retrieve_with_http_info(id)

```ruby
begin
  # Get move damage class
  data, status_code, headers = api_instance.move_damage_class_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <MoveDamageClassDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->move_damage_class_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**MoveDamageClassDetail**](MoveDamageClassDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## nature_list

> <PaginatedNatureSummaryList> nature_list(opts)

List natures

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List natures
  result = api_instance.nature_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->nature_list: #{e}"
end
```

#### Using the nature_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedNatureSummaryList>, Integer, Hash)> nature_list_with_http_info(opts)

```ruby
begin
  # List natures
  data, status_code, headers = api_instance.nature_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedNatureSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->nature_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedNatureSummaryList**](PaginatedNatureSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## nature_retrieve

> <NatureDetail> nature_retrieve(id)

Get nature

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get nature
  result = api_instance.nature_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->nature_retrieve: #{e}"
end
```

#### Using the nature_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<NatureDetail>, Integer, Hash)> nature_retrieve_with_http_info(id)

```ruby
begin
  # Get nature
  data, status_code, headers = api_instance.nature_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <NatureDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->nature_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**NatureDetail**](NatureDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokeathlon_stat_list

> <PaginatedPokeathlonStatSummaryList> pokeathlon_stat_list(opts)

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List pokeathlon stats
  result = api_instance.pokeathlon_stat_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokeathlon_stat_list: #{e}"
end
```

#### Using the pokeathlon_stat_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedPokeathlonStatSummaryList>, Integer, Hash)> pokeathlon_stat_list_with_http_info(opts)

```ruby
begin
  # List pokeathlon stats
  data, status_code, headers = api_instance.pokeathlon_stat_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedPokeathlonStatSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokeathlon_stat_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedPokeathlonStatSummaryList**](PaginatedPokeathlonStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokeathlon_stat_retrieve

> <PokeathlonStatDetail> pokeathlon_stat_retrieve(id)

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get pokeathlon stat
  result = api_instance.pokeathlon_stat_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokeathlon_stat_retrieve: #{e}"
end
```

#### Using the pokeathlon_stat_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PokeathlonStatDetail>, Integer, Hash)> pokeathlon_stat_retrieve_with_http_info(id)

```ruby
begin
  # Get pokeathlon stat
  data, status_code, headers = api_instance.pokeathlon_stat_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PokeathlonStatDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokeathlon_stat_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**PokeathlonStatDetail**](PokeathlonStatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_color_list

> <PaginatedPokemonColorSummaryList> pokemon_color_list(opts)

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List pokemon colors
  result = api_instance.pokemon_color_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_color_list: #{e}"
end
```

#### Using the pokemon_color_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedPokemonColorSummaryList>, Integer, Hash)> pokemon_color_list_with_http_info(opts)

```ruby
begin
  # List pokemon colors
  data, status_code, headers = api_instance.pokemon_color_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedPokemonColorSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_color_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedPokemonColorSummaryList**](PaginatedPokemonColorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_color_retrieve

> <PokemonColorDetail> pokemon_color_retrieve(id)

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get pokemon color
  result = api_instance.pokemon_color_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_color_retrieve: #{e}"
end
```

#### Using the pokemon_color_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PokemonColorDetail>, Integer, Hash)> pokemon_color_retrieve_with_http_info(id)

```ruby
begin
  # Get pokemon color
  data, status_code, headers = api_instance.pokemon_color_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PokemonColorDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_color_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**PokemonColorDetail**](PokemonColorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_form_list

> <PaginatedPokemonFormSummaryList> pokemon_form_list(opts)

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List pokemon forms
  result = api_instance.pokemon_form_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_form_list: #{e}"
end
```

#### Using the pokemon_form_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedPokemonFormSummaryList>, Integer, Hash)> pokemon_form_list_with_http_info(opts)

```ruby
begin
  # List pokemon forms
  data, status_code, headers = api_instance.pokemon_form_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedPokemonFormSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_form_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedPokemonFormSummaryList**](PaginatedPokemonFormSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_form_retrieve

> <PokemonFormDetail> pokemon_form_retrieve(id)

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get pokemon form
  result = api_instance.pokemon_form_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_form_retrieve: #{e}"
end
```

#### Using the pokemon_form_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PokemonFormDetail>, Integer, Hash)> pokemon_form_retrieve_with_http_info(id)

```ruby
begin
  # Get pokemon form
  data, status_code, headers = api_instance.pokemon_form_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PokemonFormDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_form_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**PokemonFormDetail**](PokemonFormDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_habitat_list

> <PaginatedPokemonHabitatSummaryList> pokemon_habitat_list(opts)

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List pokemom habitas
  result = api_instance.pokemon_habitat_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_habitat_list: #{e}"
end
```

#### Using the pokemon_habitat_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedPokemonHabitatSummaryList>, Integer, Hash)> pokemon_habitat_list_with_http_info(opts)

```ruby
begin
  # List pokemom habitas
  data, status_code, headers = api_instance.pokemon_habitat_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedPokemonHabitatSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_habitat_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedPokemonHabitatSummaryList**](PaginatedPokemonHabitatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_habitat_retrieve

> <PokemonHabitatDetail> pokemon_habitat_retrieve(id)

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get pokemom habita
  result = api_instance.pokemon_habitat_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_habitat_retrieve: #{e}"
end
```

#### Using the pokemon_habitat_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PokemonHabitatDetail>, Integer, Hash)> pokemon_habitat_retrieve_with_http_info(id)

```ruby
begin
  # Get pokemom habita
  data, status_code, headers = api_instance.pokemon_habitat_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PokemonHabitatDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_habitat_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**PokemonHabitatDetail**](PokemonHabitatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_list

> <PaginatedPokemonSummaryList> pokemon_list(opts)

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List pokemon
  result = api_instance.pokemon_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_list: #{e}"
end
```

#### Using the pokemon_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedPokemonSummaryList>, Integer, Hash)> pokemon_list_with_http_info(opts)

```ruby
begin
  # List pokemon
  data, status_code, headers = api_instance.pokemon_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedPokemonSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedPokemonSummaryList**](PaginatedPokemonSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_retrieve

> <PokemonDetail> pokemon_retrieve(id)

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get pokemon
  result = api_instance.pokemon_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_retrieve: #{e}"
end
```

#### Using the pokemon_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PokemonDetail>, Integer, Hash)> pokemon_retrieve_with_http_info(id)

```ruby
begin
  # Get pokemon
  data, status_code, headers = api_instance.pokemon_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PokemonDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**PokemonDetail**](PokemonDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_shape_list

> <PaginatedPokemonShapeSummaryList> pokemon_shape_list(opts)

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List pokemon shapes
  result = api_instance.pokemon_shape_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_shape_list: #{e}"
end
```

#### Using the pokemon_shape_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedPokemonShapeSummaryList>, Integer, Hash)> pokemon_shape_list_with_http_info(opts)

```ruby
begin
  # List pokemon shapes
  data, status_code, headers = api_instance.pokemon_shape_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedPokemonShapeSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_shape_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedPokemonShapeSummaryList**](PaginatedPokemonShapeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_shape_retrieve

> <PokemonShapeDetail> pokemon_shape_retrieve(id)

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get pokemon shape
  result = api_instance.pokemon_shape_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_shape_retrieve: #{e}"
end
```

#### Using the pokemon_shape_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PokemonShapeDetail>, Integer, Hash)> pokemon_shape_retrieve_with_http_info(id)

```ruby
begin
  # Get pokemon shape
  data, status_code, headers = api_instance.pokemon_shape_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PokemonShapeDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_shape_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**PokemonShapeDetail**](PokemonShapeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_species_list

> <PaginatedPokemonSpeciesSummaryList> pokemon_species_list(opts)

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List pokemon species
  result = api_instance.pokemon_species_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_species_list: #{e}"
end
```

#### Using the pokemon_species_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedPokemonSpeciesSummaryList>, Integer, Hash)> pokemon_species_list_with_http_info(opts)

```ruby
begin
  # List pokemon species
  data, status_code, headers = api_instance.pokemon_species_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedPokemonSpeciesSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_species_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedPokemonSpeciesSummaryList**](PaginatedPokemonSpeciesSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## pokemon_species_retrieve

> <PokemonSpeciesDetail> pokemon_species_retrieve(id)

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get pokemon species
  result = api_instance.pokemon_species_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_species_retrieve: #{e}"
end
```

#### Using the pokemon_species_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PokemonSpeciesDetail>, Integer, Hash)> pokemon_species_retrieve_with_http_info(id)

```ruby
begin
  # Get pokemon species
  data, status_code, headers = api_instance.pokemon_species_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PokemonSpeciesDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->pokemon_species_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**PokemonSpeciesDetail**](PokemonSpeciesDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## stat_list

> <PaginatedStatSummaryList> stat_list(opts)

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List stats
  result = api_instance.stat_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->stat_list: #{e}"
end
```

#### Using the stat_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedStatSummaryList>, Integer, Hash)> stat_list_with_http_info(opts)

```ruby
begin
  # List stats
  data, status_code, headers = api_instance.stat_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedStatSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->stat_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedStatSummaryList**](PaginatedStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## stat_retrieve

> <StatDetail> stat_retrieve(id)

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get stat
  result = api_instance.stat_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->stat_retrieve: #{e}"
end
```

#### Using the stat_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<StatDetail>, Integer, Hash)> stat_retrieve_with_http_info(id)

```ruby
begin
  # Get stat
  data, status_code, headers = api_instance.stat_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <StatDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->stat_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**StatDetail**](StatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## type_list

> <PaginatedTypeSummaryList> type_list(opts)

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

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

api_instance = PokeApiClient::PokemonApi.new
opts = {
  limit: 56, # Integer | Number of results to return per page.
  offset: 56, # Integer | The initial index from which to return the results.
  q: 'q_example' # String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
}

begin
  # List types
  result = api_instance.type_list(opts)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->type_list: #{e}"
end
```

#### Using the type_list_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<PaginatedTypeSummaryList>, Integer, Hash)> type_list_with_http_info(opts)

```ruby
begin
  # List types
  data, status_code, headers = api_instance.type_list_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <PaginatedTypeSummaryList>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->type_list_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **limit** | **Integer** | Number of results to return per page. | [optional] |
| **offset** | **Integer** | The initial index from which to return the results. | [optional] |
| **q** | **String** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedTypeSummaryList**](PaginatedTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## type_retrieve

> <TypeDetail> type_retrieve(id)

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

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

api_instance = PokeApiClient::PokemonApi.new
id = 'id_example' # String | This parameter can be a string or an integer.

begin
  # Get types
  result = api_instance.type_retrieve(id)
  p result
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->type_retrieve: #{e}"
end
```

#### Using the type_retrieve_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<TypeDetail>, Integer, Hash)> type_retrieve_with_http_info(id)

```ruby
begin
  # Get types
  data, status_code, headers = api_instance.type_retrieve_with_http_info(id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <TypeDetail>
rescue PokeApiClient::ApiError => e
  puts "Error when calling PokemonApi->type_retrieve_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **id** | **String** | This parameter can be a string or an integer. |  |

### Return type

[**TypeDetail**](TypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

