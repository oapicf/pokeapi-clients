# MoveController

All URIs are relative to `""`

The controller class is defined in **[MoveController.java](../../src/main/java/org/openapitools/controller/MoveController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveList**](#moveList) | **GET** /api/v2/move/ | 
[**moveRead**](#moveRead) | **GET** /api/v2/move/{id}/ | 

<a id="moveList"></a>
# **moveList**
```java
Mono<String> MoveController.moveList(limitoffset)
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

<a id="moveRead"></a>
# **moveRead**
```java
Mono<String> MoveController.moveRead(id)
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

