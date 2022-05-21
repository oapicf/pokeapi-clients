# GrowthRateApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GrowthRateList**](GrowthRateApi.md#GrowthRateList) | **GET** /api/v2/growth-rate/ | 
[**GrowthRateRead**](GrowthRateApi.md#GrowthRateRead) | **GET** /api/v2/growth-rate/{id}/ | 


# **GrowthRateList**
> character GrowthRateList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- GrowthRateApi$new()
result <- api.instance$GrowthRateList(limit=var.limit, offset=var.offset)
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

# **GrowthRateRead**
> character GrowthRateRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- GrowthRateApi$new()
result <- api.instance$GrowthRateRead(var.id)
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

