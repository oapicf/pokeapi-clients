# MovesApi

All URIs are relative to **

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

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example

```bash
 moveAilmentList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedMoveMetaAilmentSummaryList**](PaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveAilmentRetrieve

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example

```bash
 moveAilmentRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveMetaAilmentDetail**](MoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveBattleStyleList

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example

```bash
 moveBattleStyleList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedMoveBattleStyleSummaryList**](PaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveBattleStyleRetrieve

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example

```bash
 moveBattleStyleRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveBattleStyleDetail**](MoveBattleStyleDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveCategoryList

List move meta categories

Very general categories that loosely group move effects.

### Example

```bash
 moveCategoryList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedMoveMetaCategorySummaryList**](PaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveCategoryRetrieve

Get move meta category

Very general categories that loosely group move effects.

### Example

```bash
 moveCategoryRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveMetaCategoryDetail**](MoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveLearnMethodList

List move learn methods

Methods by which Pokémon can learn moves.

### Example

```bash
 moveLearnMethodList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedMoveLearnMethodSummaryList**](PaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveLearnMethodRetrieve

Get move learn method

Methods by which Pokémon can learn moves.

### Example

```bash
 moveLearnMethodRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveLearnMethodDetail**](MoveLearnMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveList

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example

```bash
 moveList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedMoveSummaryList**](PaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveRetrieve

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example

```bash
 moveRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveDetail**](MoveDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveTargetList

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example

```bash
 moveTargetList  limit=value  offset=value  q=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **integer** | Number of results to return per page. | [optional] [default to null]
 **offset** | **integer** | The initial index from which to return the results. | [optional] [default to null]
 **q** | **string** | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2)
Case-insensitive query applied on the 'name' property. | [optional] [default to null]

### Return type

[**PaginatedMoveTargetSummaryList**](PaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## moveTargetRetrieve

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example

```bash
 moveTargetRetrieve id=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string** | This parameter can be a string or an integer. | [default to null]

### Return type

[**MoveTargetDetail**](MoveTargetDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

