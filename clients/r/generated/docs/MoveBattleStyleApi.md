# MoveBattleStyleApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**MoveBattleStyleList**](MoveBattleStyleApi.md#MoveBattleStyleList) | **GET** /api/v2/move-battle-style/ | 
[**MoveBattleStyleRead**](MoveBattleStyleApi.md#MoveBattleStyleRead) | **GET** /api/v2/move-battle-style/{id}/ | 


# **MoveBattleStyleList**
> character MoveBattleStyleList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- MoveBattleStyleApi$new()
result <- api.instance$MoveBattleStyleList(limit=var.limit, offset=var.offset)
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

# **MoveBattleStyleRead**
> character MoveBattleStyleRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- MoveBattleStyleApi$new()
result <- api.instance$MoveBattleStyleRead(var.id)
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

