# ItemPocketApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemPocketList**](ItemPocketApi.md#ItemPocketList) | **GET** /api/v2/item-pocket/ | 
[**ItemPocketRead**](ItemPocketApi.md#ItemPocketRead) | **GET** /api/v2/item-pocket/{id}/ | 


# **ItemPocketList**
> character ItemPocketList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- ItemPocketApi$new()
result <- api_instance$ItemPocketList(limit = var_limit, offset = var_offset)
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

# **ItemPocketRead**
> character ItemPocketRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- ItemPocketApi$new()
result <- api_instance$ItemPocketRead(var_id)
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

