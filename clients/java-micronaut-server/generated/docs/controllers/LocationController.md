# LocationController

All URIs are relative to `""`

The controller class is defined in **[LocationController.java](../../src/main/java/org/openapitools/controller/LocationController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**locationList**](#locationList) | **GET** /api/v2/location/ | 
[**locationRead**](#locationRead) | **GET** /api/v2/location/{id}/ | 

<a id="locationList"></a>
# **locationList**
```java
Mono<String> LocationController.locationList(limitoffset)
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

<a id="locationRead"></a>
# **locationRead**
```java
Mono<String> LocationController.locationRead(id)
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

