# BerryController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[BerryController.java](../../src/main/java/org/openapitools/controller/BerryController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryList**](#berryList) | **GET** /api/v2/berry/ | 
[**berryRead**](#berryRead) | **GET** /api/v2/berry/{id}/ | 

<a name="berryList"></a>
# **berryList**
```java
Mono<String> BerryController.berryList(limitoffset)
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

<a name="berryRead"></a>
# **berryRead**
```java
Mono<String> BerryController.berryRead(id)
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

