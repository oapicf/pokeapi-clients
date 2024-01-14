# EvolutionChainController

All URIs are relative to `""`

The controller class is defined in **[EvolutionChainController.java](../../src/main/java/org/openapitools/controller/EvolutionChainController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionChainList**](#evolutionChainList) | **GET** /api/v2/evolution-chain/ | 
[**evolutionChainRead**](#evolutionChainRead) | **GET** /api/v2/evolution-chain/{id}/ | 

<a id="evolutionChainList"></a>
# **evolutionChainList**
```java
Mono<String> EvolutionChainController.evolutionChainList(limitoffset)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` |  | [optional parameter]
**offset** | `Integer` |  | [optional parameter]

### Return type
`String`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

<a id="evolutionChainRead"></a>
# **evolutionChainRead**
```java
Mono<String> EvolutionChainController.evolutionChainRead(id)
```



### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `Integer` |  |

### Return type
`String`


### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `text/plain`

