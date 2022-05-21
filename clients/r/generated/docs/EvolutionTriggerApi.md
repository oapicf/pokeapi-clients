# EvolutionTriggerApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EvolutionTriggerList**](EvolutionTriggerApi.md#EvolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | 
[**EvolutionTriggerRead**](EvolutionTriggerApi.md#EvolutionTriggerRead) | **GET** /api/v2/evolution-trigger/{id}/ | 


# **EvolutionTriggerList**
> character EvolutionTriggerList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- EvolutionTriggerApi$new()
result <- api.instance$EvolutionTriggerList(limit=var.limit, offset=var.offset)
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

# **EvolutionTriggerRead**
> character EvolutionTriggerRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- EvolutionTriggerApi$new()
result <- api.instance$EvolutionTriggerRead(var.id)
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

