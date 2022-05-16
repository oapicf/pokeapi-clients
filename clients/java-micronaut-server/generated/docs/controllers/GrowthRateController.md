# GrowthRateController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[GrowthRateController.java](../../src/main/java/org/openapitools/controller/GrowthRateController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**growthRateList**](#growthRateList) | **GET** /api/v2/growth-rate/ | 
[**growthRateRead**](#growthRateRead) | **GET** /api/v2/growth-rate/{id}/ | 

<a name="growthRateList"></a>
# **growthRateList**
```java
Mono<String> GrowthRateController.growthRateList(limitoffset)
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

<a name="growthRateRead"></a>
# **growthRateRead**
```java
Mono<String> GrowthRateController.growthRateRead(id)
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

