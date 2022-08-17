# ItemFlingEffectApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemFlingEffectList**](ItemFlingEffectApi.md#ItemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | 
[**ItemFlingEffectRead**](ItemFlingEffectApi.md#ItemFlingEffectRead) | **GET** /api/v2/item-fling-effect/{id}/ | 


# **ItemFlingEffectList**
> character ItemFlingEffectList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- ItemFlingEffectApi$new()
result <- api_instance$ItemFlingEffectList(limit = var_limit, offset = var_offset)
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

# **ItemFlingEffectRead**
> character ItemFlingEffectRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- ItemFlingEffectApi$new()
result <- api_instance$ItemFlingEffectRead(var_id)
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

