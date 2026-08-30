# MovesApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**move_ailment_list**](MovesApi.md#move_ailment_list) | **GET** /api/v2/move-ailment/ | List move meta ailments
[**move_ailment_retrieve**](MovesApi.md#move_ailment_retrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**move_battle_style_list**](MovesApi.md#move_battle_style_list) | **GET** /api/v2/move-battle-style/ | List move battle styles
[**move_battle_style_retrieve**](MovesApi.md#move_battle_style_retrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
[**move_category_list**](MovesApi.md#move_category_list) | **GET** /api/v2/move-category/ | List move meta categories
[**move_category_retrieve**](MovesApi.md#move_category_retrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
[**move_learn_method_list**](MovesApi.md#move_learn_method_list) | **GET** /api/v2/move-learn-method/ | List move learn methods
[**move_learn_method_retrieve**](MovesApi.md#move_learn_method_retrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
[**move_list**](MovesApi.md#move_list) | **GET** /api/v2/move/ | List moves
[**move_retrieve**](MovesApi.md#move_retrieve) | **GET** /api/v2/move/{id}/ | Get move
[**move_target_list**](MovesApi.md#move_target_list) | **GET** /api/v2/move-target/ | List move targets
[**move_target_retrieve**](MovesApi.md#move_target_retrieve) | **GET** /api/v2/move-target/{id}/ | Get move target


# **move_ailment_list**
> `move_ailment_list`(_api::`MovesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedMoveMetaAilmentSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_ailment_list`(_api::`MovesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedMoveMetaAilmentSummaryList` }, `OpenAPI.Clients.ApiResponse`

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedMoveMetaAilmentSummaryList`**](PaginatedMoveMetaAilmentSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_ailment_retrieve**
> `move_ailment_retrieve`(_api::`MovesApi`, `id`::`String`; _mediaType=nothing) -> `MoveMetaAilmentDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_ailment_retrieve`(_api::`MovesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `MoveMetaAilmentDetail` }, `OpenAPI.Clients.ApiResponse`

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`MoveMetaAilmentDetail`**](MoveMetaAilmentDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_battle_style_list**
> `move_battle_style_list`(_api::`MovesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedMoveBattleStyleSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_battle_style_list`(_api::`MovesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedMoveBattleStyleSummaryList` }, `OpenAPI.Clients.ApiResponse`

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedMoveBattleStyleSummaryList`**](PaginatedMoveBattleStyleSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_battle_style_retrieve**
> `move_battle_style_retrieve`(_api::`MovesApi`, `id`::`String`; _mediaType=nothing) -> `MoveBattleStyleDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_battle_style_retrieve`(_api::`MovesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `MoveBattleStyleDetail` }, `OpenAPI.Clients.ApiResponse`

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`MoveBattleStyleDetail`**](MoveBattleStyleDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_category_list**
> `move_category_list`(_api::`MovesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedMoveMetaCategorySummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_category_list`(_api::`MovesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedMoveMetaCategorySummaryList` }, `OpenAPI.Clients.ApiResponse`

List move meta categories

Very general categories that loosely group move effects.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedMoveMetaCategorySummaryList`**](PaginatedMoveMetaCategorySummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_category_retrieve**
> `move_category_retrieve`(_api::`MovesApi`, `id`::`String`; _mediaType=nothing) -> `MoveMetaCategoryDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_category_retrieve`(_api::`MovesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `MoveMetaCategoryDetail` }, `OpenAPI.Clients.ApiResponse`

Get move meta category

Very general categories that loosely group move effects.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`MoveMetaCategoryDetail`**](MoveMetaCategoryDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_learn_method_list**
> `move_learn_method_list`(_api::`MovesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedMoveLearnMethodSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_learn_method_list`(_api::`MovesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedMoveLearnMethodSummaryList` }, `OpenAPI.Clients.ApiResponse`

List move learn methods

Methods by which Pokémon can learn moves.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedMoveLearnMethodSummaryList`**](PaginatedMoveLearnMethodSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_learn_method_retrieve**
> `move_learn_method_retrieve`(_api::`MovesApi`, `id`::`String`; _mediaType=nothing) -> `MoveLearnMethodDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_learn_method_retrieve`(_api::`MovesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `MoveLearnMethodDetail` }, `OpenAPI.Clients.ApiResponse`

Get move learn method

Methods by which Pokémon can learn moves.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`MoveLearnMethodDetail`**](MoveLearnMethodDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_list**
> `move_list`(_api::`MovesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedMoveSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_list`(_api::`MovesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedMoveSummaryList` }, `OpenAPI.Clients.ApiResponse`

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedMoveSummaryList`**](PaginatedMoveSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_retrieve**
> `move_retrieve`(_api::`MovesApi`, `id`::`String`; _mediaType=nothing) -> `MoveDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_retrieve`(_api::`MovesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `MoveDetail` }, `OpenAPI.Clients.ApiResponse`

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`MoveDetail`**](MoveDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_target_list**
> `move_target_list`(_api::`MovesApi`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `PaginatedMoveTargetSummaryList`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_target_list`(_api::`MovesApi`, response_stream::`Channel`; `limit`=nothing, `offset`=nothing, `q`=nothing, _mediaType=nothing) -> `Channel`{ `PaginatedMoveTargetSummaryList` }, `OpenAPI.Clients.ApiResponse`

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **`limit`** | **`Int64`** | Number of results to return per page. | [default to nothing]
 **`offset`** | **`Int64`** | The initial index from which to return the results. | [default to nothing]
 **`q`** | **`String`** | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [default to nothing]

### Return type

[**`PaginatedMoveTargetSummaryList`**](PaginatedMoveTargetSummaryList.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **move_target_retrieve**
> `move_target_retrieve`(_api::`MovesApi`, `id`::`String`; _mediaType=nothing) -> `MoveTargetDetail`, `OpenAPI.Clients.ApiResponse` <br/>
> `move_target_retrieve`(_api::`MovesApi`, response_stream::`Channel`, `id`::`String`; _mediaType=nothing) -> `Channel`{ `MoveTargetDetail` }, `OpenAPI.Clients.ApiResponse`

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **`MovesApi`** | API context | 
**`id`** | **`String`** | This parameter can be a string or an integer. |

### Return type

[**`MoveTargetDetail`**](MoveTargetDetail.md)

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

