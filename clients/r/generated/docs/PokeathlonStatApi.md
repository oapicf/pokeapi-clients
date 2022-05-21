# PokeathlonStatApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokeathlonStatList**](PokeathlonStatApi.md#PokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | 
[**PokeathlonStatRead**](PokeathlonStatApi.md#PokeathlonStatRead) | **GET** /api/v2/pokeathlon-stat/{id}/ | 


# **PokeathlonStatList**
> character PokeathlonStatList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- PokeathlonStatApi$new()
result <- api.instance$PokeathlonStatList(limit=var.limit, offset=var.offset)
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

# **PokeathlonStatRead**
> character PokeathlonStatRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- PokeathlonStatApi$new()
result <- api.instance$PokeathlonStatRead(var.id)
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

