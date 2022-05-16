# PokemonHabitatApi

All URIs are relative to *https://pokeapi.co/api/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PokemonHabitatList**](PokemonHabitatApi.md#PokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | 
[**PokemonHabitatRead**](PokemonHabitatApi.md#PokemonHabitatRead) | **GET** /api/v2/pokemon-habitat/{id}/ | 


# **PokemonHabitatList**
> character PokemonHabitatList(limit=var.limit, offset=var.offset)



### Example
```R
library(openapi)

var.limit <- 56 # integer | 
var.offset <- 56 # integer | 

api.instance <- PokemonHabitatApi$new()
result <- api.instance$PokemonHabitatList(limit=var.limit, offset=var.offset)
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

# **PokemonHabitatRead**
> character PokemonHabitatRead(id)



### Example
```R
library(openapi)

var.id <- 56 # integer | 

api.instance <- PokemonHabitatApi$new()
result <- api.instance$PokemonHabitatRead(var.id)
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

