# BerryFirmnessController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[BerryFirmnessController.java](../../src/main/java/org/openapitools/controller/BerryFirmnessController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**berryFirmnessList**](#berryFirmnessList) | **GET** /api/v2/berry-firmness/ | 
[**berryFirmnessRead**](#berryFirmnessRead) | **GET** /api/v2/berry-firmness/{id}/ | 

<a name="berryFirmnessList"></a>
# **berryFirmnessList**
```java
Mono<String> BerryFirmnessController.berryFirmnessList(limitoffset)
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

<a name="berryFirmnessRead"></a>
# **berryFirmnessRead**
```java
Mono<String> BerryFirmnessController.berryFirmnessRead(id)
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

