# PokemonController

All URIs are relative to `""`

The controller class is defined in **[PokemonController.java](../../src/main/java/org/openapitools/controller/PokemonController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**abilityList**](#abilityList) | **GET** /api/v2/ability/ | 
[**abilityRetrieve**](#abilityRetrieve) | **GET** /api/v2/ability/{id}/ | 
[**characteristicList**](#characteristicList) | **GET** /api/v2/characteristic/ | List charecterictics
[**characteristicRetrieve**](#characteristicRetrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
[**eggGroupList**](#eggGroupList) | **GET** /api/v2/egg-group/ | List egg groups
[**eggGroupRetrieve**](#eggGroupRetrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
[**genderList**](#genderList) | **GET** /api/v2/gender/ | List genders
[**genderRetrieve**](#genderRetrieve) | **GET** /api/v2/gender/{id}/ | Get gender
[**growthRateList**](#growthRateList) | **GET** /api/v2/growth-rate/ | List growth rates
[**growthRateRetrieve**](#growthRateRetrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
[**moveDamageClassList**](#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | List move damage classes
[**moveDamageClassRetrieve**](#moveDamageClassRetrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
[**natureList**](#natureList) | **GET** /api/v2/nature/ | List natures
[**natureRetrieve**](#natureRetrieve) | **GET** /api/v2/nature/{id}/ | Get nature
[**pokeathlonStatList**](#pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
[**pokeathlonStatRetrieve**](#pokeathlonStatRetrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
[**pokemonColorList**](#pokemonColorList) | **GET** /api/v2/pokemon-color/ | List pokemon colors
[**pokemonColorRetrieve**](#pokemonColorRetrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
[**pokemonFormList**](#pokemonFormList) | **GET** /api/v2/pokemon-form/ | List pokemon forms
[**pokemonFormRetrieve**](#pokemonFormRetrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
[**pokemonHabitatList**](#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
[**pokemonHabitatRetrieve**](#pokemonHabitatRetrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
[**pokemonList**](#pokemonList) | **GET** /api/v2/pokemon/ | List pokemon
[**pokemonRetrieve**](#pokemonRetrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
[**pokemonShapeList**](#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
[**pokemonShapeRetrieve**](#pokemonShapeRetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
[**pokemonSpeciesList**](#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | List pokemon species
[**pokemonSpeciesRetrieve**](#pokemonSpeciesRetrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
[**statList**](#statList) | **GET** /api/v2/stat/ | List stats
[**statRetrieve**](#statRetrieve) | **GET** /api/v2/stat/{id}/ | Get stat
[**typeList**](#typeList) | **GET** /api/v2/type/ | List types
[**typeRetrieve**](#typeRetrieve) | **GET** /api/v2/type/{id}/ | Get types

<a id="abilityList"></a>
# **abilityList**
```java
Mono<PaginatedAbilitySummaryList> PokemonController.abilityList(limitoffsetq)
```



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedAbilitySummaryList**](../../docs/models/PaginatedAbilitySummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="abilityRetrieve"></a>
# **abilityRetrieve**
```java
Mono<AbilityDetail> PokemonController.abilityRetrieve(id)
```



Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**AbilityDetail**](../../docs/models/AbilityDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="characteristicList"></a>
# **characteristicList**
```java
Mono<PaginatedCharacteristicSummaryList> PokemonController.characteristicList(limitoffsetq)
```

List charecterictics

Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedCharacteristicSummaryList**](../../docs/models/PaginatedCharacteristicSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="characteristicRetrieve"></a>
# **characteristicRetrieve**
```java
Mono<CharacteristicDetail> PokemonController.characteristicRetrieve(id)
```

Get characteristic

Characteristics indicate which stat contains a Pokémon&#39;s highest IV. A Pokémon&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**CharacteristicDetail**](../../docs/models/CharacteristicDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="eggGroupList"></a>
# **eggGroupList**
```java
Mono<PaginatedEggGroupSummaryList> PokemonController.eggGroupList(limitoffsetq)
```

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedEggGroupSummaryList**](../../docs/models/PaginatedEggGroupSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="eggGroupRetrieve"></a>
# **eggGroupRetrieve**
```java
Mono<EggGroupDetail> PokemonController.eggGroupRetrieve(id)
```

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**EggGroupDetail**](../../docs/models/EggGroupDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="genderList"></a>
# **genderList**
```java
Mono<PaginatedGenderSummaryList> PokemonController.genderList(limitoffsetq)
```

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedGenderSummaryList**](../../docs/models/PaginatedGenderSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="genderRetrieve"></a>
# **genderRetrieve**
```java
Mono<GenderDetail> PokemonController.genderRetrieve(id)
```

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**GenderDetail**](../../docs/models/GenderDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="growthRateList"></a>
# **growthRateList**
```java
Mono<PaginatedGrowthRateSummaryList> PokemonController.growthRateList(limitoffsetq)
```

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedGrowthRateSummaryList**](../../docs/models/PaginatedGrowthRateSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="growthRateRetrieve"></a>
# **growthRateRetrieve**
```java
Mono<GrowthRateDetail> PokemonController.growthRateRetrieve(id)
```

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**GrowthRateDetail**](../../docs/models/GrowthRateDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveDamageClassList"></a>
# **moveDamageClassList**
```java
Mono<PaginatedMoveDamageClassSummaryList> PokemonController.moveDamageClassList(limitoffsetq)
```

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedMoveDamageClassSummaryList**](../../docs/models/PaginatedMoveDamageClassSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveDamageClassRetrieve"></a>
# **moveDamageClassRetrieve**
```java
Mono<MoveDamageClassDetail> PokemonController.moveDamageClassRetrieve(id)
```

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**MoveDamageClassDetail**](../../docs/models/MoveDamageClassDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="natureList"></a>
# **natureList**
```java
Mono<PaginatedNatureSummaryList> PokemonController.natureList(limitoffsetq)
```

List natures

Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedNatureSummaryList**](../../docs/models/PaginatedNatureSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="natureRetrieve"></a>
# **natureRetrieve**
```java
Mono<NatureDetail> PokemonController.natureRetrieve(id)
```

Get nature

Natures influence how a Pokémon&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**NatureDetail**](../../docs/models/NatureDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokeathlonStatList"></a>
# **pokeathlonStatList**
```java
Mono<PaginatedPokeathlonStatSummaryList> PokemonController.pokeathlonStatList(limitoffsetq)
```

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedPokeathlonStatSummaryList**](../../docs/models/PaginatedPokeathlonStatSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokeathlonStatRetrieve"></a>
# **pokeathlonStatRetrieve**
```java
Mono<PokeathlonStatDetail> PokemonController.pokeathlonStatRetrieve(id)
```

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**PokeathlonStatDetail**](../../docs/models/PokeathlonStatDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonColorList"></a>
# **pokemonColorList**
```java
Mono<PaginatedPokemonColorSummaryList> PokemonController.pokemonColorList(limitoffsetq)
```

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedPokemonColorSummaryList**](../../docs/models/PaginatedPokemonColorSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonColorRetrieve"></a>
# **pokemonColorRetrieve**
```java
Mono<PokemonColorDetail> PokemonController.pokemonColorRetrieve(id)
```

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**PokemonColorDetail**](../../docs/models/PokemonColorDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonFormList"></a>
# **pokemonFormList**
```java
Mono<PaginatedPokemonFormSummaryList> PokemonController.pokemonFormList(limitoffsetq)
```

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedPokemonFormSummaryList**](../../docs/models/PaginatedPokemonFormSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonFormRetrieve"></a>
# **pokemonFormRetrieve**
```java
Mono<PokemonFormDetail> PokemonController.pokemonFormRetrieve(id)
```

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the &#39;Pokémon&#39; entity is used to represent such a variety.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**PokemonFormDetail**](../../docs/models/PokemonFormDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonHabitatList"></a>
# **pokemonHabitatList**
```java
Mono<PaginatedPokemonHabitatSummaryList> PokemonController.pokemonHabitatList(limitoffsetq)
```

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedPokemonHabitatSummaryList**](../../docs/models/PaginatedPokemonHabitatSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonHabitatRetrieve"></a>
# **pokemonHabitatRetrieve**
```java
Mono<PokemonHabitatDetail> PokemonController.pokemonHabitatRetrieve(id)
```

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**PokemonHabitatDetail**](../../docs/models/PokemonHabitatDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonList"></a>
# **pokemonList**
```java
Mono<PaginatedPokemonSummaryList> PokemonController.pokemonList(limitoffsetq)
```

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedPokemonSummaryList**](../../docs/models/PaginatedPokemonSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonRetrieve"></a>
# **pokemonRetrieve**
```java
Mono<PokemonDetail> PokemonController.pokemonRetrieve(id)
```

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**PokemonDetail**](../../docs/models/PokemonDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonShapeList"></a>
# **pokemonShapeList**
```java
Mono<PaginatedPokemonShapeSummaryList> PokemonController.pokemonShapeList(limitoffsetq)
```

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedPokemonShapeSummaryList**](../../docs/models/PaginatedPokemonShapeSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonShapeRetrieve"></a>
# **pokemonShapeRetrieve**
```java
Mono<PokemonShapeDetail> PokemonController.pokemonShapeRetrieve(id)
```

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**PokemonShapeDetail**](../../docs/models/PokemonShapeDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonSpeciesList"></a>
# **pokemonSpeciesList**
```java
Mono<PaginatedPokemonSpeciesSummaryList> PokemonController.pokemonSpeciesList(limitoffsetq)
```

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedPokemonSpeciesSummaryList**](../../docs/models/PaginatedPokemonSpeciesSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokemonSpeciesRetrieve"></a>
# **pokemonSpeciesRetrieve**
```java
Mono<PokemonSpeciesDetail> PokemonController.pokemonSpeciesRetrieve(id)
```

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**PokemonSpeciesDetail**](../../docs/models/PokemonSpeciesDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="statList"></a>
# **statList**
```java
Mono<PaginatedStatSummaryList> PokemonController.statList(limitoffsetq)
```

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedStatSummaryList**](../../docs/models/PaginatedStatSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="statRetrieve"></a>
# **statRetrieve**
```java
Mono<StatDetail> PokemonController.statRetrieve(id)
```

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**StatDetail**](../../docs/models/StatDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="typeList"></a>
# **typeList**
```java
Mono<PaginatedTypeSummaryList> PokemonController.typeList(limitoffsetq)
```

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedTypeSummaryList**](../../docs/models/PaginatedTypeSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="typeRetrieve"></a>
# **typeRetrieve**
```java
Mono<TypeDetail> PokemonController.typeRetrieve(id)
```

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**TypeDetail**](../../docs/models/TypeDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

