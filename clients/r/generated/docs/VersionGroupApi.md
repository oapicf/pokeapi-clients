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

# prepare function argument(s)
var_limit <- 56 # integer |  (Optional)
var_offset <- 56 # integer |  (Optional)

api_instance <- VersionGroupApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$VersionGroupList(limit = var_limit, offset = var_offsetdata_file = "result.txt")
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

# prepare function argument(s)
var_id <- 56 # integer | 

api_instance <- VersionGroupApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$VersionGroupRead(var_iddata_file = "result.txt")
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

