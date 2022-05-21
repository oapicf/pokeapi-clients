# BerryFlavorController

All URIs are relative to `""`

The controller class is defined in **[BerryFlavorController.java](../../src/main/java/org/openapitools/controller/BerryFlavorController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFlavorList**](#berryFlavorList) | **GET** /api/v2/berry-flavor/ | 
[**berryFlavorRead**](#berryFlavorRead) | **GET** /api/v2/berry-flavor/{id}/ | 

<a name="berryFlavorList"></a>
# **berryFlavorList**
```java
Mono<String> BerryFlavorController.berryFlavorList(limitoffset)
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

<a name="berryFlavorRead"></a>
# **berryFlavorRead**
```java
Mono<String> BerryFlavorController.berryFlavorRead(id)
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

