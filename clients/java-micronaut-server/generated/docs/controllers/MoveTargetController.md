# MoveTargetController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[MoveTargetController.java](../../src/main/java/org/openapitools/controller/MoveTargetController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveTargetList**](#moveTargetList) | **GET** /api/v2/move-target/ | 
[**moveTargetRead**](#moveTargetRead) | **GET** /api/v2/move-target/{id}/ | 

<a name="moveTargetList"></a>
# **moveTargetList**
```java
Mono<String> MoveTargetController.moveTargetList(limitoffset)
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

<a name="moveTargetRead"></a>
# **moveTargetRead**
```java
Mono<String> MoveTargetController.moveTargetRead(id)
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

