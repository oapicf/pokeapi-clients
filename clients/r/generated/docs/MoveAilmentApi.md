# MoveAilmentApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveAilmentList**](MoveAilmentApi.md#MoveAilmentList) | **GET** /api/v2/move-ailment/ | 
[**MoveAilmentRead**](MoveAilmentApi.md#MoveAilmentRead) | **GET** /api/v2/move-ailment/{id}/ | 


# **MoveAilmentList**
> character MoveAilmentList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- MoveAilmentApi$new()
result <- api.instance$MoveAilmentList(limit=var.limit, offset=var.offset)
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

# **MoveAilmentRead**
> character MoveAilmentRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- MoveAilmentApi$new()
result <- api.instance$MoveAilmentRead(var.id)
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

