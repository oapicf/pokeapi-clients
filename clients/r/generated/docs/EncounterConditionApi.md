# EncounterConditionApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EncounterConditionList**](EncounterConditionApi.md#EncounterConditionList) | **GET** /api/v2/encounter-condition/ | 
[**EncounterConditionRead**](EncounterConditionApi.md#EncounterConditionRead) | **GET** /api/v2/encounter-condition/{id}/ | 


# **EncounterConditionList**
> character EncounterConditionList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- EncounterConditionApi$new()
result <- api.instance$EncounterConditionList(limit=var.limit, offset=var.offset)
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

var.id <- 56 # integer | 

api.instance <- EncounterConditionApi$new()
result <- api.instance$EncounterConditionRead(var.id)
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

