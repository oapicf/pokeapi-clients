# GenderApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GenderList**](GenderApi.md#GenderList) | **GET** /api/v2/gender/ | 
[**GenderRead**](GenderApi.md#GenderRead) | **GET** /api/v2/gender/{id}/ | 


# **GenderList**
> character GenderList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- GenderApi$new()
result <- api.instance$GenderList(limit=var.limit, offset=var.offset)
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

# **GenderRead**
> character GenderRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- GenderApi$new()
result <- api.instance$GenderRead(var.id)
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

