# ContestEffectController

All URIs are relative to `""`

The controller class is defined in **[ContestEffectController.java](../../src/main/java/org/openapitools/controller/ContestEffectController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestEffectList**](#contestEffectList) | **GET** /api/v2/contest-effect/ | 
[**contestEffectRead**](#contestEffectRead) | **GET** /api/v2/contest-effect/{id}/ | 

<a name="contestEffectList"></a>
# **contestEffectList**
```java
Mono<String> ContestEffectController.contestEffectList(limitoffset)
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

<a name="contestEffectRead"></a>
# **contestEffectRead**
```java
Mono<String> ContestEffectController.contestEffectRead(id)
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

