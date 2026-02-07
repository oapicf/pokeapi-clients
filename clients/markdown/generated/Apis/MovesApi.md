# MovesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**moveAilmentList**](MovesApi.md#moveAilmentList) | **GET** /api/v2/move-ailment/ | List move meta ailments |
| [**moveAilmentRetrieve**](MovesApi.md#moveAilmentRetrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment |
| [**moveBattleStyleList**](MovesApi.md#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | List move battle styles |
| [**moveBattleStyleRetrieve**](MovesApi.md#moveBattleStyleRetrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style |
| [**moveCategoryList**](MovesApi.md#moveCategoryList) | **GET** /api/v2/move-category/ | List move meta categories |
| [**moveCategoryRetrieve**](MovesApi.md#moveCategoryRetrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category |
| [**moveLearnMethodList**](MovesApi.md#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | List move learn methods |
| [**moveLearnMethodRetrieve**](MovesApi.md#moveLearnMethodRetrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method |
| [**moveList**](MovesApi.md#moveList) | **GET** /api/v2/move/ | List moves |
| [**moveRetrieve**](MovesApi.md#moveRetrieve) | **GET** /api/v2/move/{id}/ | Get move |
| [**moveTargetList**](MovesApi.md#moveTargetList) | **GET** /api/v2/move-target/ | List move targets |
| [**moveTargetRetrieve**](MovesApi.md#moveTargetRetrieve) | **GET** /api/v2/move-target/{id}/ | Get move target |


<a name="moveAilmentList"></a>
# **moveAilmentList**
> PaginatedMoveMetaAilmentSummaryList moveAilmentList(limit, offset, q)

List move meta ailments

    Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedMoveMetaAilmentSummaryList**](../Models/PaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveAilmentRetrieve"></a>
# **moveAilmentRetrieve**
> MoveMetaAilmentDetail moveAilmentRetrieve(id)

Get move meta ailment

    Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**MoveMetaAilmentDetail**](../Models/MoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveBattleStyleList"></a>
# **moveBattleStyleList**
> PaginatedMoveBattleStyleSummaryList moveBattleStyleList(limit, offset, q)

List move battle styles

    Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedMoveBattleStyleSummaryList**](../Models/PaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveBattleStyleRetrieve"></a>
# **moveBattleStyleRetrieve**
> MoveBattleStyleDetail moveBattleStyleRetrieve(id)

Get move battle style

    Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**MoveBattleStyleDetail**](../Models/MoveBattleStyleDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveCategoryList"></a>
# **moveCategoryList**
> PaginatedMoveMetaCategorySummaryList moveCategoryList(limit, offset, q)

List move meta categories

    Very general categories that loosely group move effects.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedMoveMetaCategorySummaryList**](../Models/PaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveCategoryRetrieve"></a>
# **moveCategoryRetrieve**
> MoveMetaCategoryDetail moveCategoryRetrieve(id)

Get move meta category

    Very general categories that loosely group move effects.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**MoveMetaCategoryDetail**](../Models/MoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveLearnMethodList"></a>
# **moveLearnMethodList**
> PaginatedMoveLearnMethodSummaryList moveLearnMethodList(limit, offset, q)

List move learn methods

    Methods by which Pokémon can learn moves.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedMoveLearnMethodSummaryList**](../Models/PaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveLearnMethodRetrieve"></a>
# **moveLearnMethodRetrieve**
> MoveLearnMethodDetail moveLearnMethodRetrieve(id)

Get move learn method

    Methods by which Pokémon can learn moves.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**MoveLearnMethodDetail**](../Models/MoveLearnMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveList"></a>
# **moveList**
> PaginatedMoveSummaryList moveList(limit, offset, q)

List moves

    Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedMoveSummaryList**](../Models/PaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveRetrieve"></a>
# **moveRetrieve**
> MoveDetail moveRetrieve(id)

Get move

    Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**MoveDetail**](../Models/MoveDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveTargetList"></a>
# **moveTargetList**
> PaginatedMoveTargetSummaryList moveTargetList(limit, offset, q)

List move targets

    Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**| Number of results to return per page. | [optional] [default to null] |
| **offset** | **Integer**| The initial index from which to return the results. | [optional] [default to null] |
| **q** | **String**| &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional] [default to null] |

### Return type

[**PaginatedMoveTargetSummaryList**](../Models/PaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

<a name="moveTargetRetrieve"></a>
# **moveTargetRetrieve**
> MoveTargetDetail moveTargetRetrieve(id)

Get move target

    Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | **String**| This parameter can be a string or an integer. | [default to null] |

### Return type

[**MoveTargetDetail**](../Models/MoveTargetDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

