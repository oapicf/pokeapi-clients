# RegionController

All URIs are relative to `""`

The controller class is defined in **[RegionController.java](../../src/main/java/org/openapitools/controller/RegionController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**regionList**](#regionList) | **GET** /api/v2/region/ | 
[**regionRead**](#regionRead) | **GET** /api/v2/region/{id}/ | 

<a name="regionList"></a>
# **regionList**
```java
Mono<String> RegionController.regionList(limitoffset)
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

<a name="regionRead"></a>
# **regionRead**
```java
Mono<String> RegionController.regionRead(id)
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

