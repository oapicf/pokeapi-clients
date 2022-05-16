# StatController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[StatController.java](../../src/main/java/org/openapitools/controller/StatController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**statList**](#statList) | **GET** /api/v2/stat/ | 
[**statRead**](#statRead) | **GET** /api/v2/stat/{id}/ | 

<a name="statList"></a>
# **statList**
```java
Mono<String> StatController.statList(limitoffset)
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

<a name="statRead"></a>
# **statRead**
```java
Mono<String> StatController.statRead(id)
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

