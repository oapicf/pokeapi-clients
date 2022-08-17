# EncounterConditionApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EncounterConditionList**](EncounterConditionApi.md#EncounterConditionList) | **GET** /api/v2/encounter-condition/ | 
[**EncounterConditionRead**](EncounterConditionApi.md#EncounterConditionRead) | **GET** /api/v2/encounter-condition/{id}/ | 


# **EncounterConditionList**
> character EncounterConditionList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- EncounterConditionApi$new()
result <- api_instance$EncounterConditionList(limit = var_limit, offset = var_offset)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**|  | [optional] 
 **offset** | **integer**|  | [optional] 

### Return type

**character**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

# **EncounterConditionRead**
> character EncounterConditionRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- EncounterConditionApi$new()
result <- api_instance$EncounterConditionRead(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **integer**|  | 

### Return type

**character**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Default response |  -  |

