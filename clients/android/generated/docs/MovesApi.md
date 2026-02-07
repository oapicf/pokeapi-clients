# MovesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](MovesApi.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | List move meta ailments
[**moveAilmentRetrieve**](MovesApi.md#moveAilmentRetrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**moveBattleStyleList**](MovesApi.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | List move battle styles
[**moveBattleStyleRetrieve**](MovesApi.md#moveBattleStyleRetrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
[**moveCategoryList**](MovesApi.md#moveCategoryList) | **GET** /api/v2/move-category/ | List move meta categories
[**moveCategoryRetrieve**](MovesApi.md#moveCategoryRetrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
[**moveLearnMethodList**](MovesApi.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | List move learn methods
[**moveLearnMethodRetrieve**](MovesApi.md#moveLearnMethodRetrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
[**moveList**](MovesApi.md#moveList) | **GET** /api/v2/move/ | List moves
[**moveRetrieve**](MovesApi.md#moveRetrieve) | **GET** /api/v2/move/{id}/ | Get move
[**moveTargetList**](MovesApi.md#moveTargetList) | **GET** /api/v2/move-target/ | List move targets
[**moveTargetRetrieve**](MovesApi.md#moveTargetRetrieve) | **GET** /api/v2/move-target/{id}/ | Get move target



## moveAilmentList

> PaginatedMoveMetaAilmentSummaryList moveAilmentList(limit, offset, q)

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedMoveMetaAilmentSummaryList result = apiInstance.moveAilmentList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveAilmentList");
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

[**PaginatedMoveMetaAilmentSummaryList**](PaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveAilmentRetrieve

> MoveMetaAilmentDetail moveAilmentRetrieve(id)

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    MoveMetaAilmentDetail result = apiInstance.moveAilmentRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveAilmentRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveMetaAilmentDetail**](MoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveBattleStyleList

> PaginatedMoveBattleStyleSummaryList moveBattleStyleList(limit, offset, q)

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedMoveBattleStyleSummaryList result = apiInstance.moveBattleStyleList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveBattleStyleList");
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

[**PaginatedMoveBattleStyleSummaryList**](PaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveBattleStyleRetrieve

> MoveBattleStyleDetail moveBattleStyleRetrieve(id)

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    MoveBattleStyleDetail result = apiInstance.moveBattleStyleRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveBattleStyleRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveBattleStyleDetail**](MoveBattleStyleDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveCategoryList

> PaginatedMoveMetaCategorySummaryList moveCategoryList(limit, offset, q)

List move meta categories

Very general categories that loosely group move effects.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedMoveMetaCategorySummaryList result = apiInstance.moveCategoryList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveCategoryList");
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

[**PaginatedMoveMetaCategorySummaryList**](PaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveCategoryRetrieve

> MoveMetaCategoryDetail moveCategoryRetrieve(id)

Get move meta category

Very general categories that loosely group move effects.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    MoveMetaCategoryDetail result = apiInstance.moveCategoryRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveCategoryRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveMetaCategoryDetail**](MoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveLearnMethodList

> PaginatedMoveLearnMethodSummaryList moveLearnMethodList(limit, offset, q)

List move learn methods

Methods by which Pokémon can learn moves.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedMoveLearnMethodSummaryList result = apiInstance.moveLearnMethodList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveLearnMethodList");
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

[**PaginatedMoveLearnMethodSummaryList**](PaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveLearnMethodRetrieve

> MoveLearnMethodDetail moveLearnMethodRetrieve(id)

Get move learn method

Methods by which Pokémon can learn moves.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    MoveLearnMethodDetail result = apiInstance.moveLearnMethodRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveLearnMethodRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveLearnMethodDetail**](MoveLearnMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveList

> PaginatedMoveSummaryList moveList(limit, offset, q)

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedMoveSummaryList result = apiInstance.moveList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveList");
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

[**PaginatedMoveSummaryList**](PaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveRetrieve

> MoveDetail moveRetrieve(id)

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    MoveDetail result = apiInstance.moveRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveDetail**](MoveDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveTargetList

> PaginatedMoveTargetSummaryList moveTargetList(limit, offset, q)

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
Integer limit = null; // Integer | Number of results to return per page.
Integer offset = null; // Integer | The initial index from which to return the results.
String q = null; // String | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property. 
try {
    PaginatedMoveTargetSummaryList result = apiInstance.moveTargetList(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveTargetList");
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

[**PaginatedMoveTargetSummaryList**](PaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## moveTargetRetrieve

> MoveTargetDetail moveTargetRetrieve(id)

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example

```java
// Import classes:
//import org.openapitools.client.api.MovesApi;

MovesApi apiInstance = new MovesApi();
String id = null; // String | This parameter can be a string or an integer.
try {
    MoveTargetDetail result = apiInstance.moveTargetRetrieve(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MovesApi#moveTargetRetrieve");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveTargetDetail**](MoveTargetDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

