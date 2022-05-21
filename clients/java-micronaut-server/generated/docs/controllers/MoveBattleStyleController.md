# MoveBattleStyleController

All URIs are relative to `""`

The controller class is defined in **[MoveBattleStyleController.java](../../src/main/java/org/openapitools/controller/MoveBattleStyleController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveBattleStyleList**](#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | 
[**moveBattleStyleRead**](#moveBattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ | 

<a name="moveBattleStyleList"></a>
# **moveBattleStyleList**
```java
Mono<String> MoveBattleStyleController.moveBattleStyleList(limitoffset)
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

<a name="moveBattleStyleRead"></a>
# **moveBattleStyleRead**
```java
Mono<String> MoveBattleStyleController.moveBattleStyleRead(id)
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

