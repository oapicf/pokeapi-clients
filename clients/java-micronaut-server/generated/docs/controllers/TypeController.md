# TypeController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[TypeController.java](../../src/main/java/org/openapitools/controller/TypeController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**typeList**](#typeList) | **GET** /api/v2/type/ | 
[**typeRead**](#typeRead) | **GET** /api/v2/type/{id}/ | 

<a name="typeList"></a>
# **typeList**
```java
Mono<String> TypeController.typeList(limitoffset)
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

<a name="typeRead"></a>
# **typeRead**
```java
Mono<String> TypeController.typeRead(id)
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

