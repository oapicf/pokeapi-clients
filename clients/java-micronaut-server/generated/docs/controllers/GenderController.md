# GenderController

All URIs are relative to `""`

The controller class is defined in **[GenderController.java](../../src/main/java/org/openapitools/controller/GenderController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**genderList**](#genderList) | **GET** /api/v2/gender/ | 
[**genderRead**](#genderRead) | **GET** /api/v2/gender/{id}/ | 

<a name="genderList"></a>
# **genderList**
```java
Mono<String> GenderController.genderList(limitoffset)
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

<a name="genderRead"></a>
# **genderRead**
```java
Mono<String> GenderController.genderRead(id)
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

