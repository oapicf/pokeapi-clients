# PokeathlonStatController

All URIs are relative to `""`

The controller class is defined in **[PokeathlonStatController.java](../../src/main/java/org/openapitools/controller/PokeathlonStatController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**pokeathlonStatList**](#pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | 
[**pokeathlonStatRead**](#pokeathlonStatRead) | **GET** /api/v2/pokeathlon-stat/{id}/ | 

<a name="pokeathlonStatList"></a>
# **pokeathlonStatList**
```java
Mono<String> PokeathlonStatController.pokeathlonStatList(limitoffset)
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

<a name="pokeathlonStatRead"></a>
# **pokeathlonStatRead**
```java
Mono<String> PokeathlonStatController.pokeathlonStatRead(id)
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

