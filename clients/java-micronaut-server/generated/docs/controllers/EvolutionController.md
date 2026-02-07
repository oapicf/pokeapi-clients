# EvolutionController

All URIs are relative to `""`

The controller class is defined in **[EvolutionController.java](../../src/main/java/org/openapitools/controller/EvolutionController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionChainList**](#evolutionChainList) | **GET** /api/v2/evolution-chain/ | List evolution chains
[**evolutionChainRetrieve**](#evolutionChainRetrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**evolutionTriggerList**](#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
[**evolutionTriggerRetrieve**](#evolutionTriggerRetrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger

<a id="evolutionChainList"></a>
# **evolutionChainList**
```java
Mono<PaginatedEvolutionChainSummaryList> EvolutionController.evolutionChainList(limitoffsetq)
```

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedEvolutionChainSummaryList**](../../docs/models/PaginatedEvolutionChainSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="evolutionChainRetrieve"></a>
# **evolutionChainRetrieve**
```java
Mono<EvolutionChainDetail> EvolutionController.evolutionChainRetrieve(id)
```

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**EvolutionChainDetail**](../../docs/models/EvolutionChainDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="evolutionTriggerList"></a>
# **evolutionTriggerList**
```java
Mono<PaginatedEvolutionTriggerSummaryList> EvolutionController.evolutionTriggerList(limitoffsetq)
```

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedEvolutionTriggerSummaryList**](../../docs/models/PaginatedEvolutionTriggerSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="evolutionTriggerRetrieve"></a>
# **evolutionTriggerRetrieve**
```java
Mono<EvolutionTriggerDetail> EvolutionController.evolutionTriggerRetrieve(id)
```

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**EvolutionTriggerDetail**](../../docs/models/EvolutionTriggerDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

