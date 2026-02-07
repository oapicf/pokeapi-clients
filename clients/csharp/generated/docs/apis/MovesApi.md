# Org.OpenAPITools.Api.MovesApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|--------|--------------|-------------|
| [**MoveAilmentList**](MovesApi.md#moveailmentlist) | **GET** /api/v2/move-ailment/ | List move meta ailments |
| [**MoveAilmentRetrieve**](MovesApi.md#moveailmentretrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment |
| [**MoveBattleStyleList**](MovesApi.md#movebattlestylelist) | **GET** /api/v2/move-battle-style/ | List move battle styles |
| [**MoveBattleStyleRetrieve**](MovesApi.md#movebattlestyleretrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style |
| [**MoveCategoryList**](MovesApi.md#movecategorylist) | **GET** /api/v2/move-category/ | List move meta categories |
| [**MoveCategoryRetrieve**](MovesApi.md#movecategoryretrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category |
| [**MoveLearnMethodList**](MovesApi.md#movelearnmethodlist) | **GET** /api/v2/move-learn-method/ | List move learn methods |
| [**MoveLearnMethodRetrieve**](MovesApi.md#movelearnmethodretrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method |
| [**MoveList**](MovesApi.md#movelist) | **GET** /api/v2/move/ | List moves |
| [**MoveRetrieve**](MovesApi.md#moveretrieve) | **GET** /api/v2/move/{id}/ | Get move |
| [**MoveTargetList**](MovesApi.md#movetargetlist) | **GET** /api/v2/move-target/ | List move targets |
| [**MoveTargetRetrieve**](MovesApi.md#movetargetretrieve) | **GET** /api/v2/move-target/{id}/ | Get move target |

<a id="moveailmentlist"></a>
# **MoveAilmentList**
> PaginatedMoveMetaAilmentSummaryList MoveAilmentList (int limit = null, int offset = null, string q = null)

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedMoveMetaAilmentSummaryList**](PaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="moveailmentretrieve"></a>
# **MoveAilmentRetrieve**
> MoveMetaAilmentDetail MoveAilmentRetrieve (string id)

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**MoveMetaAilmentDetail**](MoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="movebattlestylelist"></a>
# **MoveBattleStyleList**
> PaginatedMoveBattleStyleSummaryList MoveBattleStyleList (int limit = null, int offset = null, string q = null)

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedMoveBattleStyleSummaryList**](PaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="movebattlestyleretrieve"></a>
# **MoveBattleStyleRetrieve**
> MoveBattleStyleDetail MoveBattleStyleRetrieve (string id)

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**MoveBattleStyleDetail**](MoveBattleStyleDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="movecategorylist"></a>
# **MoveCategoryList**
> PaginatedMoveMetaCategorySummaryList MoveCategoryList (int limit = null, int offset = null, string q = null)

List move meta categories

Very general categories that loosely group move effects.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedMoveMetaCategorySummaryList**](PaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="movecategoryretrieve"></a>
# **MoveCategoryRetrieve**
> MoveMetaCategoryDetail MoveCategoryRetrieve (string id)

Get move meta category

Very general categories that loosely group move effects.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**MoveMetaCategoryDetail**](MoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="movelearnmethodlist"></a>
# **MoveLearnMethodList**
> PaginatedMoveLearnMethodSummaryList MoveLearnMethodList (int limit = null, int offset = null, string q = null)

List move learn methods

Methods by which Pokémon can learn moves.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedMoveLearnMethodSummaryList**](PaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="movelearnmethodretrieve"></a>
# **MoveLearnMethodRetrieve**
> MoveLearnMethodDetail MoveLearnMethodRetrieve (string id)

Get move learn method

Methods by which Pokémon can learn moves.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**MoveLearnMethodDetail**](MoveLearnMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="movelist"></a>
# **MoveList**
> PaginatedMoveSummaryList MoveList (int limit = null, int offset = null, string q = null)

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedMoveSummaryList**](PaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="moveretrieve"></a>
# **MoveRetrieve**
> MoveDetail MoveRetrieve (string id)

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**MoveDetail**](MoveDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="movetargetlist"></a>
# **MoveTargetList**
> PaginatedMoveTargetSummaryList MoveTargetList (int limit = null, int offset = null, string q = null)

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **limit** | **int** | Number of results to return per page. | [optional]  |
| **offset** | **int** | The initial index from which to return the results. | [optional]  |
| **q** | **string** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional]  |

### Return type

[**PaginatedMoveTargetSummaryList**](PaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

<a id="movetargetretrieve"></a>
# **MoveTargetRetrieve**
> MoveTargetDetail MoveTargetRetrieve (string id)

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.


### Parameters

| Name | Type | Description | Notes |
|------|------|-------------|-------|
| **id** | **string** | This parameter can be a string or an integer. |  |

### Return type

[**MoveTargetDetail**](MoveTargetDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

