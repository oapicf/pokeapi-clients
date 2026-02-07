# ContestsApi

All URIs are relative to *https://pokeapi.co*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**contestEffectList**](#contesteffectlist) | **GET** /api/v2/contest-effect/ | List contest effects|
|[**contestEffectRetrieve**](#contesteffectretrieve) | **GET** /api/v2/contest-effect/{id}/ | Get contest effect|
|[**contestTypeList**](#contesttypelist) | **GET** /api/v2/contest-type/ | List contest types|
|[**contestTypeRetrieve**](#contesttyperetrieve) | **GET** /api/v2/contest-type/{id}/ | Get contest type|
|[**superContestEffectList**](#supercontesteffectlist) | **GET** /api/v2/super-contest-effect/ | List super contest effects|
|[**superContestEffectRetrieve**](#supercontesteffectretrieve) | **GET** /api/v2/super-contest-effect/{id}/ | Get super contest effect|

# **contestEffectList**
> PaginatedContestEffectSummaryList contestEffectList()

Contest effects refer to the effects of moves when used in contests.

### Example

```typescript
import {
    ContestsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ContestsApi(configuration);

let limit: number; //Number of results to return per page. (optional) (default to undefined)
let offset: number; //The initial index from which to return the results. (optional) (default to undefined)
let q: string; //> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional) (default to undefined)

const { status, data } = await apiInstance.contestEffectList(
    limit,
    offset,
    q
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined|
| **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined|
| **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined|


### Return type

**PaginatedContestEffectSummaryList**

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contestEffectRetrieve**
> ContestEffectDetail contestEffectRetrieve()

Contest effects refer to the effects of moves when used in contests.

### Example

```typescript
import {
    ContestsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ContestsApi(configuration);

let id: string; //This parameter can be a string or an integer. (default to undefined)

const { status, data } = await apiInstance.contestEffectRetrieve(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined|


### Return type

**ContestEffectDetail**

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contestTypeList**
> PaginatedContestTypeSummaryList contestTypeList()

Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example

```typescript
import {
    ContestsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ContestsApi(configuration);

let limit: number; //Number of results to return per page. (optional) (default to undefined)
let offset: number; //The initial index from which to return the results. (optional) (default to undefined)
let q: string; //> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional) (default to undefined)

const { status, data } = await apiInstance.contestTypeList(
    limit,
    offset,
    q
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined|
| **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined|
| **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined|


### Return type

**PaginatedContestTypeSummaryList**

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **contestTypeRetrieve**
> ContestTypeDetail contestTypeRetrieve()

Contest types are categories judges used to weigh a Pokémon\'s condition in Pokémon contests. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Contest_condition) for greater detail.

### Example

```typescript
import {
    ContestsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ContestsApi(configuration);

let id: string; //This parameter can be a string or an integer. (default to undefined)

const { status, data } = await apiInstance.contestTypeRetrieve(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined|


### Return type

**ContestTypeDetail**

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **superContestEffectList**
> PaginatedSuperContestEffectSummaryList superContestEffectList()

Super contest effects refer to the effects of moves when used in super contests.

### Example

```typescript
import {
    ContestsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ContestsApi(configuration);

let limit: number; //Number of results to return per page. (optional) (default to undefined)
let offset: number; //The initial index from which to return the results. (optional) (default to undefined)
let q: string; //> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional) (default to undefined)

const { status, data } = await apiInstance.superContestEffectList(
    limit,
    offset,
    q
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined|
| **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined|
| **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined|


### Return type

**PaginatedSuperContestEffectSummaryList**

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **superContestEffectRetrieve**
> SuperContestEffectDetail superContestEffectRetrieve()

Super contest effects refer to the effects of moves when used in super contests.

### Example

```typescript
import {
    ContestsApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new ContestsApi(configuration);

let id: string; //This parameter can be a string or an integer. (default to undefined)

const { status, data } = await apiInstance.superContestEffectRetrieve(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined|


### Return type

**SuperContestEffectDetail**

### Authorization

[basicAuth](../README.md#basicAuth), [cookieAuth](../README.md#cookieAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
|**200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

