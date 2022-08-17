# MoveTargetApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveTargetList**](MoveTargetApi.md#MoveTargetList) | **GET** /api/v2/move-target/ | 
[**MoveTargetRead**](MoveTargetApi.md#MoveTargetRead) | **GET** /api/v2/move-target/{id}/ | 


# **MoveTargetList**
> character MoveTargetList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- MoveTargetApi$new()
result <- api_instance$MoveTargetList(limit = var_limit, offset = var_offset)
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

# **MoveTargetRead**
> character MoveTargetRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- MoveTargetApi$new()
result <- api_instance$MoveTargetRead(var_id)
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

