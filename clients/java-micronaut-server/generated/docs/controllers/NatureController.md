# NatureController

All URIs are relative to `""`

The controller class is defined in **[NatureController.java](../../src/main/java/org/openapitools/controller/NatureController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**natureList**](#natureList) | **GET** /api/v2/nature/ | 
[**natureRead**](#natureRead) | **GET** /api/v2/nature/{id}/ | 

<a id="natureList"></a>
# **natureList**
```java
Mono<String> NatureController.natureList(limitoffset)
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

<a id="natureRead"></a>
# **natureRead**
```java
Mono<String> NatureController.natureRead(id)
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

