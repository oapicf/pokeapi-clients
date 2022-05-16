# MoveLearnMethodController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[MoveLearnMethodController.java](../../src/main/java/org/openapitools/controller/MoveLearnMethodController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveLearnMethodList**](#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | 
[**moveLearnMethodRead**](#moveLearnMethodRead) | **GET** /api/v2/move-learn-method/{id}/ | 

<a name="moveLearnMethodList"></a>
# **moveLearnMethodList**
```java
Mono<String> MoveLearnMethodController.moveLearnMethodList(limitoffset)
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

<a name="moveLearnMethodRead"></a>
# **moveLearnMethodRead**
```java
Mono<String> MoveLearnMethodController.moveLearnMethodRead(id)
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

