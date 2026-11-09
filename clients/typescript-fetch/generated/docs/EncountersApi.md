# EncountersApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**encounterConditionList**](EncountersApi.md#encounterconditionlist) | **GET** /api/v2/encounter-condition/ | List encounter conditions |
| [**encounterConditionRetrieve**](EncountersApi.md#encounterconditionretrieve) | **GET** /api/v2/encounter-condition/{id}/ | Get encounter condition |
| [**encounterConditionValueList**](EncountersApi.md#encounterconditionvaluelist) | **GET** /api/v2/encounter-condition-value/ | List encounter condition values |
| [**encounterConditionValueRetrieve**](EncountersApi.md#encounterconditionvalueretrieve) | **GET** /api/v2/encounter-condition-value/{id}/ | Get encounter condition value |
| [**encounterMethodList**](EncountersApi.md#encountermethodlist) | **GET** /api/v2/encounter-method/ | List encounter methods |
| [**encounterMethodRetrieve**](EncountersApi.md#encountermethodretrieve) | **GET** /api/v2/encounter-method/{id}/ | Get encounter method |



## encounterConditionList

> PaginatedEncounterConditionSummaryList encounterConditionList(limit, offset, q)

List encounter conditions

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Example

```ts
import {
  Configuration,
  EncountersApi,
} from '';
import type { EncounterConditionListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncountersApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies EncounterConditionListRequest;

  try {
    const data = await api.encounterConditionList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | Number of results to return per page. | [Optional] [Defaults to `undefined`] |
| **offset** | `number` | The initial index from which to return the results. | [Optional] [Defaults to `undefined`] |
| **q** | `string` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [Optional] [Defaults to `undefined`] |

### Return type

[**PaginatedEncounterConditionSummaryList**](PaginatedEncounterConditionSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## encounterConditionRetrieve

> EncounterConditionDetail encounterConditionRetrieve(id)

Get encounter condition

Conditions which affect what pokemon might appear in the wild, e.g., day or night.

### Example

```ts
import {
  Configuration,
  EncountersApi,
} from '';
import type { EncounterConditionRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncountersApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies EncounterConditionRetrieveRequest;

  try {
    const data = await api.encounterConditionRetrieve(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `string` | This parameter can be a string or an integer. | [Defaults to `undefined`] |

### Return type

[**EncounterConditionDetail**](EncounterConditionDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## encounterConditionValueList

> PaginatedEncounterConditionValueSummaryList encounterConditionValueList(limit, offset, q)

List encounter condition values

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Example

```ts
import {
  Configuration,
  EncountersApi,
} from '';
import type { EncounterConditionValueListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncountersApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies EncounterConditionValueListRequest;

  try {
    const data = await api.encounterConditionValueList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | Number of results to return per page. | [Optional] [Defaults to `undefined`] |
| **offset** | `number` | The initial index from which to return the results. | [Optional] [Defaults to `undefined`] |
| **q** | `string` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [Optional] [Defaults to `undefined`] |

### Return type

[**PaginatedEncounterConditionValueSummaryList**](PaginatedEncounterConditionValueSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## encounterConditionValueRetrieve

> EncounterConditionValueDetail encounterConditionValueRetrieve(id)

Get encounter condition value

Encounter condition values are the various states that an encounter condition can have, i.e., time of day can be either day or night.

### Example

```ts
import {
  Configuration,
  EncountersApi,
} from '';
import type { EncounterConditionValueRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncountersApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies EncounterConditionValueRetrieveRequest;

  try {
    const data = await api.encounterConditionValueRetrieve(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `string` | This parameter can be a string or an integer. | [Defaults to `undefined`] |

### Return type

[**EncounterConditionValueDetail**](EncounterConditionValueDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## encounterMethodList

> PaginatedEncounterMethodSummaryList encounterMethodList(limit, offset, q)

List encounter methods

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Example

```ts
import {
  Configuration,
  EncountersApi,
} from '';
import type { EncounterMethodListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncountersApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies EncounterMethodListRequest;

  try {
    const data = await api.encounterMethodList(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | `number` | Number of results to return per page. | [Optional] [Defaults to `undefined`] |
| **offset** | `number` | The initial index from which to return the results. | [Optional] [Defaults to `undefined`] |
| **q** | `string` | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | [Optional] [Defaults to `undefined`] |

### Return type

[**PaginatedEncounterMethodSummaryList**](PaginatedEncounterMethodSummaryList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)


## encounterMethodRetrieve

> EncounterMethodDetail encounterMethodRetrieve(id)

Get encounter method

Methods by which the player might can encounter Pokémon in the wild, e.g., walking in tall grass. Check out Bulbapedia for greater detail.

### Example

```ts
import {
  Configuration,
  EncountersApi,
} from '';
import type { EncounterMethodRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EncountersApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies EncounterMethodRetrieveRequest;

  try {
    const data = await api.encounterMethodRetrieve(body);
    console.log(data);
  } catch (error) {
    console.error(error);
  }
}

// Run the test
example().catch(console.error);
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **id** | `string` | This parameter can be a string or an integer. | [Defaults to `undefined`] |

### Return type

[**EncounterMethodDetail**](EncounterMethodDetail.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

