# LocationApi

All URIs are relative to *https://pokeapi.co*

|Method | HTTP request | Description|
|------------- | ------------- | -------------|
|[**locationAreaList**](#locationarealist) | **GET** /api/v2/location-area/ | List location areas|
|[**locationAreaRetrieve**](#locationarearetrieve) | **GET** /api/v2/location-area/{id}/ | Get location area|
|[**locationList**](#locationlist) | **GET** /api/v2/location/ | List locations|
|[**locationRetrieve**](#locationretrieve) | **GET** /api/v2/location/{id}/ | Get location|
|[**palParkAreaList**](#palparkarealist) | **GET** /api/v2/pal-park-area/ | List pal park areas|
|[**palParkAreaRetrieve**](#palparkarearetrieve) | **GET** /api/v2/pal-park-area/{id}/ | Get pal park area|
|[**regionList**](#regionlist) | **GET** /api/v2/region/ | List regions|
|[**regionRetrieve**](#regionretrieve) | **GET** /api/v2/region/{id}/ | Get region|

# **locationAreaList**
> PaginatedLocationAreaSummaryList locationAreaList()

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example

```typescript
import {
    LocationApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LocationApi(configuration);

let limit: number; //Number of results to return per page. (optional) (default to undefined)
let offset: number; //The initial index from which to return the results. (optional) (default to undefined)

const { status, data } = await apiInstance.locationAreaList(
    limit,
    offset
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined|
| **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined|


### Return type

**PaginatedLocationAreaSummaryList**

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

# **locationAreaRetrieve**
> LocationAreaDetail locationAreaRetrieve()

Location areas are sections of areas, such as floors in a building or cave. Each area has its own set of possible Pokémon encounters.

### Example

```typescript
import {
    LocationApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LocationApi(configuration);

let id: number; //A unique integer value identifying this location area. (default to undefined)

const { status, data } = await apiInstance.locationAreaRetrieve(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**number**] | A unique integer value identifying this location area. | defaults to undefined|


### Return type

**LocationAreaDetail**

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

# **locationList**
> PaginatedLocationSummaryList locationList()

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example

```typescript
import {
    LocationApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LocationApi(configuration);

let limit: number; //Number of results to return per page. (optional) (default to undefined)
let offset: number; //The initial index from which to return the results. (optional) (default to undefined)
let q: string; //> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional) (default to undefined)

const { status, data } = await apiInstance.locationList(
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

**PaginatedLocationSummaryList**

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

# **locationRetrieve**
> LocationDetail locationRetrieve()

Locations that can be visited within the games. Locations make up sizable portions of regions, like cities or routes.

### Example

```typescript
import {
    LocationApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LocationApi(configuration);

let id: string; //This parameter can be a string or an integer. (default to undefined)

const { status, data } = await apiInstance.locationRetrieve(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined|


### Return type

**LocationDetail**

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

# **palParkAreaList**
> PaginatedPalParkAreaSummaryList palParkAreaList()

Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.

### Example

```typescript
import {
    LocationApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LocationApi(configuration);

let limit: number; //Number of results to return per page. (optional) (default to undefined)
let offset: number; //The initial index from which to return the results. (optional) (default to undefined)
let q: string; //> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional) (default to undefined)

const { status, data } = await apiInstance.palParkAreaList(
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

**PaginatedPalParkAreaSummaryList**

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

# **palParkAreaRetrieve**
> PalParkAreaDetail palParkAreaRetrieve()

Areas used for grouping Pokémon encounters in Pal Park. They\'re like habitats that are specific to Pal Park.

### Example

```typescript
import {
    LocationApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LocationApi(configuration);

let id: string; //This parameter can be a string or an integer. (default to undefined)

const { status, data } = await apiInstance.palParkAreaRetrieve(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined|


### Return type

**PalParkAreaDetail**

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

# **regionList**
> PaginatedRegionSummaryList regionList()

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example

```typescript
import {
    LocationApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LocationApi(configuration);

let limit: number; //Number of results to return per page. (optional) (default to undefined)
let offset: number; //The initial index from which to return the results. (optional) (default to undefined)
let q: string; //> Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional) (default to undefined)

const { status, data } = await apiInstance.regionList(
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

**PaginatedRegionSummaryList**

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

# **regionRetrieve**
> RegionDetail regionRetrieve()

A region is an organized area of the Pokémon world. Most often, the main difference between regions is the species of Pokémon that can be encountered within them.

### Example

```typescript
import {
    LocationApi,
    Configuration
} from './api';

const configuration = new Configuration();
const apiInstance = new LocationApi(configuration);

let id: string; //This parameter can be a string or an integer. (default to undefined)

const { status, data } = await apiInstance.regionRetrieve(
    id
);
```

### Parameters

|Name | Type | Description  | Notes|
|------------- | ------------- | ------------- | -------------|
| **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined|


### Return type

**RegionDetail**

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

