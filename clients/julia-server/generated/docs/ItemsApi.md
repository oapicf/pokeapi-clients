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
> `item_attribute_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedItemAttributeSummaryList`

List item attributes

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedItemAttributeSummaryList`**](PaginatedItemAttributeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_attribute_retrieve**
> `item_attribute_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `ItemAttributeDetail`

Get item attribute

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`ItemAttributeDetail`**](ItemAttributeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_category_list**
> `item_category_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedItemCategorySummaryList`

List item categories

Item categories determine where items will be placed in the players bag.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedItemCategorySummaryList`**](PaginatedItemCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_category_retrieve**
> `item_category_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `ItemCategoryDetail`

Get item category

Item categories determine where items will be placed in the players bag.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`ItemCategoryDetail`**](ItemCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_fling_effect_list**
> `item_fling_effect_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedItemFlingEffectSummaryList`

List item fling effects

The various effects of the move\"Fling\" when used with different items.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedItemFlingEffectSummaryList`**](PaginatedItemFlingEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_fling_effect_retrieve**
> `item_fling_effect_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `ItemFlingEffectDetail`

Get item fling effect

The various effects of the move\"Fling\" when used with different items.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`ItemFlingEffectDetail`**](ItemFlingEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_list**
> `item_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedItemSummaryList`

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedItemSummaryList`**](PaginatedItemSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_pocket_list**
> `item_pocket_list`(req::`HTTP.Request`; `limit`=nothing, `offset`=nothing, `q`=nothing,) -> `PaginatedItemPocketSummaryList`

List item pockets

Pockets within the players bag used for storing items by category.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`**| Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`**| The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedItemPocketSummaryList`**](PaginatedItemPocketSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_pocket_retrieve**
> `item_pocket_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `ItemPocketDetail`

Get item pocket

Pockets within the players bag used for storing items by category.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`ItemPocketDetail`**](ItemPocketDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **item_retrieve**
> `item_retrieve`(req::`HTTP.Request`, `id`::`String`;) -> `ItemDetail`

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | **`HTTP.Request`** | The HTTP Request object | 
**`id`** | **`String`**| This parameter can be a string or an integer. |

### Return type

[**`ItemDetail`**](ItemDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

