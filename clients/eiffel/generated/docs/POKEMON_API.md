# POKEMON_API

All URIs are relative to *https://pokeapi.co*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**ability_list**](POKEMON_API.md#ability_list) | **Get** /api/v2/ability/ | 
[**ability_retrieve**](POKEMON_API.md#ability_retrieve) | **Get** /api/v2/ability/{id}/ | 
[**characteristic_list**](POKEMON_API.md#characteristic_list) | **Get** /api/v2/characteristic/ | List charecterictics
[**characteristic_retrieve**](POKEMON_API.md#characteristic_retrieve) | **Get** /api/v2/characteristic/{id}/ | Get characteristic
[**egg_group_list**](POKEMON_API.md#egg_group_list) | **Get** /api/v2/egg-group/ | List egg groups
[**egg_group_retrieve**](POKEMON_API.md#egg_group_retrieve) | **Get** /api/v2/egg-group/{id}/ | Get egg group
[**gender_list**](POKEMON_API.md#gender_list) | **Get** /api/v2/gender/ | List genders
[**gender_retrieve**](POKEMON_API.md#gender_retrieve) | **Get** /api/v2/gender/{id}/ | Get gender
[**growth_rate_list**](POKEMON_API.md#growth_rate_list) | **Get** /api/v2/growth-rate/ | List growth rates
[**growth_rate_retrieve**](POKEMON_API.md#growth_rate_retrieve) | **Get** /api/v2/growth-rate/{id}/ | Get growth rate
[**move_damage_class_list**](POKEMON_API.md#move_damage_class_list) | **Get** /api/v2/move-damage-class/ | List move damage classes
[**move_damage_class_retrieve**](POKEMON_API.md#move_damage_class_retrieve) | **Get** /api/v2/move-damage-class/{id}/ | Get move damage class
[**nature_list**](POKEMON_API.md#nature_list) | **Get** /api/v2/nature/ | List natures
[**nature_retrieve**](POKEMON_API.md#nature_retrieve) | **Get** /api/v2/nature/{id}/ | Get nature
[**pokeathlon_stat_list**](POKEMON_API.md#pokeathlon_stat_list) | **Get** /api/v2/pokeathlon-stat/ | List pokeathlon stats
[**pokeathlon_stat_retrieve**](POKEMON_API.md#pokeathlon_stat_retrieve) | **Get** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
[**pokemon_color_list**](POKEMON_API.md#pokemon_color_list) | **Get** /api/v2/pokemon-color/ | List pokemon colors
[**pokemon_color_retrieve**](POKEMON_API.md#pokemon_color_retrieve) | **Get** /api/v2/pokemon-color/{id}/ | Get pokemon color
[**pokemon_form_list**](POKEMON_API.md#pokemon_form_list) | **Get** /api/v2/pokemon-form/ | List pokemon forms
[**pokemon_form_retrieve**](POKEMON_API.md#pokemon_form_retrieve) | **Get** /api/v2/pokemon-form/{id}/ | Get pokemon form
[**pokemon_habitat_list**](POKEMON_API.md#pokemon_habitat_list) | **Get** /api/v2/pokemon-habitat/ | List pokemom habitas
[**pokemon_habitat_retrieve**](POKEMON_API.md#pokemon_habitat_retrieve) | **Get** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
[**pokemon_list**](POKEMON_API.md#pokemon_list) | **Get** /api/v2/pokemon/ | List pokemon
[**pokemon_retrieve**](POKEMON_API.md#pokemon_retrieve) | **Get** /api/v2/pokemon/{id}/ | Get pokemon
[**pokemon_shape_list**](POKEMON_API.md#pokemon_shape_list) | **Get** /api/v2/pokemon-shape/ | List pokemon shapes
[**pokemon_shape_retrieve**](POKEMON_API.md#pokemon_shape_retrieve) | **Get** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
[**pokemon_species_list**](POKEMON_API.md#pokemon_species_list) | **Get** /api/v2/pokemon-species/ | List pokemon species
[**pokemon_species_retrieve**](POKEMON_API.md#pokemon_species_retrieve) | **Get** /api/v2/pokemon-species/{id}/ | Get pokemon species
[**stat_list**](POKEMON_API.md#stat_list) | **Get** /api/v2/stat/ | List stats
[**stat_retrieve**](POKEMON_API.md#stat_retrieve) | **Get** /api/v2/stat/{id}/ | Get stat
[**type_list**](POKEMON_API.md#type_list) | **Get** /api/v2/type/ | List types
[**type_retrieve**](POKEMON_API.md#type_retrieve) | **Get** /api/v2/type/{id}/ | Get types


# **ability_list**
> ability_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_ABILITY_SUMMARY_LIST




Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_ABILITY_SUMMARY_LIST**](PaginatedAbilitySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ability_retrieve**
> ability_retrieve (id: STRING_32 ): detachable ABILITY_DETAIL




Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**ABILITY_DETAIL**](AbilityDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **characteristic_list**
> characteristic_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_CHARACTERISTIC_SUMMARY_LIST


List charecterictics

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_CHARACTERISTIC_SUMMARY_LIST**](PaginatedCharacteristicSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **characteristic_retrieve**
> characteristic_retrieve (id: STRING_32 ): detachable CHARACTERISTIC_DETAIL


Get characteristic

Characteristics indicate which stat contains a Pokémon's highest IV. A Pokémon's Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**CHARACTERISTIC_DETAIL**](CharacteristicDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **egg_group_list**
> egg_group_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_EGG_GROUP_SUMMARY_LIST


List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_EGG_GROUP_SUMMARY_LIST**](PaginatedEggGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **egg_group_retrieve**
> egg_group_retrieve (id: STRING_32 ): detachable EGG_GROUP_DETAIL


Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**EGG_GROUP_DETAIL**](EggGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gender_list**
> gender_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_GENDER_SUMMARY_LIST


List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_GENDER_SUMMARY_LIST**](PaginatedGenderSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **gender_retrieve**
> gender_retrieve (id: STRING_32 ): detachable GENDER_DETAIL


Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**GENDER_DETAIL**](GenderDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **growth_rate_list**
> growth_rate_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_GROWTH_RATE_SUMMARY_LIST


List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_GROWTH_RATE_SUMMARY_LIST**](PaginatedGrowthRateSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **growth_rate_retrieve**
> growth_rate_retrieve (id: STRING_32 ): detachable GROWTH_RATE_DETAIL


Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**GROWTH_RATE_DETAIL**](GrowthRateDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_damage_class_list**
> move_damage_class_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_MOVE_DAMAGE_CLASS_SUMMARY_LIST


List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_MOVE_DAMAGE_CLASS_SUMMARY_LIST**](PaginatedMoveDamageClassSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **move_damage_class_retrieve**
> move_damage_class_retrieve (id: STRING_32 ): detachable MOVE_DAMAGE_CLASS_DETAIL


Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**MOVE_DAMAGE_CLASS_DETAIL**](MoveDamageClassDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **nature_list**
> nature_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_NATURE_SUMMARY_LIST


List natures

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_NATURE_SUMMARY_LIST**](PaginatedNatureSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **nature_retrieve**
> nature_retrieve (id: STRING_32 ): detachable NATURE_DETAIL


Get nature

Natures influence how a Pokémon's stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**NATURE_DETAIL**](NatureDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokeathlon_stat_list**
> pokeathlon_stat_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_POKEATHLON_STAT_SUMMARY_LIST


List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_POKEATHLON_STAT_SUMMARY_LIST**](PaginatedPokeathlonStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokeathlon_stat_retrieve**
> pokeathlon_stat_retrieve (id: STRING_32 ): detachable POKEATHLON_STAT_DETAIL


Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon's performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**POKEATHLON_STAT_DETAIL**](PokeathlonStatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_color_list**
> pokemon_color_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_POKEMON_COLOR_SUMMARY_LIST


List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_POKEMON_COLOR_SUMMARY_LIST**](PaginatedPokemonColorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_color_retrieve**
> pokemon_color_retrieve (id: STRING_32 ): detachable POKEMON_COLOR_DETAIL


Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon's body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**POKEMON_COLOR_DETAIL**](PokemonColorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_form_list**
> pokemon_form_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_POKEMON_FORM_SUMMARY_LIST


List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_POKEMON_FORM_SUMMARY_LIST**](PaginatedPokemonFormSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_form_retrieve**
> pokemon_form_retrieve (id: STRING_32 ): detachable POKEMON_FORM_DETAIL


Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the 'Pokémon' entity is used to represent such a variety.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**POKEMON_FORM_DETAIL**](PokemonFormDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_habitat_list**
> pokemon_habitat_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_POKEMON_HABITAT_SUMMARY_LIST


List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_POKEMON_HABITAT_SUMMARY_LIST**](PaginatedPokemonHabitatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_habitat_retrieve**
> pokemon_habitat_retrieve (id: STRING_32 ): detachable POKEMON_HABITAT_DETAIL


Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**POKEMON_HABITAT_DETAIL**](PokemonHabitatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_list**
> pokemon_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_POKEMON_SUMMARY_LIST


List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_POKEMON_SUMMARY_LIST**](PaginatedPokemonSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_retrieve**
> pokemon_retrieve (id: STRING_32 ): detachable POKEMON_DETAIL


Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**POKEMON_DETAIL**](PokemonDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_shape_list**
> pokemon_shape_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_POKEMON_SHAPE_SUMMARY_LIST


List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_POKEMON_SHAPE_SUMMARY_LIST**](PaginatedPokemonShapeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_shape_retrieve**
> pokemon_shape_retrieve (id: STRING_32 ): detachable POKEMON_SHAPE_DETAIL


Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**POKEMON_SHAPE_DETAIL**](PokemonShapeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_species_list**
> pokemon_species_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_POKEMON_SPECIES_SUMMARY_LIST


List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_POKEMON_SPECIES_SUMMARY_LIST**](PaginatedPokemonSpeciesSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **pokemon_species_retrieve**
> pokemon_species_retrieve (id: STRING_32 ): detachable POKEMON_SPECIES_DETAIL


Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**POKEMON_SPECIES_DETAIL**](PokemonSpeciesDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stat_list**
> stat_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_STAT_SUMMARY_LIST


List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_STAT_SUMMARY_LIST**](PaginatedStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **stat_retrieve**
> stat_retrieve (id: STRING_32 ): detachable STAT_DETAIL


Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**STAT_DETAIL**](StatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **type_list**
> type_list (limit:  detachable INTEGER_32 ; offset:  detachable INTEGER_32 ; q:  detachable STRING_32 ): detachable PAGINATED_TYPE_SUMMARY_LIST


List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **INTEGER_32**| Number of results to return per page. | [optional] [default to null]
 **offset** | **INTEGER_32**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **STRING_32**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PAGINATED_TYPE_SUMMARY_LIST**](PaginatedTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **type_retrieve**
> type_retrieve (id: STRING_32 ): detachable TYPE_DETAIL


Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **STRING_32**| This parameter can be a string or an integer. | [default to null]

### Return type

[**TYPE_DETAIL**](TypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

