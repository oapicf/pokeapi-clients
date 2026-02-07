# UtilityApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**LanguageList**](UtilityApi.md#LanguageList) | **GET** /api/v2/language/ | List languages
[**LanguageRetrieve**](UtilityApi.md#LanguageRetrieve) | **GET** /api/v2/language/{id}/ | Get language


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
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
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

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

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
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- UtilityApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
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

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

