# ItemsApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**itemAttributeList**](ItemsApi.md#itemAttributeList) | **GET** /api/v2/item-attribute/ | List item attributes
[**itemAttributeRetrieve**](ItemsApi.md#itemAttributeRetrieve) | **GET** /api/v2/item-attribute/{id}/ | Get item attribute
[**itemCategoryList**](ItemsApi.md#itemCategoryList) | **GET** /api/v2/item-category/ | List item categories
[**itemCategoryRetrieve**](ItemsApi.md#itemCategoryRetrieve) | **GET** /api/v2/item-category/{id}/ | Get item category
[**itemFlingEffectList**](ItemsApi.md#itemFlingEffectList) | **GET** /api/v2/item-fling-effect/ | List item fling effects
[**itemFlingEffectRetrieve**](ItemsApi.md#itemFlingEffectRetrieve) | **GET** /api/v2/item-fling-effect/{id}/ | Get item fling effect
[**itemList**](ItemsApi.md#itemList) | **GET** /api/v2/item/ | List items
[**itemPocketList**](ItemsApi.md#itemPocketList) | **GET** /api/v2/item-pocket/ | List item pockets
[**itemPocketRetrieve**](ItemsApi.md#itemPocketRetrieve) | **GET** /api/v2/item-pocket/{id}/ | Get item pocket
[**itemRetrieve**](ItemsApi.md#itemRetrieve) | **GET** /api/v2/item/{id}/ | Get item



## itemAttributeList

> PaginatedItemAttributeSummaryList itemAttributeList(limit, offset, q)

List item attributes

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemsApi;

ItemsApi apiInstance = new ItemsApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedItemAttributeSummaryList result = apiInstance.itemAttributeList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemAttributeList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedItemAttributeSummaryList**](PaginatedItemAttributeSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemAttributeRetrieve

> ItemAttributeDetail itemAttributeRetrieve(id)

Get item attribute

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemsApi;

ItemsApi apiInstance = new ItemsApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    ItemAttributeDetail result = apiInstance.itemAttributeRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemAttributeRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**ItemAttributeDetail**](ItemAttributeDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemCategoryList

> PaginatedItemCategorySummaryList itemCategoryList(limit, offset, q)

List item categories

Item categories determine where items will be placed in the players bag.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemsApi;

ItemsApi apiInstance = new ItemsApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedItemCategorySummaryList result = apiInstance.itemCategoryList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemCategoryList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedItemCategorySummaryList**](PaginatedItemCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemCategoryRetrieve

> ItemCategoryDetail itemCategoryRetrieve(id)

Get item category

Item categories determine where items will be placed in the players bag.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemsApi;

ItemsApi apiInstance = new ItemsApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    ItemCategoryDetail result = apiInstance.itemCategoryRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemCategoryRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**ItemCategoryDetail**](ItemCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemFlingEffectList

> PaginatedItemFlingEffectSummaryList itemFlingEffectList(limit, offset, q)

List item fling effects

The various effects of the move\&quot;Fling\&quot; when used with different items.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemsApi;

ItemsApi apiInstance = new ItemsApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedItemFlingEffectSummaryList result = apiInstance.itemFlingEffectList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemFlingEffectList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedItemFlingEffectSummaryList**](PaginatedItemFlingEffectSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemFlingEffectRetrieve

> ItemFlingEffectDetail itemFlingEffectRetrieve(id)

Get item fling effect

The various effects of the move\&quot;Fling\&quot; when used with different items.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemsApi;

ItemsApi apiInstance = new ItemsApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    ItemFlingEffectDetail result = apiInstance.itemFlingEffectRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemFlingEffectRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**ItemFlingEffectDetail**](ItemFlingEffectDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemList

> PaginatedItemSummaryList itemList(limit, offset, q)

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemsApi;

ItemsApi apiInstance = new ItemsApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedItemSummaryList result = apiInstance.itemList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedItemSummaryList**](PaginatedItemSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemPocketList

> PaginatedItemPocketSummaryList itemPocketList(limit, offset, q)

List item pockets

Pockets within the players bag used for storing items by category.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemsApi;

ItemsApi apiInstance = new ItemsApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedItemPocketSummaryList result = apiInstance.itemPocketList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemPocketList");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| Number of results to return per page. | [optional] [default to null]
 **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null]
 **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null]

### Return type

[**PaginatedItemPocketSummaryList**](PaginatedItemPocketSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemPocketRetrieve

> ItemPocketDetail itemPocketRetrieve(id)

Get item pocket

Pockets within the players bag used for storing items by category.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemsApi;

ItemsApi apiInstance = new ItemsApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    ItemPocketDetail result = apiInstance.itemPocketRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemPocketRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**ItemPocketDetail**](ItemPocketDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## itemRetrieve

> ItemDetail itemRetrieve(id)

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example

```java
// Import classes:
//import org.openapitools.client.api.ItemsApi;

ItemsApi apiInstance = new ItemsApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    ItemDetail result = apiInstance.itemRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ItemsApi#itemRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**ItemDetail**](ItemDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

