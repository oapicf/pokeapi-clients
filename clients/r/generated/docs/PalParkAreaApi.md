# PalParkAreaApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PalParkAreaList**](PalParkAreaApi.md#PalParkAreaList) | **GET** /api/v2/pal-park-area/ | 
[**PalParkAreaRead**](PalParkAreaApi.md#PalParkAreaRead) | **GET** /api/v2/pal-park-area/{id}/ | 


# **PalParkAreaList**
> character PalParkAreaList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- PalParkAreaApi$new()
result <- api.instance$PalParkAreaList(limit=var.limit, offset=var.offset)
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

# **PalParkAreaRead**
> character PalParkAreaRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- PalParkAreaApi$new()
result <- api.instance$PalParkAreaRead(var.id)
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

