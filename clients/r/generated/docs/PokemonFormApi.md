# PokemonFormApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonFormList**](PokemonFormApi.md#PokemonFormList) | **GET** /api/v2/pokemon-form/ | 
[**PokemonFormRead**](PokemonFormApi.md#PokemonFormRead) | **GET** /api/v2/pokemon-form/{id}/ | 


# **PokemonFormList**
> character PokemonFormList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- PokemonFormApi$new()
result <- api_instance$PokemonFormList(limit = var_limit, offset = var_offset)
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

# **PokemonFormRead**
> character PokemonFormRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- PokemonFormApi$new()
result <- api_instance$PokemonFormRead(var_id)
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

