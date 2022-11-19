# NatureApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NatureList**](NatureApi.md#NatureList) | **GET** /api/v2/nature/ | 
[**NatureRead**](NatureApi.md#NatureRead) | **GET** /api/v2/nature/{id}/ | 


# **NatureList**
> character NatureList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

# prepare function argument(s)
var_limit <- 56 # integer |  (Optional)
var_offset <- 56 # integer |  (Optional)

api_instance <- NatureApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$NatureList(limit = var_limit, offset = var_offsetdata_file = "result.txt")
result <- api_instance$NatureList(limit = var_limit, offset = var_offset)
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

# **NatureRead**
> character NatureRead(id)



### Example
```R
library(openapi)

# prepare function argument(s)
var_id <- 56 # integer | 

api_instance <- NatureApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$NatureRead(var_iddata_file = "result.txt")
result <- api_instance$NatureRead(var_id)
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

