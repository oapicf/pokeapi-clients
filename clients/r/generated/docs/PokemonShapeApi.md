# PokemonShapeApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonShapeList**](PokemonShapeApi.md#PokemonShapeList) | **GET** /api/v2/pokemon-shape/ | 
[**PokemonShapeRead**](PokemonShapeApi.md#PokemonShapeRead) | **GET** /api/v2/pokemon-shape/{id}/ | 


# **PokemonShapeList**
> character PokemonShapeList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- PokemonShapeApi$new()
result <- api_instance$PokemonShapeList(limit = var_limit, offset = var_offset)
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

# **PokemonShapeRead**
> character PokemonShapeRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- PokemonShapeApi$new()
result <- api_instance$PokemonShapeRead(var_id)
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

