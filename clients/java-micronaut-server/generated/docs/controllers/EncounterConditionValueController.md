# EncounterConditionValueController

All URIs are relative to `""`

The controller class is defined in **[EncounterConditionValueController.java](../../src/main/java/org/openapitools/controller/EncounterConditionValueController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**encounterConditionValueList**](#encounterConditionValueList) | **GET** /api/v2/encounter-condition-value/ | 
[**encounterConditionValueRead**](#encounterConditionValueRead) | **GET** /api/v2/encounter-condition-value/{id}/ | 

<a name="encounterConditionValueList"></a>
# **encounterConditionValueList**
```java
Mono<String> EncounterConditionValueController.encounterConditionValueList(limitoffset)
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

<a name="encounterConditionValueRead"></a>
# **encounterConditionValueRead**
```java
Mono<String> EncounterConditionValueController.encounterConditionValueRead(id)
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

