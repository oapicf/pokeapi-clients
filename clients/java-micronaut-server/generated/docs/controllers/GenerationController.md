# GenerationController

All URIs are relative to `""`

The controller class is defined in **[GenerationController.java](../../src/main/java/org/openapitools/controller/GenerationController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**generationList**](#generationList) | **GET** /api/v2/generation/ | 
[**generationRead**](#generationRead) | **GET** /api/v2/generation/{id}/ | 

<a id="generationList"></a>
# **generationList**
```java
Mono<String> GenerationController.generationList(limitoffset)
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

<a id="generationRead"></a>
# **generationRead**
```java
Mono<String> GenerationController.generationRead(id)
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

