# TypeApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**TypeList**](TypeApi.md#TypeList) | **GET** /api/v2/type/ | 
[**TypeRead**](TypeApi.md#TypeRead) | **GET** /api/v2/type/{id}/ | 


# **TypeList**
> character TypeList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- TypeApi$new()
result <- api.instance$TypeList(limit=var.limit, offset=var.offset)
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

# **TypeRead**
> character TypeRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- TypeApi$new()
result <- api.instance$TypeRead(var.id)
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

