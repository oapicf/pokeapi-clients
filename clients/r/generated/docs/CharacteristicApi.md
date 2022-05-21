# CharacteristicApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CharacteristicList**](CharacteristicApi.md#CharacteristicList) | **GET** /api/v2/characteristic/ | 
[**CharacteristicRead**](CharacteristicApi.md#CharacteristicRead) | **GET** /api/v2/characteristic/{id}/ | 


# **CharacteristicList**
> character CharacteristicList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- CharacteristicApi$new()
result <- api.instance$CharacteristicList(limit=var.limit, offset=var.offset)
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

# **CharacteristicRead**
> character CharacteristicRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- CharacteristicApi$new()
result <- api.instance$CharacteristicRead(var.id)
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

