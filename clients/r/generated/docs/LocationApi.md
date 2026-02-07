# LocationApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LocationAreaList**](LocationApi.md#LocationAreaList) | **GET** /api/v2/location-area/ | List location areas
[**LocationAreaRetrieve**](LocationApi.md#LocationAreaRetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area
[**LocationList**](LocationApi.md#LocationList) | **GET** /api/v2/location/ | List locations
[**LocationRetrieve**](LocationApi.md#LocationRetrieve) | **GET** /api/v2/location/{id}/ | Get location
[**PalParkAreaList**](LocationApi.md#PalParkAreaList) | **GET** /api/v2/pal-park-area/ | List pal park areas
[**PalParkAreaRetrieve**](LocationApi.md#PalParkAreaRetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area
[**RegionList**](LocationApi.md#RegionList) | **GET** /api/v2/region/ | List regions
[**RegionRetrieve**](LocationApi.md#RegionRetrieve) | **GET** /api/v2/region/{id}/ | Get region


# **LocationAreaList**
> PaginatedLocationAreaSummaryList LocationAreaList(limit = var.limit, offset = var.offset)

List location areas

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example
```R
library(openapi)

# List location areas
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)

api_instance <- LocationApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LocationAreaList(limit = var_limit, offset = var_offsetdata_file = "result.txt")
result <- api_instance$LocationAreaList(limit = var_limit, offset = var_offset)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 

### Return type

[**PaginatedLocationAreaSummaryList**](PaginatedLocationAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **LocationAreaRetrieve**
> LocationAreaDetail LocationAreaRetrieve(id)

Get location area

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example
```R
library(openapi)

# Get location area
#
# prepare function argument(s)
var_id <- 56 # integer | A unique integer value identifying this location area.

api_instance <- LocationApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LocationAreaRetrieve(var_iddata_file = "result.txt")
result <- api_instance$LocationAreaRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **integer**| A unique integer value identifying this location area. | 

### Return type

[**LocationAreaDetail**](LocationAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **LocationList**
> PaginatedLocationSummaryList LocationList(limit = var.limit, offset = var.offset, q = var.q)

List locations

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example
```R
library(openapi)

# List locations
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- LocationApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LocationList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$LocationList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedLocationSummaryList**](PaginatedLocationSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **LocationRetrieve**
> LocationDetail LocationRetrieve(id)

Get location

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example
```R
library(openapi)

# Get location
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- LocationApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LocationRetrieve(var_iddata_file = "result.txt")
result <- api_instance$LocationRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**LocationDetail**](LocationDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PalParkAreaList**
> PaginatedPalParkAreaSummaryList PalParkAreaList(limit = var.limit, offset = var.offset, q = var.q)

List pal park areas

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Example
```R
library(openapi)

# List pal park areas
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- LocationApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PalParkAreaList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$PalParkAreaList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedPalParkAreaSummaryList**](PaginatedPalParkAreaSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **PalParkAreaRetrieve**
> PalParkAreaDetail PalParkAreaRetrieve(id)

Get pal park area

Areas used for grouping Pokémon encounters in Pal Park. They're like habitats that are specific to Pal Park.

### Example
```R
library(openapi)

# Get pal park area
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- LocationApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$PalParkAreaRetrieve(var_iddata_file = "result.txt")
result <- api_instance$PalParkAreaRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**PalParkAreaDetail**](PalParkAreaDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **RegionList**
> PaginatedRegionSummaryList RegionList(limit = var.limit, offset = var.offset, q = var.q)

List regions

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example
```R
library(openapi)

# List regions
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- LocationApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RegionList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$RegionList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedRegionSummaryList**](PaginatedRegionSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **RegionRetrieve**
> RegionDetail RegionRetrieve(id)

Get region

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example
```R
library(openapi)

# Get region
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- LocationApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$RegionRetrieve(var_iddata_file = "result.txt")
result <- api_instance$RegionRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**RegionDetail**](RegionDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

