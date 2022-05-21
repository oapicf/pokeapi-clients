# EggGroupController

All URIs are relative to `""`

The controller class is defined in **[EggGroupController.java](../../src/main/java/org/openapitools/controller/EggGroupController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**eggGroupList**](#eggGroupList) | **GET** /api/v2/egg-group/ | 
[**eggGroupRead**](#eggGroupRead) | **GET** /api/v2/egg-group/{id}/ | 

<a name="eggGroupList"></a>
# **eggGroupList**
```java
Mono<String> EggGroupController.eggGroupList(limitoffset)
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

<a name="eggGroupRead"></a>
# **eggGroupRead**
```java
Mono<String> EggGroupController.eggGroupRead(id)
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

