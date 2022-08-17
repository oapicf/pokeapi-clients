# EncounterMethodApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EncounterMethodList**](EncounterMethodApi.md#EncounterMethodList) | **GET** /api/v2/encounter-method/ | 
[**EncounterMethodRead**](EncounterMethodApi.md#EncounterMethodRead) | **GET** /api/v2/encounter-method/{id}/ | 


# **EncounterMethodList**
> character EncounterMethodList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- EncounterMethodApi$new()
result <- api_instance$EncounterMethodList(limit = var_limit, offset = var_offset)
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

# **EncounterMethodRead**
> character EncounterMethodRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- EncounterMethodApi$new()
result <- api_instance$EncounterMethodRead(var_id)
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

