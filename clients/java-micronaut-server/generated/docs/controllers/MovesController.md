# MovesController

All URIs are relative to `""`

The controller class is defined in **[MovesController.java](../../src/main/java/org/openapitools/controller/MovesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**moveAilmentList**](#moveAilmentList) | **GET** /api/v2/move-ailment/ | List move meta ailments
[**moveAilmentRetrieve**](#moveAilmentRetrieve) | **GET** /api/v2/move-ailment/{id}/ | Get move meta ailment
[**moveBattleStyleList**](#moveBattleStyleList) | **GET** /api/v2/move-battle-style/ | List move battle styles
[**moveBattleStyleRetrieve**](#moveBattleStyleRetrieve) | **GET** /api/v2/move-battle-style/{id}/ | Get move battle style
[**moveCategoryList**](#moveCategoryList) | **GET** /api/v2/move-category/ | List move meta categories
[**moveCategoryRetrieve**](#moveCategoryRetrieve) | **GET** /api/v2/move-category/{id}/ | Get move meta category
[**moveLearnMethodList**](#moveLearnMethodList) | **GET** /api/v2/move-learn-method/ | List move learn methods
[**moveLearnMethodRetrieve**](#moveLearnMethodRetrieve) | **GET** /api/v2/move-learn-method/{id}/ | Get move learn method
[**moveList**](#moveList) | **GET** /api/v2/move/ | List moves
[**moveRetrieve**](#moveRetrieve) | **GET** /api/v2/move/{id}/ | Get move
[**moveTargetList**](#moveTargetList) | **GET** /api/v2/move-target/ | List move targets
[**moveTargetRetrieve**](#moveTargetRetrieve) | **GET** /api/v2/move-target/{id}/ | Get move target

<a id="moveAilmentList"></a>
# **moveAilmentList**
```java
Mono<PaginatedMoveMetaAilmentSummaryList> MovesController.moveAilmentList(limitoffsetq)
```

List move meta ailments

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedMoveMetaAilmentSummaryList**](../../docs/models/PaginatedMoveMetaAilmentSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveAilmentRetrieve"></a>
# **moveAilmentRetrieve**
```java
Mono<MoveMetaAilmentDetail> MovesController.moveAilmentRetrieve(id)
```

Get move meta ailment

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**MoveMetaAilmentDetail**](../../docs/models/MoveMetaAilmentDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveBattleStyleList"></a>
# **moveBattleStyleList**
```java
Mono<PaginatedMoveBattleStyleSummaryList> MovesController.moveBattleStyleList(limitoffsetq)
```

List move battle styles

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedMoveBattleStyleSummaryList**](../../docs/models/PaginatedMoveBattleStyleSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveBattleStyleRetrieve"></a>
# **moveBattleStyleRetrieve**
```java
Mono<MoveBattleStyleDetail> MovesController.moveBattleStyleRetrieve(id)
```

Get move battle style

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**MoveBattleStyleDetail**](../../docs/models/MoveBattleStyleDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveCategoryList"></a>
# **moveCategoryList**
```java
Mono<PaginatedMoveMetaCategorySummaryList> MovesController.moveCategoryList(limitoffsetq)
```

List move meta categories

Very general categories that loosely group move effects.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedMoveMetaCategorySummaryList**](../../docs/models/PaginatedMoveMetaCategorySummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveCategoryRetrieve"></a>
# **moveCategoryRetrieve**
```java
Mono<MoveMetaCategoryDetail> MovesController.moveCategoryRetrieve(id)
```

Get move meta category

Very general categories that loosely group move effects.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**MoveMetaCategoryDetail**](../../docs/models/MoveMetaCategoryDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveLearnMethodList"></a>
# **moveLearnMethodList**
```java
Mono<PaginatedMoveLearnMethodSummaryList> MovesController.moveLearnMethodList(limitoffsetq)
```

List move learn methods

Methods by which Pokémon can learn moves.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedMoveLearnMethodSummaryList**](../../docs/models/PaginatedMoveLearnMethodSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveLearnMethodRetrieve"></a>
# **moveLearnMethodRetrieve**
```java
Mono<MoveLearnMethodDetail> MovesController.moveLearnMethodRetrieve(id)
```

Get move learn method

Methods by which Pokémon can learn moves.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**MoveLearnMethodDetail**](../../docs/models/MoveLearnMethodDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveList"></a>
# **moveList**
```java
Mono<PaginatedMoveSummaryList> MovesController.moveList(limitoffsetq)
```

List moves

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedMoveSummaryList**](../../docs/models/PaginatedMoveSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveRetrieve"></a>
# **moveRetrieve**
```java
Mono<MoveDetail> MovesController.moveRetrieve(id)
```

Get move

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**MoveDetail**](../../docs/models/MoveDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveTargetList"></a>
# **moveTargetList**
```java
Mono<PaginatedMoveTargetSummaryList> MovesController.moveTargetList(limitoffsetq)
```

List move targets

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**limit** | `Integer` | Number of results to return per page. | [optional parameter]
**offset** | `Integer` | The initial index from which to return the results. | [optional parameter]
**q** | `String` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [optional parameter]

### Return type
[**PaginatedMoveTargetSummaryList**](../../docs/models/PaginatedMoveTargetSummaryList.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="moveTargetRetrieve"></a>
# **moveTargetRetrieve**
```java
Mono<MoveTargetDetail> MovesController.moveTargetRetrieve(id)
```

Get move target

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**id** | `String` | This parameter can be a string or an integer. |

### Return type
[**MoveTargetDetail**](../../docs/models/MoveTargetDetail.md)

### Authorization
* **basicAuth**
* **cookieAuth**

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

