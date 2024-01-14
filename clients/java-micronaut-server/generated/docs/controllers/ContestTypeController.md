# ContestTypeController

All URIs are relative to `""`

The controller class is defined in **[ContestTypeController.java](../../src/main/java/org/openapitools/controller/ContestTypeController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**contestTypeList**](#contestTypeList) | **GET** /api/v2/contest-type/ | 
[**contestTypeRead**](#contestTypeRead) | **GET** /api/v2/contest-type/{id}/ | 

<a id="contestTypeList"></a>
# **contestTypeList**
```java
Mono<String> ContestTypeController.contestTypeList(limitoffset)
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

<a id="contestTypeRead"></a>
# **contestTypeRead**
```java
Mono<String> ContestTypeController.contestTypeRead(id)
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

