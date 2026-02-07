# .MovesApi

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


# **moveAilmentList**
> PaginatedMoveMetaAilmentSummaryList moveAilmentList()

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveAilmentListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveAilmentListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.moveAilmentList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedMoveMetaAilmentSummaryList**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveAilmentRetrieve**
> MoveMetaAilmentDetail moveAilmentRetrieve()

Move Ailments are status conditions caused by moves used during battle. See [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Status_condition) for greater detail.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveAilmentRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveAilmentRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.moveAilmentRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**MoveMetaAilmentDetail**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveBattleStyleList**
> PaginatedMoveBattleStyleSummaryList moveBattleStyleList()

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveBattleStyleListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveBattleStyleListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.moveBattleStyleList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedMoveBattleStyleSummaryList**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveBattleStyleRetrieve**
> MoveBattleStyleDetail moveBattleStyleRetrieve()

Styles of moves when used in the Battle Palace. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Battle_Frontier_(Generation_III)) for greater detail.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveBattleStyleRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveBattleStyleRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.moveBattleStyleRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**MoveBattleStyleDetail**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveCategoryList**
> PaginatedMoveMetaCategorySummaryList moveCategoryList()

Very general categories that loosely group move effects.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveCategoryListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveCategoryListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.moveCategoryList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedMoveMetaCategorySummaryList**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveCategoryRetrieve**
> MoveMetaCategoryDetail moveCategoryRetrieve()

Very general categories that loosely group move effects.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveCategoryRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveCategoryRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.moveCategoryRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**MoveMetaCategoryDetail**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveLearnMethodList**
> PaginatedMoveLearnMethodSummaryList moveLearnMethodList()

Methods by which Pokémon can learn moves.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveLearnMethodListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveLearnMethodListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.moveLearnMethodList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedMoveLearnMethodSummaryList**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveLearnMethodRetrieve**
> MoveLearnMethodDetail moveLearnMethodRetrieve()

Methods by which Pokémon can learn moves.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveLearnMethodRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveLearnMethodRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.moveLearnMethodRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**MoveLearnMethodDetail**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveList**
> PaginatedMoveSummaryList moveList()

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.moveList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedMoveSummaryList**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveRetrieve**
> MoveDetail moveRetrieve()

Moves are the skills of Pokémon in battle. In battle, a Pokémon uses one move each turn. Some moves (including those learned by Hidden Machine) can be used outside of battle as well, usually for the purpose of removing obstacles or exploring new areas.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.moveRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**MoveDetail**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveTargetList**
> PaginatedMoveTargetSummaryList moveTargetList()

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveTargetListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveTargetListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.moveTargetList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedMoveTargetSummaryList**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)

# **moveTargetRetrieve**
> MoveTargetDetail moveTargetRetrieve()

Targets moves can be directed at during battle. Targets can be Pokémon, environments or even other moves.

### Example


```typescript
import { createConfiguration, MovesApi } from '';
import type { MovesApiMoveTargetRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new MovesApi(configuration);

const request: MovesApiMoveTargetRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.moveTargetRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**MoveTargetDetail**

### Authorization

[basicAuth](README.md#basicAuth), [cookieAuth](README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](README.md#documentation-for-api-endpoints) [[Back to Model list]](README.md#documentation-for-models) [[Back to README]](README.md)


