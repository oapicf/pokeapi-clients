# ItemsApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**item_attribute_list**](ItemsApi.md#item_attribute_list) | **GET** /api/v2/item-attribute/ | List item attributes
[**item_attribute_retrieve**](ItemsApi.md#item_attribute_retrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**item_category_list**](ItemsApi.md#item_category_list) | **GET** /api/v2/item-category/ | List item categories
[**item_category_retrieve**](ItemsApi.md#item_category_retrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
[**item_fling_effect_list**](ItemsApi.md#item_fling_effect_list) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**item_fling_effect_retrieve**](ItemsApi.md#item_fling_effect_retrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**item_list**](ItemsApi.md#item_list) | **GET** /api/v2/item/ | List items
[**item_pocket_list**](ItemsApi.md#item_pocket_list) | **GET** /api/v2/item-pocket/ | List item pockets
[**item_pocket_retrieve**](ItemsApi.md#item_pocket_retrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**item_retrieve**](ItemsApi.md#item_retrieve) | **GET** /api/v2/item/{id}/ | Get item


# **item_attribute_list**
> `item_attribute_list`(_api::`ItemsApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedItemAttributeSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `item_attribute_list`(_api::`ItemsApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedItemAttributeSummaryList` }, `OpenAPI.Clients.ApiResponse`

List item attributes

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ItemsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedItemAttributeSummaryList`**](PaginatedItemAttributeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **item_attribute_retrieve**
> `item_attribute_retrieve`(_api::`ItemsApi`, `id`::`String`; _mediaType=nothing) -> `ItemAttributeDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `item_attribute_retrieve`(_api::`ItemsApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `ItemAttributeDetail` }, `OpenAPI.Clients.ApiResponse`

Get item attribute

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ItemsApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`ItemAttributeDetail`**](ItemAttributeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **item_category_list**
> `item_category_list`(_api::`ItemsApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedItemCategorySummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `item_category_list`(_api::`ItemsApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedItemCategorySummaryList` }, `OpenAPI.Clients.ApiResponse`

List item categories

Item categories determine where items will be placed in the players bag.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ItemsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedItemCategorySummaryList`**](PaginatedItemCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **item_category_retrieve**
> `item_category_retrieve`(_api::`ItemsApi`, `id`::`String`; _mediaType=nothing) -> `ItemCategoryDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `item_category_retrieve`(_api::`ItemsApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `ItemCategoryDetail` }, `OpenAPI.Clients.ApiResponse`

Get item category

Item categories determine where items will be placed in the players bag.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ItemsApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`ItemCategoryDetail`**](ItemCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **item_fling_effect_list**
> `item_fling_effect_list`(_api::`ItemsApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedItemFlingEffectSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `item_fling_effect_list`(_api::`ItemsApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedItemFlingEffectSummaryList` }, `OpenAPI.Clients.ApiResponse`

List item fling effects

The various effects of the move\"Fling\" when used with different items.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ItemsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedItemFlingEffectSummaryList`**](PaginatedItemFlingEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **item_fling_effect_retrieve**
> `item_fling_effect_retrieve`(_api::`ItemsApi`, `id`::`String`; _mediaType=nothing) -> `ItemFlingEffectDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `item_fling_effect_retrieve`(_api::`ItemsApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `ItemFlingEffectDetail` }, `OpenAPI.Clients.ApiResponse`

Get item fling effect

The various effects of the move\"Fling\" when used with different items.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ItemsApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`ItemFlingEffectDetail`**](ItemFlingEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **item_list**
> `item_list`(_api::`ItemsApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedItemSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `item_list`(_api::`ItemsApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedItemSummaryList` }, `OpenAPI.Clients.ApiResponse`

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ItemsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedItemSummaryList`**](PaginatedItemSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **item_pocket_list**
> `item_pocket_list`(_api::`ItemsApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedItemPocketSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `item_pocket_list`(_api::`ItemsApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedItemPocketSummaryList` }, `OpenAPI.Clients.ApiResponse`

List item pockets

Pockets within the players bag used for storing items by category.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ItemsApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedItemPocketSummaryList`**](PaginatedItemPocketSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **item_pocket_retrieve**
> `item_pocket_retrieve`(_api::`ItemsApi`, `id`::`String`; _mediaType=nothing) -> `ItemPocketDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `item_pocket_retrieve`(_api::`ItemsApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `ItemPocketDetail` }, `OpenAPI.Clients.ApiResponse`

Get item pocket

Pockets within the players bag used for storing items by category.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ItemsApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`ItemPocketDetail`**](ItemPocketDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **item_retrieve**
> `item_retrieve`(_api::`ItemsApi`, `id`::`String`; _mediaType=nothing) -> `ItemDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `item_retrieve`(_api::`ItemsApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `ItemDetail` }, `OpenAPI.Clients.ApiResponse`

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`ItemsApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`ItemDetail`**](ItemDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

