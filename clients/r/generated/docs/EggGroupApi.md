# EggGroupApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EggGroupList**](EggGroupApi.md#EggGroupList) | **GET** /api/v2/egg-group/ | 
[**EggGroupRead**](EggGroupApi.md#EggGroupRead) | **GET** /api/v2/egg-group/{id}/ | 


# **EggGroupList**
> character EggGroupList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- EggGroupApi$new()
result <- api_instance$EggGroupList(limit = var_limit, offset = var_offset)
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

# **EggGroupRead**
> character EggGroupRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- EggGroupApi$new()
result <- api_instance$EggGroupRead(var_id)
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

