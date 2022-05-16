# ItemAttributeApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemAttributeList**](ItemAttributeApi.md#ItemAttributeList) | **GET** /api/v2/item-attribute/ | 
[**ItemAttributeRead**](ItemAttributeApi.md#ItemAttributeRead) | **GET** /api/v2/item-attribute/{id}/ | 


# **ItemAttributeList**
> character ItemAttributeList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- ItemAttributeApi$new()
result <- api.instance$ItemAttributeList(limit=var.limit, offset=var.offset)
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

var.id <- 56 # integer | 

api.instance <- ItemAttributeApi$new()
result <- api.instance$ItemAttributeRead(var.id)
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

