# PokemonSpeciesApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonSpeciesList**](PokemonSpeciesApi.md#PokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | 
[**PokemonSpeciesRead**](PokemonSpeciesApi.md#PokemonSpeciesRead) | **GET** /api/v2/pokemon-species/{id}/ | 


# **PokemonSpeciesList**
> character PokemonSpeciesList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- PokemonSpeciesApi$new()
result <- api.instance$PokemonSpeciesList(limit=var.limit, offset=var.offset)
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

# **PokemonSpeciesRead**
> character PokemonSpeciesRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- PokemonSpeciesApi$new()
result <- api.instance$PokemonSpeciesRead(var.id)
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

