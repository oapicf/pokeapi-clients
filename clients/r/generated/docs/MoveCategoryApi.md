# MoveCategoryApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveCategoryList**](MoveCategoryApi.md#MoveCategoryList) | **GET** /api/v2/move-category/ | 
[**MoveCategoryRead**](MoveCategoryApi.md#MoveCategoryRead) | **GET** /api/v2/move-category/{id}/ | 


# **MoveCategoryList**
> character MoveCategoryList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- MoveCategoryApi$new()
result <- api_instance$MoveCategoryList(limit = var_limit, offset = var_offset)
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

# **MoveCategoryRead**
> character MoveCategoryRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- MoveCategoryApi$new()
result <- api_instance$MoveCategoryRead(var_id)
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

