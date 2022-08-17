# ItemAttributeApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemAttributeList**](ItemAttributeApi.md#ItemAttributeList) | **GET** /api/v2/item-attribute/ | 
[**ItemAttributeRead**](ItemAttributeApi.md#ItemAttributeRead) | **GET** /api/v2/item-attribute/{id}/ | 


# **ItemAttributeList**
> character ItemAttributeList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- ItemAttributeApi$new()
result <- api_instance$ItemAttributeList(limit = var_limit, offset = var_offset)
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

# **ItemAttributeRead**
> character ItemAttributeRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- ItemAttributeApi$new()
result <- api_instance$ItemAttributeRead(var_id)
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

