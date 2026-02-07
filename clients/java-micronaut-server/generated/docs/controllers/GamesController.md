# GamesController

All URIs are relative to `""`

The controller class is defined in **[GamesController.java](../../src/main/java/org/openapitools/controller/GamesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**generationList**](#generationList) | **GET** /api/v2/generation/ | List genrations
[**generationRetrieve**](#generationRetrieve) | **GET** /api/v2/generation/{id}/ | Get genration
[**pokedexList**](#pokedexList) | **GET** /api/v2/pokedex/ | List pokedex
[**pokedexRetrieve**](#pokedexRetrieve) | **GET** /api/v2/pokedex/{id}/ | Get pokedex
[**versionGroupList**](#versionGroupList) | **GET** /api/v2/version-group/ | List version groups
[**versionGroupRetrieve**](#versionGroupRetrieve) | **GET** /api/v2/version-group/{id}/ | Get version group
[**versionList**](#versionList) | **GET** /api/v2/version/ | List versions
[**versionRetrieve**](#versionRetrieve) | **GET** /api/v2/version/{id}/ | Get version

<a id="generationList"></a>
# **generationList**
```java
Mono<PaginatedGenerationSummaryList> GamesController.generationList(limitoffsetq)
```

List genrations

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedGenerationSummaryList**](../../docs/models/PaginatedGenerationSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="generationRetrieve"></a>
# **generationRetrieve**
```java
Mono<GenerationDetail> GamesController.generationRetrieve(id)
```

Get genration

A generation is a grouping of the Pokémon games that separates them based on the Pokémon they include. In each generation, a new set of Pokémon, Moves, Abilities and Types that did not exist in the previous generation are released.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**GenerationDetail**](../../docs/models/GenerationDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokedexList"></a>
# **pokedexList**
```java
Mono<PaginatedPokedexSummaryList> GamesController.pokedexList(limitoffsetq)
```

List pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedPokedexSummaryList**](../../docs/models/PaginatedPokedexSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="pokedexRetrieve"></a>
# **pokedexRetrieve**
```java
Mono<PokedexDetail> GamesController.pokedexRetrieve(id)
```

Get pokedex

A Pokédex is a handheld electronic encyclopedia device; one which is capable of recording and retaining information of the various Pokémon in a given region with the exception of the national dex and some smaller dexes related to portions of a region. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pokedex) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**PokedexDetail**](../../docs/models/PokedexDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="versionGroupList"></a>
# **versionGroupList**
```java
Mono<PaginatedVersionGroupSummaryList> GamesController.versionGroupList(limitoffsetq)
```

List version groups

Version groups categorize highly similar versions of the games.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedVersionGroupSummaryList**](../../docs/models/PaginatedVersionGroupSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="versionGroupRetrieve"></a>
# **versionGroupRetrieve**
```java
Mono<VersionGroupDetail> GamesController.versionGroupRetrieve(id)
```

Get version group

Version groups categorize highly similar versions of the games.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**VersionGroupDetail**](../../docs/models/VersionGroupDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="versionList"></a>
# **versionList**
```java
Mono<PaginatedVersionSummaryList> GamesController.versionList(limitoffsetq)
```

List versions

Versions of the games, e.g., Red, Blue or Yellow.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedVersionSummaryList**](../../docs/models/PaginatedVersionSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="versionRetrieve"></a>
# **versionRetrieve**
```java
Mono<VersionDetail> GamesController.versionRetrieve(id)
```

Get version

Versions of the games, e.g., Red, Blue or Yellow.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**VersionDetail**](../../docs/models/VersionDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

