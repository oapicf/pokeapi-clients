# ContestTypeApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ContestTypeList**](ContestTypeApi.md#ContestTypeList) | **GET** /api/v2/contest-type/ | 
[**ContestTypeRead**](ContestTypeApi.md#ContestTypeRead) | **GET** /api/v2/contest-type/{id}/ | 


# **ContestTypeList**
> character ContestTypeList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- ContestTypeApi$new()
result <- api.instance$ContestTypeList(limit=var.limit, offset=var.offset)
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

# **ContestTypeRead**
> character ContestTypeRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- ContestTypeApi$new()
result <- api.instance$ContestTypeRead(var.id)
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

