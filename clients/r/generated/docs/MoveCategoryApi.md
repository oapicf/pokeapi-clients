# MoveCategoryApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveCategoryList**](MoveCategoryApi.md#MoveCategoryList) | **GET** /api/v2/move-category/ | 
[**MoveCategoryRead**](MoveCategoryApi.md#MoveCategoryRead) | **GET** /api/v2/move-category/{id}/ | 


# **MoveCategoryList**
> character MoveCategoryList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- MoveCategoryApi$new()
result <- api.instance$MoveCategoryList(limit=var.limit, offset=var.offset)
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

var.id <- 56 # integer | 

api.instance <- MoveCategoryApi$new()
result <- api.instance$MoveCategoryRead(var.id)
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

