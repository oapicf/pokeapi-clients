# UtilityApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LanguageList**](UtilityApi.md#LanguageList) | **GET** /api/v2/language/ | List languages
[**LanguageRetrieve**](UtilityApi.md#LanguageRetrieve) | **GET** /api/v2/language/{id}/ | Get language
[**MetaRetrieve**](UtilityApi.md#MetaRetrieve) | **GET** /api/v2/meta/ | Get API metadata


# **LanguageList**
> PaginatedLanguageSummaryList LanguageList(limit = var.limit, offset = var.offset, q = var.q)

List languages

Languages for translations of API resource information.

### Example
```R
library(openapi)

# List languages
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- UtilityApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LanguageList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$LanguageList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedLanguageSummaryList**](PaginatedLanguageSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **LanguageRetrieve**
> LanguageDetail LanguageRetrieve(id)

Get language

Languages for translations of API resource information.

### Example
```R
library(openapi)

# Get language
#
# prepare function argument(s)
var_id <- "1" # character | This parameter can be a string or an integer.

api_instance <- UtilityApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$LanguageRetrieve(var_iddata_file = "result.txt")
result <- api_instance$LanguageRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**LanguageDetail**](LanguageDetail.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **MetaRetrieve**
> PokeapiMetaResponse MetaRetrieve()

Get API metadata

Returns metadata about the current deployed version of the API, including the git commit hash, deploy date, and tag (if any).

### Example
```R
library(openapi)

# Get API metadata
#

api_instance <- UtilityApi$new()
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$MetaRetrieve(data_file = "result.txt")
result <- api_instance$MetaRetrieve()
dput(result)
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PokeapiMetaResponse**](PokeapiMetaResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

