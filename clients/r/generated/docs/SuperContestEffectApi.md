# SuperContestEffectApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SuperContestEffectList**](SuperContestEffectApi.md#SuperContestEffectList) | **GET** /api/v2/super-contest-effect/ | 
[**SuperContestEffectRead**](SuperContestEffectApi.md#SuperContestEffectRead) | **GET** /api/v2/super-contest-effect/{id}/ | 


# **SuperContestEffectList**
> character SuperContestEffectList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- SuperContestEffectApi$new()
result <- api_instance$SuperContestEffectList(limit = var_limit, offset = var_offset)
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

# **SuperContestEffectRead**
> character SuperContestEffectRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- SuperContestEffectApi$new()
result <- api_instance$SuperContestEffectRead(var_id)
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

