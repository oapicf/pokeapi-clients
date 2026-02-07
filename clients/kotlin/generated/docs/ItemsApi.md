# ItemsApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
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


<a id="itemAttributeList"></a>
# **itemAttributeList**
> PaginatedItemAttributeSummaryList itemAttributeList(limit, offset, q)

List item attributes

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedItemAttributeSummaryList = apiInstance.itemAttributeList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#itemAttributeList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#itemAttributeList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedItemAttributeSummaryList**](PaginatedItemAttributeSummaryList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemAttributeRetrieve"></a>
# **itemAttributeRetrieve**
> ItemAttributeDetail itemAttributeRetrieve(id)

Get item attribute

Item attributes define particular aspects of items, e.g.\&quot;usable in battle\&quot; or \&quot;consumable\&quot;.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : ItemAttributeDetail = apiInstance.itemAttributeRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#itemAttributeRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#itemAttributeRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**ItemAttributeDetail**](ItemAttributeDetail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemCategoryList"></a>
# **itemCategoryList**
> PaginatedItemCategorySummaryList itemCategoryList(limit, offset, q)

List item categories

Item categories determine where items will be placed in the players bag.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedItemCategorySummaryList = apiInstance.itemCategoryList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#itemCategoryList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#itemCategoryList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedItemCategorySummaryList**](PaginatedItemCategorySummaryList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemCategoryRetrieve"></a>
# **itemCategoryRetrieve**
> ItemCategoryDetail itemCategoryRetrieve(id)

Get item category

Item categories determine where items will be placed in the players bag.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : ItemCategoryDetail = apiInstance.itemCategoryRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#itemCategoryRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#itemCategoryRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**ItemCategoryDetail**](ItemCategoryDetail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemFlingEffectList"></a>
# **itemFlingEffectList**
> PaginatedItemFlingEffectSummaryList itemFlingEffectList(limit, offset, q)

List item fling effects

The various effects of the move\&quot;Fling\&quot; when used with different items.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedItemFlingEffectSummaryList = apiInstance.itemFlingEffectList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#itemFlingEffectList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#itemFlingEffectList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedItemFlingEffectSummaryList**](PaginatedItemFlingEffectSummaryList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemFlingEffectRetrieve"></a>
# **itemFlingEffectRetrieve**
> ItemFlingEffectDetail itemFlingEffectRetrieve(id)

Get item fling effect

The various effects of the move\&quot;Fling\&quot; when used with different items.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : ItemFlingEffectDetail = apiInstance.itemFlingEffectRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#itemFlingEffectRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#itemFlingEffectRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**ItemFlingEffectDetail**](ItemFlingEffectDetail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemList"></a>
# **itemList**
> PaginatedItemSummaryList itemList(limit, offset, q)

List items

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedItemSummaryList = apiInstance.itemList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#itemList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#itemList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedItemSummaryList**](PaginatedItemSummaryList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemPocketList"></a>
# **itemPocketList**
> PaginatedItemPocketSummaryList itemPocketList(limit, offset, q)

List item pockets

Pockets within the players bag used for storing items by category.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val limit : kotlin.Int = 56 // kotlin.Int | Number of results to return per page.
val offset : kotlin.Int = 56 // kotlin.Int | The initial index from which to return the results.
val q : kotlin.String = q_example // kotlin.String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    val result : PaginatedItemPocketSummaryList = apiInstance.itemPocketList(limit, offset, q)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#itemPocketList")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#itemPocketList")
    e.printStackTrace()
}
```

### Parameters
| **limit** | **kotlin.Int**| Number of results to return per page. | [optional] |
| **offset** | **kotlin.Int**| The initial index from which to return the results. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **q** | **kotlin.String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] |

### Return type

[**PaginatedItemPocketSummaryList**](PaginatedItemPocketSummaryList.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemPocketRetrieve"></a>
# **itemPocketRetrieve**
> ItemPocketDetail itemPocketRetrieve(id)

Get item pocket

Pockets within the players bag used for storing items by category.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : ItemPocketDetail = apiInstance.itemPocketRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#itemPocketRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#itemPocketRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**ItemPocketDetail**](ItemPocketDetail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="itemRetrieve"></a>
# **itemRetrieve**
> ItemDetail itemRetrieve(id)

Get item

An item is an object in the games which the player can pick up, keep in their bag, and use in some manner. They have various uses, including healing, powering up, helping catch Pokémon, or to access a new area.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = ItemsApi()
val id : kotlin.String = id_example // kotlin.String | This parameter can be a string or an integer.
try {
    val result : ItemDetail = apiInstance.itemRetrieve(id)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ItemsApi#itemRetrieve")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ItemsApi#itemRetrieve")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **id** | **kotlin.String**| This parameter can be a string or an integer. | |

### Return type

[**ItemDetail**](ItemDetail.md)

### Authorization


Configure basicAuth:
    ApiClient.username = ""
    ApiClient.password = ""
Configure cookieAuth:
    ApiClient.apiKey["sessionid"] = ""
    ApiClient.apiKeyPrefix["sessionid"] = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

