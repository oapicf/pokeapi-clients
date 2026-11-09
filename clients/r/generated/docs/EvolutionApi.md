# EvolutionApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**EvolutionChainList**](EvolutionApi.md#EvolutionChainList) | **GET** /api/v2/evolution-chain/ | List evolution chains
[**EvolutionChainRetrieve**](EvolutionApi.md#EvolutionChainRetrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain
[**EvolutionTriggerList**](EvolutionApi.md#EvolutionTriggerList) | **GET** /api/v2/evolution-trigger/ | List evolution triggers
[**EvolutionTriggerRetrieve**](EvolutionApi.md#EvolutionTriggerRetrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger
[**EvolutionVariableList**](EvolutionApi.md#EvolutionVariableList) | **GET** /api/v2/evolution-variable/ | List evolution variables
[**EvolutionVariableRetrieve**](EvolutionApi.md#EvolutionVariableRetrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable


# **EvolutionChainList**
> PaginatedEvolutionChainSummaryList EvolutionChainList(limit = var.limit, offset = var.offset)

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example
```R
library(openapi)

# List evolution chains
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)

api_instance <- EvolutionApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$EvolutionChainList(limit = var_limit, offset = var_offsetdata_file = "result.txt")
result <- api_instance$EvolutionChainList(limit = var_limit, offset = var_offset)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 

### Return type

[**PaginatedEvolutionChainSummaryList**](PaginatedEvolutionChainSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **EvolutionChainRetrieve**
> EvolutionChainDetail EvolutionChainRetrieve(id)

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example
```R
library(openapi)

# Get evolution chain
#
# prepare function argument(s)
var_id <- "1" # character | This parameter can be a string or an integer.

api_instance <- EvolutionApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$EvolutionChainRetrieve(var_iddata_file = "result.txt")
result <- api_instance$EvolutionChainRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**EvolutionChainDetail**](EvolutionChainDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **EvolutionTriggerList**
> PaginatedEvolutionTriggerSummaryList EvolutionTriggerList(limit = var.limit, offset = var.offset, q = var.q)

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example
```R
library(openapi)

# List evolution triggers
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- EvolutionApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$EvolutionTriggerList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$EvolutionTriggerList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedEvolutionTriggerSummaryList**](PaginatedEvolutionTriggerSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **EvolutionTriggerRetrieve**
> EvolutionTriggerDetail EvolutionTriggerRetrieve(id)

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example
```R
library(openapi)

# Get evolution trigger
#
# prepare function argument(s)
var_id <- "1" # character | This parameter can be a string or an integer.

api_instance <- EvolutionApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$EvolutionTriggerRetrieve(var_iddata_file = "result.txt")
result <- api_instance$EvolutionTriggerRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**EvolutionTriggerDetail**](EvolutionTriggerDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **EvolutionVariableList**
> PaginatedEvolutionVariableSummaryList EvolutionVariableList(limit = var.limit, offset = var.offset, q = var.q)

List evolution variables

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example
```R
library(openapi)

# List evolution variables
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- EvolutionApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$EvolutionVariableList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$EvolutionVariableList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedEvolutionVariableSummaryList**](PaginatedEvolutionVariableSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **EvolutionVariableRetrieve**
> EvolutionVariableDetail EvolutionVariableRetrieve(id)

Get evolution variable

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example
```R
library(openapi)

# Get evolution variable
#
# prepare function argument(s)
var_id <- "1" # character | This parameter can be a string or an integer.

api_instance <- EvolutionApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$EvolutionVariableRetrieve(var_iddata_file = "result.txt")
result <- api_instance$EvolutionVariableRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**EvolutionVariableDetail**](EvolutionVariableDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

