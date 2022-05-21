# VersionController

All URIs are relative to `""`

The controller class is defined in **[VersionController.java](../../src/main/java/org/openapitools/controller/VersionController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionList**](#versionList) | **GET** /api/v2/version/ | 
[**versionRead**](#versionRead) | **GET** /api/v2/version/{id}/ | 

<a name="versionList"></a>
# **versionList**
```java
Mono<String> VersionController.versionList(limitoffset)
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

<a name="versionRead"></a>
# **versionRead**
```java
Mono<String> VersionController.versionRead(id)
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

