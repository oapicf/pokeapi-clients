# BerryApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BerryList**](BerryApi.md#BerryList) | **GET** /api/v2/berry/ | 
[**BerryRead**](BerryApi.md#BerryRead) | **GET** /api/v2/berry/{id}/ | 


# **BerryList**
> character BerryList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

# prepare function argument(s)
var_limit <- 56 # integer |  (Optional)
var_offset <- 56 # integer |  (Optional)

api_instance <- BerryApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BerryList(limit = var_limit, offset = var_offsetdata_file = "result.txt")
result <- api_instance$BerryList(limit = var_limit, offset = var_offset)
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

# **BerryRead**
> character BerryRead(id)



### Example
```R
library(openapi)

# prepare function argument(s)
var_id <- 56 # integer | 

api_instance <- BerryApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BerryRead(var_iddata_file = "result.txt")
result <- api_instance$BerryRead(var_id)
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

