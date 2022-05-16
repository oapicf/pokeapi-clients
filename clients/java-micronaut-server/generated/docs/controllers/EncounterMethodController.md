# EncounterMethodController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[EncounterMethodController.java](../../src/main/java/org/openapitools/controller/EncounterMethodController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterMethodList**](#encounterMethodList) | **GET** /api/v2/encounter-method/ | 
[**encounterMethodRead**](#encounterMethodRead) | **GET** /api/v2/encounter-method/{id}/ | 

<a name="encounterMethodList"></a>
# **encounterMethodList**
```java
Mono<String> EncounterMethodController.encounterMethodList(limitoffset)
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

<a name="encounterMethodRead"></a>
# **encounterMethodRead**
```java
Mono<String> EncounterMethodController.encounterMethodRead(id)
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

