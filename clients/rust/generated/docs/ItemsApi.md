# \ItemsApi

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



## item_attribute_list

> models::PaginatedItemAttributeSummaryList item_attribute_list(limit, offset, q)
List item attributes

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedItemAttributeSummaryList**](PaginatedItemAttributeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## item_attribute_retrieve

> models::ItemAttributeDetail item_attribute_retrieve(id)
Get item attribute

Item attributes define particular aspects of items, e.g.\"usable in battle\" or \"consumable\".

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::ItemAttributeDetail**](ItemAttributeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## item_category_list

> models::PaginatedItemCategorySummaryList item_category_list(limit, offset, q)
List item categories

Item categories determine where items will be placed in the players bag.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedItemCategorySummaryList**](PaginatedItemCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## item_category_retrieve

> models::ItemCategoryDetail item_category_retrieve(id)
Get item category

Item categories determine where items will be placed in the players bag.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::ItemCategoryDetail**](ItemCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## item_fling_effect_list

> models::PaginatedItemFlingEffectSummaryList item_fling_effect_list(limit, offset, q)
List item fling effects

The various effects of the move\"Fling\" when used with different items.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedItemFlingEffectSummaryList**](PaginatedItemFlingEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## item_fling_effect_retrieve

> models::ItemFlingEffectDetail item_fling_effect_retrieve(id)
Get item fling effect

The various effects of the move\"Fling\" when used with different items.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::ItemFlingEffectDetail**](ItemFlingEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## item_list

> models::PaginatedItemSummaryList item_list(limit, offset, q)
List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedItemSummaryList**](PaginatedItemSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## item_pocket_list

> models::PaginatedItemPocketSummaryList item_pocket_list(limit, offset, q)
List item pockets

Pockets within the players bag used for storing items by category.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**limit** | Option<**i32**> | Number of results to return per page. |  |
**offset** | Option<**i32**> | The initial index from which to return the results. |  |
**q** | Option<**String**> | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  |  |

### Return type

[**models::PaginatedItemPocketSummaryList**](PaginatedItemPocketSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## item_pocket_retrieve

> models::ItemPocketDetail item_pocket_retrieve(id)
Get item pocket

Pockets within the players bag used for storing items by category.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::ItemPocketDetail**](ItemPocketDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## item_retrieve

> models::ItemDetail item_retrieve(id)
Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**id** | **String** | This parameter can be a string or an integer. | [required] |

### Return type

[**models::ItemDetail**](ItemDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

