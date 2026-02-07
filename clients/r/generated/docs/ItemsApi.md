# ItemsApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ItemAttributeList**](ItemsApi.md#ItemAttributeList) | **GET** /api/v2/item-attribute/ | List item attributes
[**ItemAttributeRetrieve**](ItemsApi.md#ItemAttributeRetrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**ItemCategoryList**](ItemsApi.md#ItemCategoryList) | **GET** /api/v2/item-category/ | List item categories
[**ItemCategoryRetrieve**](ItemsApi.md#ItemCategoryRetrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
[**ItemFlingEffectList**](ItemsApi.md#ItemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**ItemFlingEffectRetrieve**](ItemsApi.md#ItemFlingEffectRetrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**ItemList**](ItemsApi.md#ItemList) | **GET** /api/v2/item/ | List items
[**ItemPocketList**](ItemsApi.md#ItemPocketList) | **GET** /api/v2/item-pocket/ | List item pockets
[**ItemPocketRetrieve**](ItemsApi.md#ItemPocketRetrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**ItemRetrieve**](ItemsApi.md#ItemRetrieve) | **GET** /api/v2/item/{id}/ | Get item


# **ItemAttributeList**
> PaginatedItemAttributeSummaryList ItemAttributeList(limit = var.limit, offset = var.offset, q = var.q)

List item attributes

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Example
```R
library(openapi)

# List item attributes
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- ItemsApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemAttributeList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$ItemAttributeList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedItemAttributeSummaryList**](PaginatedItemAttributeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **ItemAttributeRetrieve**
> ItemAttributeDetail ItemAttributeRetrieve(id)

Get item attribute

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Example
```R
library(openapi)

# Get item attribute
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- ItemsApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemAttributeRetrieve(var_iddata_file = "result.txt")
result <- api_instance$ItemAttributeRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**ItemAttributeDetail**](ItemAttributeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **ItemCategoryList**
> PaginatedItemCategorySummaryList ItemCategoryList(limit = var.limit, offset = var.offset, q = var.q)

List item categories

Item categories determine where items will be placed in the players bag.

### Example
```R
library(openapi)

# List item categories
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- ItemsApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemCategoryList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$ItemCategoryList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedItemCategorySummaryList**](PaginatedItemCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **ItemCategoryRetrieve**
> ItemCategoryDetail ItemCategoryRetrieve(id)

Get item category

Item categories determine where items will be placed in the players bag.

### Example
```R
library(openapi)

# Get item category
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- ItemsApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemCategoryRetrieve(var_iddata_file = "result.txt")
result <- api_instance$ItemCategoryRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**ItemCategoryDetail**](ItemCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **ItemFlingEffectList**
> PaginatedItemFlingEffectSummaryList ItemFlingEffectList(limit = var.limit, offset = var.offset, q = var.q)

List item fling effects

The various effects of the move\"Fling\" when used with different items.

### Example
```R
library(openapi)

# List item fling effects
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- ItemsApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemFlingEffectList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$ItemFlingEffectList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedItemFlingEffectSummaryList**](PaginatedItemFlingEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **ItemFlingEffectRetrieve**
> ItemFlingEffectDetail ItemFlingEffectRetrieve(id)

Get item fling effect

The various effects of the move\"Fling\" when used with different items.

### Example
```R
library(openapi)

# Get item fling effect
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- ItemsApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemFlingEffectRetrieve(var_iddata_file = "result.txt")
result <- api_instance$ItemFlingEffectRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**ItemFlingEffectDetail**](ItemFlingEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **ItemList**
> PaginatedItemSummaryList ItemList(limit = var.limit, offset = var.offset, q = var.q)

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example
```R
library(openapi)

# List items
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- ItemsApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$ItemList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedItemSummaryList**](PaginatedItemSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **ItemPocketList**
> PaginatedItemPocketSummaryList ItemPocketList(limit = var.limit, offset = var.offset, q = var.q)

List item pockets

Pockets within the players bag used for storing items by category.

### Example
```R
library(openapi)

# List item pockets
#
# prepare function argument(s)
var_limit <- 56 # integer | Number of results to return per page. (Optional)
var_offset <- 56 # integer | The initial index from which to return the results. (Optional)
var_q <- "q_example" # character | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (Optional)

api_instance <- ItemsApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemPocketList(limit = var_limit, offset = var_offset, q = var_qdata_file = "result.txt")
result <- api_instance$ItemPocketList(limit = var_limit, offset = var_offset, q = var_q)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer**| Number of results to return per page. | [optional] 
 **offset** | **integer**| The initial index from which to return the results. | [optional] 
 **q** | **character**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] 

### Return type

[**PaginatedItemPocketSummaryList**](PaginatedItemPocketSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **ItemPocketRetrieve**
> ItemPocketDetail ItemPocketRetrieve(id)

Get item pocket

Pockets within the players bag used for storing items by category.

### Example
```R
library(openapi)

# Get item pocket
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- ItemsApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemPocketRetrieve(var_iddata_file = "result.txt")
result <- api_instance$ItemPocketRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**ItemPocketDetail**](ItemPocketDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

# **ItemRetrieve**
> ItemDetail ItemRetrieve(id)

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example
```R
library(openapi)

# Get item
#
# prepare function argument(s)
var_id <- "id_example" # character | This parameter can be a string or an integer.

api_instance <- ItemsApi$new()
# Configure HTTP basic authorization: basicAuth
api_instance$api_client$username <- Sys.getenv("USERNAME")
api_instance$api_client$password <- Sys.getenv("PASSWORD")
# Configure API key authorization: cookieAuth
# api_instance$api_client$api_keys["sessionid"] <- Sys.getenv("API_KEY")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$ItemRetrieve(var_iddata_file = "result.txt")
result <- api_instance$ItemRetrieve(var_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **character**| This parameter can be a string or an integer. | 

### Return type

[**ItemDetail**](ItemDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

