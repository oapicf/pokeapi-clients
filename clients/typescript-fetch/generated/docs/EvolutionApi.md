# EvolutionApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**evolutionChainList**](EvolutionApi.md#evolutionchainlist) | **GET** /api/v2/evolution-chain/ | List evolution chains |
| [**evolutionChainRetrieve**](EvolutionApi.md#evolutionchainretrieve) | **GET** /api/v2/evolution-chain/{id}/ | Get evolution chain |
| [**evolutionTriggerList**](EvolutionApi.md#evolutiontriggerlist) | **GET** /api/v2/evolution-trigger/ | List evolution triggers |
| [**evolutionTriggerRetrieve**](EvolutionApi.md#evolutiontriggerretrieve) | **GET** /api/v2/evolution-trigger/{id}/ | Get evolution trigger |
| [**evolutionVariableList**](EvolutionApi.md#evolutionvariablelist) | **GET** /api/v2/evolution-variable/ | List evolution variables |
| [**evolutionVariableRetrieve**](EvolutionApi.md#evolutionvariableretrieve) | **GET** /api/v2/evolution-variable/{id}/ | Get evolution variable |



## evolutionChainList

> PaginatedEvolutionChainSummaryList evolutionChainList(limit, offset)

List evolution chains

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example

```ts
import {
  Configuration,
  EvolutionApi,
} from '';
import type { EvolutionChainListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EvolutionApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
  } satisfies EvolutionChainListRequest;

  try {
    const data = await api.evolutionChainList(body);
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

### Return type

[**PaginatedEvolutionChainSummaryList**](PaginatedEvolutionChainSummaryList.md)

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


## evolutionChainRetrieve

> EvolutionChainDetail evolutionChainRetrieve(id)

Get evolution chain

Evolution chains are essentially family trees. They start with the lowest stage within a family and detail evolution conditions for each as well as Pokémon they can evolve into up through the hierarchy.

### Example

```ts
import {
  Configuration,
  EvolutionApi,
} from '';
import type { EvolutionChainRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EvolutionApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies EvolutionChainRetrieveRequest;

  try {
    const data = await api.evolutionChainRetrieve(body);
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

[**EvolutionChainDetail**](EvolutionChainDetail.md)

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


## evolutionTriggerList

> PaginatedEvolutionTriggerSummaryList evolutionTriggerList(limit, offset, q)

List evolution triggers

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example

```ts
import {
  Configuration,
  EvolutionApi,
} from '';
import type { EvolutionTriggerListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EvolutionApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies EvolutionTriggerListRequest;

  try {
    const data = await api.evolutionTriggerList(body);
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

[**PaginatedEvolutionTriggerSummaryList**](PaginatedEvolutionTriggerSummaryList.md)

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


## evolutionTriggerRetrieve

> EvolutionTriggerDetail evolutionTriggerRetrieve(id)

Get evolution trigger

Evolution triggers are the events and conditions that cause a Pokémon to evolve. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Methods_of_evolution) for greater detail.

### Example

```ts
import {
  Configuration,
  EvolutionApi,
} from '';
import type { EvolutionTriggerRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EvolutionApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies EvolutionTriggerRetrieveRequest;

  try {
    const data = await api.evolutionTriggerRetrieve(body);
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

[**EvolutionTriggerDetail**](EvolutionTriggerDetail.md)

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


## evolutionVariableList

> PaginatedEvolutionVariableSummaryList evolutionVariableList(limit, offset, q)

List evolution variables

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example

```ts
import {
  Configuration,
  EvolutionApi,
} from '';
import type { EvolutionVariableListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EvolutionApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies EvolutionVariableListRequest;

  try {
    const data = await api.evolutionVariableList(body);
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

[**PaginatedEvolutionVariableSummaryList**](PaginatedEvolutionVariableSummaryList.md)

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


## evolutionVariableRetrieve

> EvolutionVariableDetail evolutionVariableRetrieve(id)

Get evolution variable

Evolution variables represent parameters (such as Encryption Constant and Personality Value) used in boolean expressions for form-branching evolutions. Check out [Bulbapedia](https://bulbapedia.bulbagarden.net/wiki/Personality_value) for greater detail.

### Example

```ts
import {
  Configuration,
  EvolutionApi,
} from '';
import type { EvolutionVariableRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new EvolutionApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies EvolutionVariableRetrieveRequest;

  try {
    const data = await api.evolutionVariableRetrieve(body);
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

[**EvolutionVariableDetail**](EvolutionVariableDetail.md)

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

