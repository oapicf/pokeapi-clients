# PalParkAreaController

All URIs are relative to `""`

The controller class is defined in **[PalParkAreaController.java](../../src/main/java/org/openapitools/controller/PalParkAreaController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**palParkAreaList**](#palParkAreaList) | **GET** /api/v2/pal-park-area/ | 
[**palParkAreaRead**](#palParkAreaRead) | **GET** /api/v2/pal-park-area/{id}/ | 

<a name="palParkAreaList"></a>
# **palParkAreaList**
```java
Mono<String> PalParkAreaController.palParkAreaList(limitoffset)
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

<a name="palParkAreaRead"></a>
# **palParkAreaRead**
```java
Mono<String> PalParkAreaController.palParkAreaRead(id)
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

