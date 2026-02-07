# ItemsController

All URIs are relative to `""`

The controller class is defined in **[ItemsController.java](../../src/main/java/org/openapitools/controller/ItemsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemAttributeList**](#itemAttributeList) | **GET** /api/v2/item-attribute/ | List item attributes
[**itemAttributeRetrieve**](#itemAttributeRetrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**itemCategoryList**](#itemCategoryList) | **GET** /api/v2/item-category/ | List item categories
[**itemCategoryRetrieve**](#itemCategoryRetrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
[**itemFlingEffectList**](#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**itemFlingEffectRetrieve**](#itemFlingEffectRetrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**itemList**](#itemList) | **GET** /api/v2/item/ | List items
[**itemPocketList**](#itemPocketList) | **GET** /api/v2/item-pocket/ | List item pockets
[**itemPocketRetrieve**](#itemPocketRetrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**itemRetrieve**](#itemRetrieve) | **GET** /api/v2/item/{id}/ | Get item

<a id="itemAttributeList"></a>
# **itemAttributeList**
```java
Mono<PaginatedItemAttributeSummaryList> ItemsController.itemAttributeList(limitoffsetq)
```

List item attributes

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedItemAttributeSummaryList**](../../docs/models/PaginatedItemAttributeSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="itemAttributeRetrieve"></a>
# **itemAttributeRetrieve**
```java
Mono<ItemAttributeDetail> ItemsController.itemAttributeRetrieve(id)
```

Get item attribute

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**ItemAttributeDetail**](../../docs/models/ItemAttributeDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="itemCategoryList"></a>
# **itemCategoryList**
```java
Mono<PaginatedItemCategorySummaryList> ItemsController.itemCategoryList(limitoffsetq)
```

List item categories

Item categories determine where items will be placed in the players bag.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedItemCategorySummaryList**](../../docs/models/PaginatedItemCategorySummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="itemCategoryRetrieve"></a>
# **itemCategoryRetrieve**
```java
Mono<ItemCategoryDetail> ItemsController.itemCategoryRetrieve(id)
```

Get item category

Item categories determine where items will be placed in the players bag.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**ItemCategoryDetail**](../../docs/models/ItemCategoryDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="itemFlingEffectList"></a>
# **itemFlingEffectList**
```java
Mono<PaginatedItemFlingEffectSummaryList> ItemsController.itemFlingEffectList(limitoffsetq)
```

List item fling effects

The various effects of the move\&quot;Fling\&quot; when used with different items.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedItemFlingEffectSummaryList**](../../docs/models/PaginatedItemFlingEffectSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="itemFlingEffectRetrieve"></a>
# **itemFlingEffectRetrieve**
```java
Mono<ItemFlingEffectDetail> ItemsController.itemFlingEffectRetrieve(id)
```

Get item fling effect

The various effects of the move\&quot;Fling\&quot; when used with different items.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**ItemFlingEffectDetail**](../../docs/models/ItemFlingEffectDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="itemList"></a>
# **itemList**
```java
Mono<PaginatedItemSummaryList> ItemsController.itemList(limitoffsetq)
```

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedItemSummaryList**](../../docs/models/PaginatedItemSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="itemPocketList"></a>
# **itemPocketList**
```java
Mono<PaginatedItemPocketSummaryList> ItemsController.itemPocketList(limitoffsetq)
```

List item pockets

Pockets within the players bag used for storing items by category.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedItemPocketSummaryList**](../../docs/models/PaginatedItemPocketSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="itemPocketRetrieve"></a>
# **itemPocketRetrieve**
```java
Mono<ItemPocketDetail> ItemsController.itemPocketRetrieve(id)
```

Get item pocket

Pockets within the players bag used for storing items by category.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**ItemPocketDetail**](../../docs/models/ItemPocketDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="itemRetrieve"></a>
# **itemRetrieve**
```java
Mono<ItemDetail> ItemsController.itemRetrieve(id)
```

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**ItemDetail**](../../docs/models/ItemDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

