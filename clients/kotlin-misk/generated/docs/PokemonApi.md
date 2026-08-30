# PokemonApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abilityList**](PokemonApi.md#abilityList) | **Get** /api/v2/ability/ | 
[**abilityRetrieve**](PokemonApi.md#abilityRetrieve) | **Get** /api/v2/ability/{id}/ | 
[**characteristicList**](PokemonApi.md#characteristicList) | **Get** /api/v2/characteristic/ | List charecterictics
[**characteristicRetrieve**](PokemonApi.md#characteristicRetrieve) | **Get** /api/v2/characteristic/{id}/ | Get characteristic
[**eggGroupList**](PokemonApi.md#eggGroupList) | **Get** /api/v2/egg-group/ | List egg groups
[**eggGroupRetrieve**](PokemonApi.md#eggGroupRetrieve) | **Get** /api/v2/egg-group/{id}/ | Get egg group
[**genderList**](PokemonApi.md#genderList) | **Get** /api/v2/gender/ | List genders
[**genderRetrieve**](PokemonApi.md#genderRetrieve) | **Get** /api/v2/gender/{id}/ | Get gender
[**growthRateList**](PokemonApi.md#growthRateList) | **Get** /api/v2/growth-rate/ | List growth rates
[**growthRateRetrieve**](PokemonApi.md#growthRateRetrieve) | **Get** /api/v2/growth-rate/{id}/ | Get growth rate
[**moveDamageClassList**](PokemonApi.md#moveDamageClassList) | **Get** /api/v2/move-damage-class/ | List move damage classes
[**moveDamageClassRetrieve**](PokemonApi.md#moveDamageClassRetrieve) | **Get** /api/v2/move-damage-class/{id}/ | Get move damage class
[**natureList**](PokemonApi.md#natureList) | **Get** /api/v2/nature/ | List natures
[**natureRetrieve**](PokemonApi.md#natureRetrieve) | **Get** /api/v2/nature/{id}/ | Get nature
[**pokeathlonStatList**](PokemonApi.md#pokeathlonStatList) | **Get** /api/v2/pokeathlon-stat/ | List pokeathlon stats
[**pokeathlonStatRetrieve**](PokemonApi.md#pokeathlonStatRetrieve) | **Get** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
[**pokemonColorList**](PokemonApi.md#pokemonColorList) | **Get** /api/v2/pokemon-color/ | List pokemon colors
[**pokemonColorRetrieve**](PokemonApi.md#pokemonColorRetrieve) | **Get** /api/v2/pokemon-color/{id}/ | Get pokemon color
[**pokemonFormList**](PokemonApi.md#pokemonFormList) | **Get** /api/v2/pokemon-form/ | List pokemon forms
[**pokemonFormRetrieve**](PokemonApi.md#pokemonFormRetrieve) | **Get** /api/v2/pokemon-form/{id}/ | Get pokemon form
[**pokemonHabitatList**](PokemonApi.md#pokemonHabitatList) | **Get** /api/v2/pokemon-habitat/ | List pokemom habitas
[**pokemonHabitatRetrieve**](PokemonApi.md#pokemonHabitatRetrieve) | **Get** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
[**pokemonList**](PokemonApi.md#pokemonList) | **Get** /api/v2/pokemon/ | List pokemon
[**pokemonRetrieve**](PokemonApi.md#pokemonRetrieve) | **Get** /api/v2/pokemon/{id}/ | Get pokemon
[**pokemonShapeList**](PokemonApi.md#pokemonShapeList) | **Get** /api/v2/pokemon-shape/ | List pokemon shapes
[**pokemonShapeRetrieve**](PokemonApi.md#pokemonShapeRetrieve) | **Get** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
[**pokemonSpeciesList**](PokemonApi.md#pokemonSpeciesList) | **Get** /api/v2/pokemon-species/ | List pokemon species
[**pokemonSpeciesRetrieve**](PokemonApi.md#pokemonSpeciesRetrieve) | **Get** /api/v2/pokemon-species/{id}/ | Get pokemon species
[**statList**](PokemonApi.md#statList) | **Get** /api/v2/stat/ | List stats
[**statRetrieve**](PokemonApi.md#statRetrieve) | **Get** /api/v2/stat/{id}/ | Get stat
[**typeList**](PokemonApi.md#typeList) | **Get** /api/v2/type/ | List types
[**typeRetrieve**](PokemonApi.md#typeRetrieve) | **Get** /api/v2/type/{id}/ | Get types


<a name="abilityList"></a>
# **abilityList**
> PaginatedAbilitySummaryList abilityList(limit, offset, q)



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedAbilitySummaryList = apiInstance.abilityList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#abilityList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#abilityList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedAbilitySummaryList**](PaginatedAbilitySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="abilityRetrieve"></a>
# **abilityRetrieve**
> AbilityDetail abilityRetrieve(id)



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : AbilityDetail = apiInstance.abilityRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#abilityRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#abilityRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**AbilityDetail**](AbilityDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="characteristicList"></a>
# **characteristicList**
> PaginatedCharacteristicSummaryList characteristicList(limit, offset, q)

List charecterictics

Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedCharacteristicSummaryList = apiInstance.characteristicList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#characteristicList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#characteristicList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedCharacteristicSummaryList**](PaginatedCharacteristicSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="characteristicRetrieve"></a>
# **characteristicRetrieve**
> CharacteristicDetail characteristicRetrieve(id)

Get characteristic

Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : CharacteristicDetail = apiInstance.characteristicRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#characteristicRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#characteristicRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**CharacteristicDetail**](CharacteristicDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="eggGroupList"></a>
# **eggGroupList**
> PaginatedEggGroupSummaryList eggGroupList(limit, offset, q)

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedEggGroupSummaryList = apiInstance.eggGroupList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#eggGroupList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#eggGroupList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedEggGroupSummaryList**](PaginatedEggGroupSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="eggGroupRetrieve"></a>
# **eggGroupRetrieve**
> EggGroupDetail eggGroupRetrieve(id)

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : EggGroupDetail = apiInstance.eggGroupRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#eggGroupRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#eggGroupRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**EggGroupDetail**](EggGroupDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="genderList"></a>
# **genderList**
> PaginatedGenderSummaryList genderList(limit, offset, q)

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedGenderSummaryList = apiInstance.genderList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#genderList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#genderList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedGenderSummaryList**](PaginatedGenderSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="genderRetrieve"></a>
# **genderRetrieve**
> GenderDetail genderRetrieve(id)

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : GenderDetail = apiInstance.genderRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#genderRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#genderRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**GenderDetail**](GenderDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="growthRateList"></a>
# **growthRateList**
> PaginatedGrowthRateSummaryList growthRateList(limit, offset, q)

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedGrowthRateSummaryList = apiInstance.growthRateList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#growthRateList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#growthRateList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedGrowthRateSummaryList**](PaginatedGrowthRateSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="growthRateRetrieve"></a>
# **growthRateRetrieve**
> GrowthRateDetail growthRateRetrieve(id)

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : GrowthRateDetail = apiInstance.growthRateRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#growthRateRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#growthRateRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**GrowthRateDetail**](GrowthRateDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveDamageClassList"></a>
# **moveDamageClassList**
> PaginatedMoveDamageClassSummaryList moveDamageClassList(limit, offset, q)

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedMoveDamageClassSummaryList = apiInstance.moveDamageClassList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#moveDamageClassList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#moveDamageClassList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedMoveDamageClassSummaryList**](PaginatedMoveDamageClassSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="moveDamageClassRetrieve"></a>
# **moveDamageClassRetrieve**
> MoveDamageClassDetail moveDamageClassRetrieve(id)

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : MoveDamageClassDetail = apiInstance.moveDamageClassRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#moveDamageClassRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#moveDamageClassRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**MoveDamageClassDetail**](MoveDamageClassDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="natureList"></a>
# **natureList**
> PaginatedNatureSummaryList natureList(limit, offset, q)

List natures

Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedNatureSummaryList = apiInstance.natureList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#natureList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#natureList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedNatureSummaryList**](PaginatedNatureSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="natureRetrieve"></a>
# **natureRetrieve**
> NatureDetail natureRetrieve(id)

Get nature

Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : NatureDetail = apiInstance.natureRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#natureRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#natureRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**NatureDetail**](NatureDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokeathlonStatList"></a>
# **pokeathlonStatList**
> PaginatedPokeathlonStatSummaryList pokeathlonStatList(limit, offset, q)

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedPokeathlonStatSummaryList = apiInstance.pokeathlonStatList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokeathlonStatList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokeathlonStatList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedPokeathlonStatSummaryList**](PaginatedPokeathlonStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokeathlonStatRetrieve"></a>
# **pokeathlonStatRetrieve**
> PokeathlonStatDetail pokeathlonStatRetrieve(id)

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : PokeathlonStatDetail = apiInstance.pokeathlonStatRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokeathlonStatRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokeathlonStatRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**PokeathlonStatDetail**](PokeathlonStatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonColorList"></a>
# **pokemonColorList**
> PaginatedPokemonColorSummaryList pokemonColorList(limit, offset, q)

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedPokemonColorSummaryList = apiInstance.pokemonColorList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonColorList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonColorList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedPokemonColorSummaryList**](PaginatedPokemonColorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonColorRetrieve"></a>
# **pokemonColorRetrieve**
> PokemonColorDetail pokemonColorRetrieve(id)

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : PokemonColorDetail = apiInstance.pokemonColorRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonColorRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonColorRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**PokemonColorDetail**](PokemonColorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonFormList"></a>
# **pokemonFormList**
> PaginatedPokemonFormSummaryList pokemonFormList(limit, offset, q)

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedPokemonFormSummaryList = apiInstance.pokemonFormList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonFormList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonFormList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedPokemonFormSummaryList**](PaginatedPokemonFormSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonFormRetrieve"></a>
# **pokemonFormRetrieve**
> PokemonFormDetail pokemonFormRetrieve(id)

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : PokemonFormDetail = apiInstance.pokemonFormRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonFormRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonFormRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**PokemonFormDetail**](PokemonFormDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonHabitatList"></a>
# **pokemonHabitatList**
> PaginatedPokemonHabitatSummaryList pokemonHabitatList(limit, offset, q)

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedPokemonHabitatSummaryList = apiInstance.pokemonHabitatList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonHabitatList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonHabitatList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedPokemonHabitatSummaryList**](PaginatedPokemonHabitatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonHabitatRetrieve"></a>
# **pokemonHabitatRetrieve**
> PokemonHabitatDetail pokemonHabitatRetrieve(id)

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : PokemonHabitatDetail = apiInstance.pokemonHabitatRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonHabitatRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonHabitatRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**PokemonHabitatDetail**](PokemonHabitatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonList"></a>
# **pokemonList**
> PaginatedPokemonSummaryList pokemonList(limit, offset, q)

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedPokemonSummaryList = apiInstance.pokemonList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedPokemonSummaryList**](PaginatedPokemonSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonRetrieve"></a>
# **pokemonRetrieve**
> PokemonDetail pokemonRetrieve(id)

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : PokemonDetail = apiInstance.pokemonRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**PokemonDetail**](PokemonDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonShapeList"></a>
# **pokemonShapeList**
> PaginatedPokemonShapeSummaryList pokemonShapeList(limit, offset, q)

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedPokemonShapeSummaryList = apiInstance.pokemonShapeList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonShapeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonShapeList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedPokemonShapeSummaryList**](PaginatedPokemonShapeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonShapeRetrieve"></a>
# **pokemonShapeRetrieve**
> PokemonShapeDetail pokemonShapeRetrieve(id)

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : PokemonShapeDetail = apiInstance.pokemonShapeRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonShapeRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonShapeRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**PokemonShapeDetail**](PokemonShapeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonSpeciesList"></a>
# **pokemonSpeciesList**
> PaginatedPokemonSpeciesSummaryList pokemonSpeciesList(limit, offset, q)

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedPokemonSpeciesSummaryList = apiInstance.pokemonSpeciesList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonSpeciesList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonSpeciesList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedPokemonSpeciesSummaryList**](PaginatedPokemonSpeciesSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="pokemonSpeciesRetrieve"></a>
# **pokemonSpeciesRetrieve**
> PokemonSpeciesDetail pokemonSpeciesRetrieve(id)

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : PokemonSpeciesDetail = apiInstance.pokemonSpeciesRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#pokemonSpeciesRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#pokemonSpeciesRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**PokemonSpeciesDetail**](PokemonSpeciesDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="statList"></a>
# **statList**
> PaginatedStatSummaryList statList(limit, offset, q)

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedStatSummaryList = apiInstance.statList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#statList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#statList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedStatSummaryList**](PaginatedStatSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="statRetrieve"></a>
# **statRetrieve**
> StatDetail statRetrieve(id)

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : StatDetail = apiInstance.statRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#statRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#statRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**StatDetail**](StatDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="typeList"></a>
# **typeList**
> PaginatedTypeSummaryList typeList(limit, offset, q)

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedTypeSummaryList = apiInstance.typeList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#typeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#typeList")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **kotlin.Int**| Number of results to return per page. | [optional]
 **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional]
 **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]

### Return type

[**PaginatedTypeSummaryList**](PaginatedTypeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

<a name="typeRetrieve"></a>
# **typeRetrieve**
> TypeDetail typeRetrieve(id)

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example
```kotlin
// Import classes:
//import org.openapitools.infrastructure.*
//import org.openapitools.server.api.model.*

val apiInstance = PokemonApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : TypeDetail = apiInstance.typeRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling PokemonApi#typeRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling PokemonApi#typeRetrieve")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **kotlin.String**| This parameter can be a string or an integer. |

### Return type

[**TypeDetail**](TypeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: APPLICATION_JSON

