# MoveDamageClassApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveDamageClassList**](MoveDamageClassApi.md#MoveDamageClassList) | **GET** /api/v2/move-damage-class/ | 
[**MoveDamageClassRead**](MoveDamageClassApi.md#MoveDamageClassRead) | **GET** /api/v2/move-damage-class/{id}/ | 


# **MoveDamageClassList**
> character MoveDamageClassList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- MoveDamageClassApi$new()
result <- api_instance$MoveDamageClassList(limit = var_limit, offset = var_offset)
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

# **MoveDamageClassRead**
> character MoveDamageClassRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- MoveDamageClassApi$new()
result <- api_instance$MoveDamageClassRead(var_id)
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

