# SuperContestEffectController

All URIs are relative to `""`

The controller class is defined in **[SuperContestEffectController.java](../../src/main/java/org/openapitools/controller/SuperContestEffectController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**superContestEffectList**](#superContestEffectList) | **GET** /api/v2/super-contest-effect/ | 
[**superContestEffectRead**](#superContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ | 

<a name="superContestEffectList"></a>
# **superContestEffectList**
```java
Mono<String> SuperContestEffectController.superContestEffectList(limitoffset)
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

<a name="superContestEffectRead"></a>
# **superContestEffectRead**
```java
Mono<String> SuperContestEffectController.superContestEffectRead(id)
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

