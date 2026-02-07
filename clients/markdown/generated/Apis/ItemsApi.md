# ItemsApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemAttributeList**](ItemsApi.md#itemAttributeList) | **GET** /api/v2/item-attribute/ | List item attributes |
| [**itemAttributeRetrieve**](ItemsApi.md#itemAttributeRetrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute |
| [**itemCategoryList**](ItemsApi.md#itemCategoryList) | **GET** /api/v2/item-category/ | List item categories |
| [**itemCategoryRetrieve**](ItemsApi.md#itemCategoryRetrieve) | **GET** /api/v2/item-category/{id}/ | Get item category |
| [**itemFlingEffectList**](ItemsApi.md#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | List item fling effects |
| [**itemFlingEffectRetrieve**](ItemsApi.md#itemFlingEffectRetrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect |
| [**itemList**](ItemsApi.md#itemList) | **GET** /api/v2/item/ | List items |
| [**itemPocketList**](ItemsApi.md#itemPocketList) | **GET** /api/v2/item-pocket/ | List item pockets |
| [**itemPocketRetrieve**](ItemsApi.md#itemPocketRetrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket |
| [**itemRetrieve**](ItemsApi.md#itemRetrieve) | **GET** /api/v2/item/{id}/ | Get item |


<a name="itemAttributeList"></a>
# **itemAttributeList**
> PaginatedItemAttributeSummaryList itemAttributeList(limit, offset, q)

List item attributes

    Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedItemAttributeSummaryList**](../Models/PaginatedItemAttributeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemAttributeRetrieve"></a>
# **itemAttributeRetrieve**
> ItemAttributeDetail itemAttributeRetrieve(id)

Get item attribute

    Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**ItemAttributeDetail**](../Models/ItemAttributeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemCategoryList"></a>
# **itemCategoryList**
> PaginatedItemCategorySummaryList itemCategoryList(limit, offset, q)

List item categories

    Item categories determine where items will be placed in the players bag.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedItemCategorySummaryList**](../Models/PaginatedItemCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemCategoryRetrieve"></a>
# **itemCategoryRetrieve**
> ItemCategoryDetail itemCategoryRetrieve(id)

Get item category

    Item categories determine where items will be placed in the players bag.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**ItemCategoryDetail**](../Models/ItemCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemFlingEffectList"></a>
# **itemFlingEffectList**
> PaginatedItemFlingEffectSummaryList itemFlingEffectList(limit, offset, q)

List item fling effects

    The various effects of the move\&quot;Fling\&quot; when used with different items.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedItemFlingEffectSummaryList**](../Models/PaginatedItemFlingEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemFlingEffectRetrieve"></a>
# **itemFlingEffectRetrieve**
> ItemFlingEffectDetail itemFlingEffectRetrieve(id)

Get item fling effect

    The various effects of the move\&quot;Fling\&quot; when used with different items.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**ItemFlingEffectDetail**](../Models/ItemFlingEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemList"></a>
# **itemList**
> PaginatedItemSummaryList itemList(limit, offset, q)

List items

    An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedItemSummaryList**](../Models/PaginatedItemSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemPocketList"></a>
# **itemPocketList**
> PaginatedItemPocketSummaryList itemPocketList(limit, offset, q)

List item pockets

    Pockets within the players bag used for storing items by category.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedItemPocketSummaryList**](../Models/PaginatedItemPocketSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemPocketRetrieve"></a>
# **itemPocketRetrieve**
> ItemPocketDetail itemPocketRetrieve(id)

Get item pocket

    Pockets within the players bag used for storing items by category.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**ItemPocketDetail**](../Models/ItemPocketDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="itemRetrieve"></a>
# **itemRetrieve**
> ItemDetail itemRetrieve(id)

Get item

    An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**ItemDetail**](../Models/ItemDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

