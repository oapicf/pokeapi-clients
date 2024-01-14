# EvolutionTriggerController

All URIs are relative to `""`

The controller class is defined in **[EvolutionTriggerController.java](../../src/main/java/org/openapitools/controller/EvolutionTriggerController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**evolutionTriggerList**](#evolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | 
[**evolutionTriggerRead**](#evolutionTriggerRead) | **GET** /api/v2/evolution-trigger/{id}/ | 

<a id="evolutionTriggerList"></a>
# **evolutionTriggerList**
```java
Mono<String> EvolutionTriggerController.evolutionTriggerList(limitoffset)
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

<a id="evolutionTriggerRead"></a>
# **evolutionTriggerRead**
```java
Mono<String> EvolutionTriggerController.evolutionTriggerRead(id)
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

