# MoveCategoryController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[MoveCategoryController.java](../../src/main/java/org/openapitools/controller/MoveCategoryController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveCategoryList**](#moveCategoryList) | **GET** /api/v2/move-category/ | 
[**moveCategoryRead**](#moveCategoryRead) | **GET** /api/v2/move-category/{id}/ | 

<a name="moveCategoryList"></a>
# **moveCategoryList**
```java
Mono<String> MoveCategoryController.moveCategoryList(limitoffset)
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

<a name="moveCategoryRead"></a>
# **moveCategoryRead**
```java
Mono<String> MoveCategoryController.moveCategoryRead(id)
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

