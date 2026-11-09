# ItemsApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**currencyList**](ItemsApi.md#currencyList) | **GET** /api/v2/currency/ | List currencies |
| [**currencyRetrieve**](ItemsApi.md#currencyRetrieve) | **GET** /api/v2/currency/{id}/ | Get currency |
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


## Creating ItemsApi

To initiate an instance of `ItemsApi`, you can use micronaut's `ApplicationContext`:
```java
/* imports
import io.micronaut.runtime.Micronaut;
import io.micronaut.context.ApplicationContext;
import org.openapitools.api.ItemsApi;
*/

ApplicationContext context = Micronaut.run(/* ... */);
PetApi apiInstance = context.getBean(ItemsApi.class);
```

Or the `@Inject` annotation:
```java
@Singleton
class MyClass {
    @Inject
    ItemsApi itemsApi;

    /* ... use the injected variable */
}
```
Note that the class needs to be annotated with one of Micronaut's [scope annotations](https://docs.micronaut.io/latest/guide/#scopes) like `Singleton` in order to be processed.

More information can be found inside [Inversion of Control guide section](https://docs.micronaut.io/latest/guide/#ioc).

<a id="currencyList"></a>
# **currencyList**
```java
Mono<PaginatedCurrencySummaryList> ItemsApi.currencyList(limitoffsetq)
```

List currencies

Currencies used to buy items.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedCurrencySummaryList**](PaginatedCurrencySummaryList.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="currencyRetrieve"></a>
# **currencyRetrieve**
```java
Mono<CurrencyDetail> ItemsApi.currencyRetrieve(id)
```

Get currency

Currencies used to buy items.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**CurrencyDetail**](CurrencyDetail.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemAttributeList"></a>
# **itemAttributeList**
```java
Mono<PaginatedItemAttributeSummaryList> ItemsApi.itemAttributeList(limitoffsetq)
```

List item attributes

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedItemAttributeSummaryList**](PaginatedItemAttributeSummaryList.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemAttributeRetrieve"></a>
# **itemAttributeRetrieve**
```java
Mono<ItemAttributeDetail> ItemsApi.itemAttributeRetrieve(id)
```

Get item attribute

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**ItemAttributeDetail**](ItemAttributeDetail.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemCategoryList"></a>
# **itemCategoryList**
```java
Mono<PaginatedItemCategorySummaryList> ItemsApi.itemCategoryList(limitoffsetq)
```

List item categories

Item categories determine where items will be placed in the players bag.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedItemCategorySummaryList**](PaginatedItemCategorySummaryList.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemCategoryRetrieve"></a>
# **itemCategoryRetrieve**
```java
Mono<ItemCategoryDetail> ItemsApi.itemCategoryRetrieve(id)
```

Get item category

Item categories determine where items will be placed in the players bag.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**ItemCategoryDetail**](ItemCategoryDetail.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemFlingEffectList"></a>
# **itemFlingEffectList**
```java
Mono<PaginatedItemFlingEffectSummaryList> ItemsApi.itemFlingEffectList(limitoffsetq)
```

List item fling effects

The various effects of the move\&quot;Fling\&quot; when used with different items.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedItemFlingEffectSummaryList**](PaginatedItemFlingEffectSummaryList.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemFlingEffectRetrieve"></a>
# **itemFlingEffectRetrieve**
```java
Mono<ItemFlingEffectDetail> ItemsApi.itemFlingEffectRetrieve(id)
```

Get item fling effect

The various effects of the move\&quot;Fling\&quot; when used with different items.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**ItemFlingEffectDetail**](ItemFlingEffectDetail.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemList"></a>
# **itemList**
```java
Mono<PaginatedItemSummaryList> ItemsApi.itemList(limitoffsetq)
```

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedItemSummaryList**](PaginatedItemSummaryList.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemPocketList"></a>
# **itemPocketList**
```java
Mono<PaginatedItemPocketSummaryList> ItemsApi.itemPocketList(limitoffsetq)
```

List item pockets

Pockets within the players bag used for storing items by category.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `Integer`| Number of results to return per page. | [optional parameter] |
| **offset** | `Integer`| The initial index from which to return the results. | [optional parameter] |
| **q** | `String`| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter] |


### Return type
[**PaginatedItemPocketSummaryList**](PaginatedItemPocketSummaryList.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemPocketRetrieve"></a>
# **itemPocketRetrieve**
```java
Mono<ItemPocketDetail> ItemsApi.itemPocketRetrieve(id)
```

Get item pocket

Pockets within the players bag used for storing items by category.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**ItemPocketDetail**](ItemPocketDetail.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

<a id="itemRetrieve"></a>
# **itemRetrieve**
```java
Mono<ItemDetail> ItemsApi.itemRetrieve(id)
```

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Parameters
| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `String`| This parameter can be a string or an integer. | |


### Return type
[**ItemDetail**](ItemDetail.md)



### HTTP request headers
 - **Content-Type**: Not defined
 - **Accept**: `application/json`

