# MoveAilmentController

All URIs are relative to `""`

The controller class is defined in **[MoveAilmentController.java](../../src/main/java/org/openapitools/controller/MoveAilmentController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](#moveAilmentList) | **GET** /api/v2/move-ailment/ | 
[**moveAilmentRead**](#moveAilmentRead) | **GET** /api/v2/move-ailment/{id}/ | 

<a name="moveAilmentList"></a>
# **moveAilmentList**
```java
Mono<String> MoveAilmentController.moveAilmentList(limitoffset)
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

<a name="moveAilmentRead"></a>
# **moveAilmentRead**
```java
Mono<String> MoveAilmentController.moveAilmentRead(id)
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

