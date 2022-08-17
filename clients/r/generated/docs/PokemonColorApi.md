# PokemonColorApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonColorList**](PokemonColorApi.md#PokemonColorList) | **GET** /api/v2/pokemon-color/ | 
[**PokemonColorRead**](PokemonColorApi.md#PokemonColorRead) | **GET** /api/v2/pokemon-color/{id}/ | 


# **PokemonColorList**
> character PokemonColorList(limit = var.limit, offset = var.offset)



### Example
```R
library(openapi)

var_limit <- 56 # integer | 
var_offset <- 56 # integer | 

api_instance <- PokemonColorApi$new()
result <- api_instance$PokemonColorList(limit = var_limit, offset = var_offset)
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

# **PokemonColorRead**
> character PokemonColorRead(id)



### Example
```R
library(openapi)

var_id <- 56 # integer | 

api_instance <- PokemonColorApi$new()
result <- api_instance$PokemonColorRead(var_id)
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

