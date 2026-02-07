# BerriesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BerryFirmnessList**](BerriesApi.md#BerryFirmnessList) | **GET** /api/v2/berry-firmness/ | List berry firmness
[**BerryFirmnessRetrieve**](BerriesApi.md#BerryFirmnessRetrieve) | **GET** /api/v2/berry-firmness/{id}/ | Get berry by firmness
[**BerryFlavorList**](BerriesApi.md#BerryFlavorList) | **GET** /api/v2/berry-flavor/ | List berry flavors
[**BerryFlavorRetrieve**](BerriesApi.md#BerryFlavorRetrieve) | **GET** /api/v2/berry-flavor/{id}/ | Get berries by flavor
[**BerryList**](BerriesApi.md#BerryList) | **GET** /api/v2/berry/ | List berries
[**BerryRetrieve**](BerriesApi.md#BerryRetrieve) | **GET** /api/v2/berry/{id}/ | Get a berry


# **BerryFirmnessList**
> PaginatedBerryFirmnessSummaryList BerryFirmnessList(limit = var.limit, offset = var.offset, q = var.q)

List berry firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example
```R
library(openapi)

# List berry firmness
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- BerriesApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BerryFirmnessList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$BerryFirmnessList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedBerryFirmnessSummaryList**](PaginatedBerryFirmnessSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **BerryFirmnessRetrieve**
> BerryFirmnessDetail BerryFirmnessRetrieve(id)

Get berry by firmness

Berries can be soft or hard. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Category:Berries_by_firmness) for greater detail.

### Example
```R
library(openapi)

# Get berry by firmness
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- BerriesApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BerryFirmnessRetrieve(var_iddata_file = "result.txt")
result <- api_instance$BerryFirmnessRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**BerryFirmnessDetail**](BerryFirmnessDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **BerryFlavorList**
> PaginatedBerryFlavorSummaryList BerryFlavorList(limit = var.limit, offset = var.offset, q = var.q)

List berry flavors

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example
```R
library(openapi)

# List berry flavors
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- BerriesApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BerryFlavorList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$BerryFlavorList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedBerryFlavorSummaryList**](PaginatedBerryFlavorSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **BerryFlavorRetrieve**
> BerryFlavorDetail BerryFlavorRetrieve(id)

Get berries by flavor

Flavors determine whether a Pokémon will benefit or suffer from eating a berry based on their **nature**. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Flavor) for greater detail.

### Example
```R
library(openapi)

# Get berries by flavor
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- BerriesApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BerryFlavorRetrieve(var_iddata_file = "result.txt")
result <- api_instance$BerryFlavorRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**BerryFlavorDetail**](BerryFlavorDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **BerryList**
> PaginatedBerrySummaryList BerryList(limit = var.limit, offset = var.offset, q = var.q)

List berries

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example
```R
library(openapi)

# List berries
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- BerriesApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BerryList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$BerryList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedBerrySummaryList**](PaginatedBerrySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **BerryRetrieve**
> BerryDetail BerryRetrieve(id)

Get a berry

Berries are small fruits that can provide HP and status condition restoration, stat enhancement, and even damage negation when eaten by Pokémon. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Berry) for greater detail.

### Example
```R
library(openapi)

# Get a berry
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- BerriesApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$BerryRetrieve(var_iddata_file = "result.txt")
result <- api_instance$BerryRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**BerryDetail**](BerryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

