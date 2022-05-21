# MoveDamageClassController

All URIs are relative to `""`

The controller class is defined in **[MoveDamageClassController.java](../../src/main/java/org/openapitools/controller/MoveDamageClassController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveDamageClassList**](#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | 
[**moveDamageClassRead**](#moveDamageClassRead) | **GET** /api/v2/move-damage-class/{id}/ | 

<a name="moveDamageClassList"></a>
# **moveDamageClassList**
```java
Mono<String> MoveDamageClassController.moveDamageClassList(limitoffset)
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

<a name="moveDamageClassRead"></a>
# **moveDamageClassRead**
```java
Mono<String> MoveDamageClassController.moveDamageClassRead(id)
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

