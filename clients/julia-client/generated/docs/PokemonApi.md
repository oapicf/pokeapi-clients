# PokemonApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ability_list**](PokemonApi.md#ability_list) | **GET** /api/v2/ability/ | 
[**ability_retrieve**](PokemonApi.md#ability_retrieve) | **GET** /api/v2/ability/{id}/ | 
[**characteristic_list**](PokemonApi.md#characteristic_list) | **GET** /api/v2/characteristic/ | List charecterictics
[**characteristic_retrieve**](PokemonApi.md#characteristic_retrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
[**egg_group_list**](PokemonApi.md#egg_group_list) | **GET** /api/v2/egg-group/ | List egg groups
[**egg_group_retrieve**](PokemonApi.md#egg_group_retrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
[**gender_list**](PokemonApi.md#gender_list) | **GET** /api/v2/gender/ | List genders
[**gender_retrieve**](PokemonApi.md#gender_retrieve) | **GET** /api/v2/gender/{id}/ | Get gender
[**growth_rate_list**](PokemonApi.md#growth_rate_list) | **GET** /api/v2/growth-rate/ | List growth rates
[**growth_rate_retrieve**](PokemonApi.md#growth_rate_retrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
[**move_damage_class_list**](PokemonApi.md#move_damage_class_list) | **GET** /api/v2/move-damage-class/ | List move damage classes
[**move_damage_class_retrieve**](PokemonApi.md#move_damage_class_retrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
[**nature_list**](PokemonApi.md#nature_list) | **GET** /api/v2/nature/ | List natures
[**nature_retrieve**](PokemonApi.md#nature_retrieve) | **GET** /api/v2/nature/{id}/ | Get nature
[**pokeathlon_stat_list**](PokemonApi.md#pokeathlon_stat_list) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
[**pokeathlon_stat_retrieve**](PokemonApi.md#pokeathlon_stat_retrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
[**pokemon_color_list**](PokemonApi.md#pokemon_color_list) | **GET** /api/v2/pokemon-color/ | List pokemon colors
[**pokemon_color_retrieve**](PokemonApi.md#pokemon_color_retrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
[**pokemon_form_list**](PokemonApi.md#pokemon_form_list) | **GET** /api/v2/pokemon-form/ | List pokemon forms
[**pokemon_form_retrieve**](PokemonApi.md#pokemon_form_retrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
[**pokemon_habitat_list**](PokemonApi.md#pokemon_habitat_list) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
[**pokemon_habitat_retrieve**](PokemonApi.md#pokemon_habitat_retrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
[**pokemon_list**](PokemonApi.md#pokemon_list) | **GET** /api/v2/pokemon/ | List pokemon
[**pokemon_retrieve**](PokemonApi.md#pokemon_retrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
[**pokemon_shape_list**](PokemonApi.md#pokemon_shape_list) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
[**pokemon_shape_retrieve**](PokemonApi.md#pokemon_shape_retrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
[**pokemon_species_list**](PokemonApi.md#pokemon_species_list) | **GET** /api/v2/pokemon-species/ | List pokemon species
[**pokemon_species_retrieve**](PokemonApi.md#pokemon_species_retrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
[**stat_list**](PokemonApi.md#stat_list) | **GET** /api/v2/stat/ | List stats
[**stat_retrieve**](PokemonApi.md#stat_retrieve) | **GET** /api/v2/stat/{id}/ | Get stat
[**type_list**](PokemonApi.md#type_list) | **GET** /api/v2/type/ | List types
[**type_retrieve**](PokemonApi.md#type_retrieve) | **GET** /api/v2/type/{id}/ | Get types


# **ability_list**
> `ability_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedAbilitySummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `ability_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedAbilitySummaryList` }, `OpenAPI.Clients.ApiResponse`



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedAbilitySummaryList`**](PaginatedAbilitySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **ability_retrieve**
> `ability_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `AbilityDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `ability_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `AbilityDetail` }, `OpenAPI.Clients.ApiResponse`



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`AbilityDetail`**](AbilityDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **characteristic_list**
> `characteristic_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedCharacteristicSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `characteristic_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedCharacteristicSummaryList` }, `OpenAPI.Clients.ApiResponse`

List charecterictics

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedCharacteristicSummaryList`**](PaginatedCharacteristicSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **characteristic_retrieve**
> `characteristic_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `CharacteristicDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `characteristic_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `CharacteristicDetail` }, `OpenAPI.Clients.ApiResponse`

Get characteristic

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`CharacteristicDetail`**](CharacteristicDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **egg_group_list**
> `egg_group_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedEggGroupSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `egg_group_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedEggGroupSummaryList` }, `OpenAPI.Clients.ApiResponse`

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedEggGroupSummaryList`**](PaginatedEggGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **egg_group_retrieve**
> `egg_group_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `EggGroupDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `egg_group_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `EggGroupDetail` }, `OpenAPI.Clients.ApiResponse`

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`EggGroupDetail`**](EggGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **gender_list**
> `gender_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedGenderSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `gender_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedGenderSummaryList` }, `OpenAPI.Clients.ApiResponse`

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedGenderSummaryList`**](PaginatedGenderSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **gender_retrieve**
> `gender_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `GenderDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `gender_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `GenderDetail` }, `OpenAPI.Clients.ApiResponse`

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`GenderDetail`**](GenderDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **growth_rate_list**
> `growth_rate_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedGrowthRateSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `growth_rate_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedGrowthRateSummaryList` }, `OpenAPI.Clients.ApiResponse`

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedGrowthRateSummaryList`**](PaginatedGrowthRateSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **growth_rate_retrieve**
> `growth_rate_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `GrowthRateDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `growth_rate_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `GrowthRateDetail` }, `OpenAPI.Clients.ApiResponse`

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`GrowthRateDetail`**](GrowthRateDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_damage_class_list**
> `move_damage_class_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedMoveDamageClassSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_damage_class_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedMoveDamageClassSummaryList` }, `OpenAPI.Clients.ApiResponse`

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedMoveDamageClassSummaryList`**](PaginatedMoveDamageClassSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_damage_class_retrieve**
> `move_damage_class_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `MoveDamageClassDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_damage_class_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `MoveDamageClassDetail` }, `OpenAPI.Clients.ApiResponse`

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`MoveDamageClassDetail`**](MoveDamageClassDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **nature_list**
> `nature_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedNatureSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `nature_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedNatureSummaryList` }, `OpenAPI.Clients.ApiResponse`

List natures

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedNatureSummaryList`**](PaginatedNatureSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **nature_retrieve**
> `nature_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `NatureDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `nature_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `NatureDetail` }, `OpenAPI.Clients.ApiResponse`

Get nature

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`NatureDetail`**](NatureDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokeathlon_stat_list**
> `pokeathlon_stat_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedPokeathlonStatSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokeathlon_stat_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedPokeathlonStatSummaryList` }, `OpenAPI.Clients.ApiResponse`

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedPokeathlonStatSummaryList`**](PaginatedPokeathlonStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokeathlon_stat_retrieve**
> `pokeathlon_stat_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `PokeathlonStatDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokeathlon_stat_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `PokeathlonStatDetail` }, `OpenAPI.Clients.ApiResponse`

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`PokeathlonStatDetail`**](PokeathlonStatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_color_list**
> `pokemon_color_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedPokemonColorSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_color_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedPokemonColorSummaryList` }, `OpenAPI.Clients.ApiResponse`

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedPokemonColorSummaryList`**](PaginatedPokemonColorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_color_retrieve**
> `pokemon_color_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `PokemonColorDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_color_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `PokemonColorDetail` }, `OpenAPI.Clients.ApiResponse`

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`PokemonColorDetail`**](PokemonColorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_form_list**
> `pokemon_form_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedPokemonFormSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_form_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedPokemonFormSummaryList` }, `OpenAPI.Clients.ApiResponse`

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedPokemonFormSummaryList`**](PaginatedPokemonFormSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_form_retrieve**
> `pokemon_form_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `PokemonFormDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_form_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `PokemonFormDetail` }, `OpenAPI.Clients.ApiResponse`

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`PokemonFormDetail`**](PokemonFormDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_habitat_list**
> `pokemon_habitat_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedPokemonHabitatSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_habitat_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedPokemonHabitatSummaryList` }, `OpenAPI.Clients.ApiResponse`

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedPokemonHabitatSummaryList`**](PaginatedPokemonHabitatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_habitat_retrieve**
> `pokemon_habitat_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `PokemonHabitatDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_habitat_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `PokemonHabitatDetail` }, `OpenAPI.Clients.ApiResponse`

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`PokemonHabitatDetail`**](PokemonHabitatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_list**
> `pokemon_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedPokemonSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedPokemonSummaryList` }, `OpenAPI.Clients.ApiResponse`

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedPokemonSummaryList`**](PaginatedPokemonSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_retrieve**
> `pokemon_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `PokemonDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `PokemonDetail` }, `OpenAPI.Clients.ApiResponse`

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`PokemonDetail`**](PokemonDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_shape_list**
> `pokemon_shape_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedPokemonShapeSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_shape_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedPokemonShapeSummaryList` }, `OpenAPI.Clients.ApiResponse`

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedPokemonShapeSummaryList`**](PaginatedPokemonShapeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_shape_retrieve**
> `pokemon_shape_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `PokemonShapeDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_shape_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `PokemonShapeDetail` }, `OpenAPI.Clients.ApiResponse`

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`PokemonShapeDetail`**](PokemonShapeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_species_list**
> `pokemon_species_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedPokemonSpeciesSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_species_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedPokemonSpeciesSummaryList` }, `OpenAPI.Clients.ApiResponse`

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedPokemonSpeciesSummaryList`**](PaginatedPokemonSpeciesSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **pokemon_species_retrieve**
> `pokemon_species_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `PokemonSpeciesDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `pokemon_species_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `PokemonSpeciesDetail` }, `OpenAPI.Clients.ApiResponse`

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`PokemonSpeciesDetail`**](PokemonSpeciesDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **stat_list**
> `stat_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedStatSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `stat_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedStatSummaryList` }, `OpenAPI.Clients.ApiResponse`

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedStatSummaryList`**](PaginatedStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **stat_retrieve**
> `stat_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `StatDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `stat_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `StatDetail` }, `OpenAPI.Clients.ApiResponse`

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`StatDetail`**](StatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **type_list**
> `type_list`(_api::`PokemonApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedTypeSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `type_list`(_api::`PokemonApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedTypeSummaryList` }, `OpenAPI.Clients.ApiResponse`

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedTypeSummaryList`**](PaginatedTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **type_retrieve**
> `type_retrieve`(_api::`PokemonApi`, `id`::`String`; _mediaType=nothing) -> `TypeDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `type_retrieve`(_api::`PokemonApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `TypeDetail` }, `OpenAPI.Clients.ApiResponse`

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`PokemonApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`TypeDetail`**](TypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

