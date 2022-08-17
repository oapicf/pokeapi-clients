# ContestEffectApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ContestEffectList**](ContestEffectApi.md#ContestEffectList) | **GET** /api/v2/contest-effect/ | 
[**ContestEffectRead**](ContestEffectApi.md#ContestEffectRead) | **GET** /api/v2/contest-effect/{id}/ | 


# **ContestEffectList**
> character ContestEffectList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- ContestEffectApi$new()
result <- api_instance$ContestEffectList(limit = var_limit, offset = var_offset)
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

# **ContestEffectRead**
> character ContestEffectRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- ContestEffectApi$new()
result <- api_instance$ContestEffectRead(var_id)
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

