# ItemCategoryApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemCategoryList**](ItemCategoryApi.md#ItemCategoryList) | **GET** /api/v2/item-category/ | 
[**ItemCategoryRead**](ItemCategoryApi.md#ItemCategoryRead) | **GET** /api/v2/item-category/{id}/ | 


# **ItemCategoryList**
> character ItemCategoryList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- ItemCategoryApi$new()
result <- api.instance$ItemCategoryList(limit=var.limit, offset=var.offset)
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

# **ItemCategoryRead**
> character ItemCategoryRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- ItemCategoryApi$new()
result <- api.instance$ItemCategoryRead(var.id)
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

