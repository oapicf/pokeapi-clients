# BerryFlavorApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BerryFlavorList**](BerryFlavorApi.md#BerryFlavorList) | **GET** /api/v2/berry-flavor/ | 
[**BerryFlavorRead**](BerryFlavorApi.md#BerryFlavorRead) | **GET** /api/v2/berry-flavor/{id}/ | 


# **BerryFlavorList**
> character BerryFlavorList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- BerryFlavorApi$new()
result <- api.instance$BerryFlavorList(limit=var.limit, offset=var.offset)
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

# **BerryFlavorRead**
> character BerryFlavorRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- BerryFlavorApi$new()
result <- api.instance$BerryFlavorRead(var.id)
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

