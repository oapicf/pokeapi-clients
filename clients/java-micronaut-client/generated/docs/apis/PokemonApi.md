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


## Creating PokemonApi

To initiate an instance of `PokemonApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.PokemonApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(PokemonApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    PokemonApi pokemonApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="abilityList"></a>
# **abilityList**
```java
Mono<PaginatedAbilitySummaryList> PokemonApi.abilityList(limitoffsetq)
```



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedAbilitySummaryList**](PaginatedAbilitySummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="abilityRetrieve"></a>
# **abilityRetrieve**
```java
Mono<AbilityDetail> PokemonApi.abilityRetrieve(id)
```



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**AbilityDetail**](AbilityDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="characteristicList"></a>
# **characteristicList**
```java
Mono<PaginatedCharacteristicSummaryList> PokemonApi.characteristicList(limitoffsetq)
```

List charecterictics

Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedCharacteristicSummaryList**](PaginatedCharacteristicSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="characteristicRetrieve"></a>
# **characteristicRetrieve**
```java
Mono<CharacteristicDetail> PokemonApi.characteristicRetrieve(id)
```

Get characteristic

Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**CharacteristicDetail**](CharacteristicDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="eggGroupList"></a>
# **eggGroupList**
```java
Mono<PaginatedEggGroupSummaryList> PokemonApi.eggGroupList(limitoffsetq)
```

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedEggGroupSummaryList**](PaginatedEggGroupSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="eggGroupRetrieve"></a>
# **eggGroupRetrieve**
```java
Mono<EggGroupDetail> PokemonApi.eggGroupRetrieve(id)
```

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**EggGroupDetail**](EggGroupDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="genderList"></a>
# **genderList**
```java
Mono<PaginatedGenderSummaryList> PokemonApi.genderList(limitoffsetq)
```

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedGenderSummaryList**](PaginatedGenderSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="genderRetrieve"></a>
# **genderRetrieve**
```java
Mono<GenderDetail> PokemonApi.genderRetrieve(id)
```

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**GenderDetail**](GenderDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="growthRateList"></a>
# **growthRateList**
```java
Mono<PaginatedGrowthRateSummaryList> PokemonApi.growthRateList(limitoffsetq)
```

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedGrowthRateSummaryList**](PaginatedGrowthRateSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="growthRateRetrieve"></a>
# **growthRateRetrieve**
```java
Mono<GrowthRateDetail> PokemonApi.growthRateRetrieve(id)
```

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**GrowthRateDetail**](GrowthRateDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="moveDamageClassList"></a>
# **moveDamageClassList**
```java
Mono<PaginatedMoveDamageClassSummaryList> PokemonApi.moveDamageClassList(limitoffsetq)
```

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedMoveDamageClassSummaryList**](PaginatedMoveDamageClassSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="moveDamageClassRetrieve"></a>
# **moveDamageClassRetrieve**
```java
Mono<MoveDamageClassDetail> PokemonApi.moveDamageClassRetrieve(id)
```

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**MoveDamageClassDetail**](MoveDamageClassDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="natureList"></a>
# **natureList**
```java
Mono<PaginatedNatureSummaryList> PokemonApi.natureList(limitoffsetq)
```

List natures

Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedNatureSummaryList**](PaginatedNatureSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="natureRetrieve"></a>
# **natureRetrieve**
```java
Mono<NatureDetail> PokemonApi.natureRetrieve(id)
```

Get nature

Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**NatureDetail**](NatureDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokeathlonStatList"></a>
# **pokeathlonStatList**
```java
Mono<PaginatedPokeathlonStatSummaryList> PokemonApi.pokeathlonStatList(limitoffsetq)
```

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedPokeathlonStatSummaryList**](PaginatedPokeathlonStatSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokeathlonStatRetrieve"></a>
# **pokeathlonStatRetrieve**
```java
Mono<PokeathlonStatDetail> PokemonApi.pokeathlonStatRetrieve(id)
```

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**PokeathlonStatDetail**](PokeathlonStatDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonColorList"></a>
# **pokemonColorList**
```java
Mono<PaginatedPokemonColorSummaryList> PokemonApi.pokemonColorList(limitoffsetq)
```

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedPokemonColorSummaryList**](PaginatedPokemonColorSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonColorRetrieve"></a>
# **pokemonColorRetrieve**
```java
Mono<PokemonColorDetail> PokemonApi.pokemonColorRetrieve(id)
```

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**PokemonColorDetail**](PokemonColorDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonFormList"></a>
# **pokemonFormList**
```java
Mono<PaginatedPokemonFormSummaryList> PokemonApi.pokemonFormList(limitoffsetq)
```

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedPokemonFormSummaryList**](PaginatedPokemonFormSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonFormRetrieve"></a>
# **pokemonFormRetrieve**
```java
Mono<PokemonFormDetail> PokemonApi.pokemonFormRetrieve(id)
```

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**PokemonFormDetail**](PokemonFormDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonHabitatList"></a>
# **pokemonHabitatList**
```java
Mono<PaginatedPokemonHabitatSummaryList> PokemonApi.pokemonHabitatList(limitoffsetq)
```

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedPokemonHabitatSummaryList**](PaginatedPokemonHabitatSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonHabitatRetrieve"></a>
# **pokemonHabitatRetrieve**
```java
Mono<PokemonHabitatDetail> PokemonApi.pokemonHabitatRetrieve(id)
```

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**PokemonHabitatDetail**](PokemonHabitatDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonList"></a>
# **pokemonList**
```java
Mono<PaginatedPokemonSummaryList> PokemonApi.pokemonList(limitoffsetq)
```

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedPokemonSummaryList**](PaginatedPokemonSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonRetrieve"></a>
# **pokemonRetrieve**
```java
Mono<PokemonDetail> PokemonApi.pokemonRetrieve(id)
```

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**PokemonDetail**](PokemonDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonShapeList"></a>
# **pokemonShapeList**
```java
Mono<PaginatedPokemonShapeSummaryList> PokemonApi.pokemonShapeList(limitoffsetq)
```

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedPokemonShapeSummaryList**](PaginatedPokemonShapeSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonShapeRetrieve"></a>
# **pokemonShapeRetrieve**
```java
Mono<PokemonShapeDetail> PokemonApi.pokemonShapeRetrieve(id)
```

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**PokemonShapeDetail**](PokemonShapeDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonSpeciesList"></a>
# **pokemonSpeciesList**
```java
Mono<PaginatedPokemonSpeciesSummaryList> PokemonApi.pokemonSpeciesList(limitoffsetq)
```

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedPokemonSpeciesSummaryList**](PaginatedPokemonSpeciesSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="pokemonSpeciesRetrieve"></a>
# **pokemonSpeciesRetrieve**
```java
Mono<PokemonSpeciesDetail> PokemonApi.pokemonSpeciesRetrieve(id)
```

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**PokemonSpeciesDetail**](PokemonSpeciesDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="statList"></a>
# **statList**
```java
Mono<PaginatedStatSummaryList> PokemonApi.statList(limitoffsetq)
```

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedStatSummaryList**](PaginatedStatSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="statRetrieve"></a>
# **statRetrieve**
```java
Mono<StatDetail> PokemonApi.statRetrieve(id)
```

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**StatDetail**](StatDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="typeList"></a>
# **typeList**
```java
Mono<PaginatedTypeSummaryList> PokemonApi.typeList(limitoffsetq)
```

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedTypeSummaryList**](PaginatedTypeSummaryList.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="typeRetrieve"></a>
# **typeRetrieve**
```java
Mono<TypeDetail> PokemonApi.typeRetrieve(id)
```

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**TypeDetail**](TypeDetail.md)

### Authorization
* **[basicAuth](auth.md#basicAuth)**
* **[cookieAuth](auth.md#cookieAuth)**

### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

