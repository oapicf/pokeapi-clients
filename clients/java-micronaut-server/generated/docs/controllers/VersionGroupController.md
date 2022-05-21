# VersionGroupController

All URIs are relative to `""`

The controller class is defined in **[VersionGroupController.java](../../src/main/java/org/openapitools/controller/VersionGroupController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**versionGroupList**](#versionGroupList) | **GET** /api/v2/version-group/ | 
[**versionGroupRead**](#versionGroupRead) | **GET** /api/v2/version-group/{id}/ | 

<a name="versionGroupList"></a>
# **versionGroupList**
```java
Mono<String> VersionGroupController.versionGroupList(limitoffset)
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

<a name="versionGroupRead"></a>
# **versionGroupRead**
```java
Mono<String> VersionGroupController.versionGroupRead(id)
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

