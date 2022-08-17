# VersionGroupApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**VersionGroupList**](VersionGroupApi.md#VersionGroupList) | **GET** /api/v2/version-group/ | 
[**VersionGroupRead**](VersionGroupApi.md#VersionGroupRead) | **GET** /api/v2/version-group/{id}/ | 


# **VersionGroupList**
> character VersionGroupList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- VersionGroupApi$new()
result <- api_instance$VersionGroupList(limit = var_limit, offset = var_offset)
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

# **VersionGroupRead**
> character VersionGroupRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- VersionGroupApi$new()
result <- api_instance$VersionGroupRead(var_id)
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

