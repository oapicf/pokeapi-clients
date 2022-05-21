# EvolutionChainApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EvolutionChainList**](EvolutionChainApi.md#EvolutionChainList) | **GET** /api/v2/evolution-chain/ | 
[**EvolutionChainRead**](EvolutionChainApi.md#EvolutionChainRead) | **GET** /api/v2/evolution-chain/{id}/ | 


# **EvolutionChainList**
> character EvolutionChainList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- EvolutionChainApi$new()
result <- api.instance$EvolutionChainList(limit=var.limit, offset=var.offset)
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

# **EvolutionChainRead**
> character EvolutionChainRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- EvolutionChainApi$new()
result <- api.instance$EvolutionChainRead(var.id)
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

