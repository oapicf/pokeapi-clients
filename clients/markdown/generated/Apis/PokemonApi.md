# PokemonApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**abilityList**](PokemonApi.md#abilityList) | **GET** /api/v2/ability/ |  |
| [**abilityRetrieve**](PokemonApi.md#abilityRetrieve) | **GET** /api/v2/ability/{id}/ |  |
| [**characteristicList**](PokemonApi.md#characteristicList) | **GET** /api/v2/characteristic/ | List charecterictics |
| [**characteristicRetrieve**](PokemonApi.md#characteristicRetrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic |
| [**eggGroupList**](PokemonApi.md#eggGroupList) | **GET** /api/v2/egg-group/ | List egg groups |
| [**eggGroupRetrieve**](PokemonApi.md#eggGroupRetrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group |
| [**genderList**](PokemonApi.md#genderList) | **GET** /api/v2/gender/ | List genders |
| [**genderRetrieve**](PokemonApi.md#genderRetrieve) | **GET** /api/v2/gender/{id}/ | Get gender |
| [**growthRateList**](PokemonApi.md#growthRateList) | **GET** /api/v2/growth-rate/ | List growth rates |
| [**growthRateRetrieve**](PokemonApi.md#growthRateRetrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate |
| [**moveDamageClassList**](PokemonApi.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | List move damage classes |
| [**moveDamageClassRetrieve**](PokemonApi.md#moveDamageClassRetrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class |
| [**natureList**](PokemonApi.md#natureList) | **GET** /api/v2/nature/ | List natures |
| [**natureRetrieve**](PokemonApi.md#natureRetrieve) | **GET** /api/v2/nature/{id}/ | Get nature |
| [**pokeathlonStatList**](PokemonApi.md#pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats |
| [**pokeathlonStatRetrieve**](PokemonApi.md#pokeathlonStatRetrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat |
| [**pokemonColorList**](PokemonApi.md#pokemonColorList) | **GET** /api/v2/pokemon-color/ | List pokemon colors |
| [**pokemonColorRetrieve**](PokemonApi.md#pokemonColorRetrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color |
| [**pokemonFormList**](PokemonApi.md#pokemonFormList) | **GET** /api/v2/pokemon-form/ | List pokemon forms |
| [**pokemonFormRetrieve**](PokemonApi.md#pokemonFormRetrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form |
| [**pokemonHabitatList**](PokemonApi.md#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas |
| [**pokemonHabitatRetrieve**](PokemonApi.md#pokemonHabitatRetrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita |
| [**pokemonList**](PokemonApi.md#pokemonList) | **GET** /api/v2/pokemon/ | List pokemon |
| [**pokemonRetrieve**](PokemonApi.md#pokemonRetrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon |
| [**pokemonShapeList**](PokemonApi.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes |
| [**pokemonShapeRetrieve**](PokemonApi.md#pokemonShapeRetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape |
| [**pokemonSpeciesList**](PokemonApi.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | List pokemon species |
| [**pokemonSpeciesRetrieve**](PokemonApi.md#pokemonSpeciesRetrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species |
| [**statList**](PokemonApi.md#statList) | **GET** /api/v2/stat/ | List stats |
| [**statRetrieve**](PokemonApi.md#statRetrieve) | **GET** /api/v2/stat/{id}/ | Get stat |
| [**typeList**](PokemonApi.md#typeList) | **GET** /api/v2/type/ | List types |
| [**typeRetrieve**](PokemonApi.md#typeRetrieve) | **GET** /api/v2/type/{id}/ | Get types |


<a name="abilityList"></a>
# **abilityList**
> PaginatedAbilitySummaryList abilityList(limit, offset, q)



    Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedAbilitySummaryList**](../Models/PaginatedAbilitySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="abilityRetrieve"></a>
# **abilityRetrieve**
> AbilityDetail abilityRetrieve(id)



    Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**AbilityDetail**](../Models/AbilityDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="characteristicList"></a>
# **characteristicList**
> PaginatedCharacteristicSummaryList characteristicList(limit, offset, q)

List charecterictics

    Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedCharacteristicSummaryList**](../Models/PaginatedCharacteristicSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="characteristicRetrieve"></a>
# **characteristicRetrieve**
> CharacteristicDetail characteristicRetrieve(id)

Get characteristic

    Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**CharacteristicDetail**](../Models/CharacteristicDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="eggGroupList"></a>
# **eggGroupList**
> PaginatedEggGroupSummaryList eggGroupList(limit, offset, q)

List egg groups

    Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedEggGroupSummaryList**](../Models/PaginatedEggGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="eggGroupRetrieve"></a>
# **eggGroupRetrieve**
> EggGroupDetail eggGroupRetrieve(id)

Get egg group

    Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**EggGroupDetail**](../Models/EggGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="genderList"></a>
# **genderList**
> PaginatedGenderSummaryList genderList(limit, offset, q)

List genders

    Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedGenderSummaryList**](../Models/PaginatedGenderSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="genderRetrieve"></a>
# **genderRetrieve**
> GenderDetail genderRetrieve(id)

Get gender

    Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**GenderDetail**](../Models/GenderDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="growthRateList"></a>
# **growthRateList**
> PaginatedGrowthRateSummaryList growthRateList(limit, offset, q)

List growth rates

    Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedGrowthRateSummaryList**](../Models/PaginatedGrowthRateSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="growthRateRetrieve"></a>
# **growthRateRetrieve**
> GrowthRateDetail growthRateRetrieve(id)

Get growth rate

    Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**GrowthRateDetail**](../Models/GrowthRateDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveDamageClassList"></a>
# **moveDamageClassList**
> PaginatedMoveDamageClassSummaryList moveDamageClassList(limit, offset, q)

List move damage classes

    Damage classes moves can have, e.g. physical, special, or non-damaging.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedMoveDamageClassSummaryList**](../Models/PaginatedMoveDamageClassSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveDamageClassRetrieve"></a>
# **moveDamageClassRetrieve**
> MoveDamageClassDetail moveDamageClassRetrieve(id)

Get move damage class

    Damage classes moves can have, e.g. physical, special, or non-damaging.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**MoveDamageClassDetail**](../Models/MoveDamageClassDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="natureList"></a>
# **natureList**
> PaginatedNatureSummaryList natureList(limit, offset, q)

List natures

    Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedNatureSummaryList**](../Models/PaginatedNatureSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="natureRetrieve"></a>
# **natureRetrieve**
> NatureDetail natureRetrieve(id)

Get nature

    Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**NatureDetail**](../Models/NatureDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokeathlonStatList"></a>
# **pokeathlonStatList**
> PaginatedPokeathlonStatSummaryList pokeathlonStatList(limit, offset, q)

List pokeathlon stats

    Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedPokeathlonStatSummaryList**](../Models/PaginatedPokeathlonStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokeathlonStatRetrieve"></a>
# **pokeathlonStatRetrieve**
> PokeathlonStatDetail pokeathlonStatRetrieve(id)

Get pokeathlon stat

    Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**PokeathlonStatDetail**](../Models/PokeathlonStatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonColorList"></a>
# **pokemonColorList**
> PaginatedPokemonColorSummaryList pokemonColorList(limit, offset, q)

List pokemon colors

    Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedPokemonColorSummaryList**](../Models/PaginatedPokemonColorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonColorRetrieve"></a>
# **pokemonColorRetrieve**
> PokemonColorDetail pokemonColorRetrieve(id)

Get pokemon color

    Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**PokemonColorDetail**](../Models/PokemonColorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonFormList"></a>
# **pokemonFormList**
> PaginatedPokemonFormSummaryList pokemonFormList(limit, offset, q)

List pokemon forms

    Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedPokemonFormSummaryList**](../Models/PaginatedPokemonFormSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonFormRetrieve"></a>
# **pokemonFormRetrieve**
> PokemonFormDetail pokemonFormRetrieve(id)

Get pokemon form

    Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**PokemonFormDetail**](../Models/PokemonFormDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonHabitatList"></a>
# **pokemonHabitatList**
> PaginatedPokemonHabitatSummaryList pokemonHabitatList(limit, offset, q)

List pokemom habitas

    Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedPokemonHabitatSummaryList**](../Models/PaginatedPokemonHabitatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonHabitatRetrieve"></a>
# **pokemonHabitatRetrieve**
> PokemonHabitatDetail pokemonHabitatRetrieve(id)

Get pokemom habita

    Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**PokemonHabitatDetail**](../Models/PokemonHabitatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonList"></a>
# **pokemonList**
> PaginatedPokemonSummaryList pokemonList(limit, offset, q)

List pokemon

    Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedPokemonSummaryList**](../Models/PaginatedPokemonSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonRetrieve"></a>
# **pokemonRetrieve**
> PokemonDetail pokemonRetrieve(id)

Get pokemon

    Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**PokemonDetail**](../Models/PokemonDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonShapeList"></a>
# **pokemonShapeList**
> PaginatedPokemonShapeSummaryList pokemonShapeList(limit, offset, q)

List pokemon shapes

    Shapes used for sorting Pokémon in a Pokédex.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedPokemonShapeSummaryList**](../Models/PaginatedPokemonShapeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonShapeRetrieve"></a>
# **pokemonShapeRetrieve**
> PokemonShapeDetail pokemonShapeRetrieve(id)

Get pokemon shape

    Shapes used for sorting Pokémon in a Pokédex.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**PokemonShapeDetail**](../Models/PokemonShapeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonSpeciesList"></a>
# **pokemonSpeciesList**
> PaginatedPokemonSpeciesSummaryList pokemonSpeciesList(limit, offset, q)

List pokemon species

    A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedPokemonSpeciesSummaryList**](../Models/PaginatedPokemonSpeciesSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="pokemonSpeciesRetrieve"></a>
# **pokemonSpeciesRetrieve**
> PokemonSpeciesDetail pokemonSpeciesRetrieve(id)

Get pokemon species

    A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**PokemonSpeciesDetail**](../Models/PokemonSpeciesDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="statList"></a>
# **statList**
> PaginatedStatSummaryList statList(limit, offset, q)

List stats

    Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedStatSummaryList**](../Models/PaginatedStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="statRetrieve"></a>
# **statRetrieve**
> StatDetail statRetrieve(id)

Get stat

    Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**StatDetail**](../Models/StatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="typeList"></a>
# **typeList**
> PaginatedTypeSummaryList typeList(limit, offset, q)

List types

    Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedTypeSummaryList**](../Models/PaginatedTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="typeRetrieve"></a>
# **typeRetrieve**
> TypeDetail typeRetrieve(id)

Get types

    Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**TypeDetail**](../Models/TypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

