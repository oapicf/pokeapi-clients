# EncounterConditionController

All URIs are relative to `"/api/v2"`

The controller class is defined in **[EncounterConditionController.java](../../src/main/java/org/openapitools/controller/EncounterConditionController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionList**](#encounterConditionList) | **GET** /api/v2/encounter-condition/ | 
[**encounterConditionRead**](#encounterConditionRead) | **GET** /api/v2/encounter-condition/{id}/ | 

<a name="encounterConditionList"></a>
# **encounterConditionList**
```java
Mono<String> EncounterConditionController.encounterConditionList(limitoffset)
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

<a name="encounterConditionRead"></a>
# **encounterConditionRead**
```java
Mono<String> EncounterConditionController.encounterConditionRead(id)
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

