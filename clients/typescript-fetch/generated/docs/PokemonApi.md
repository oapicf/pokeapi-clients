# PokemonApi

All URIs are relative to *https://pokeapi.co*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**abilityList**](PokemonApi.md#abilitylist) | **GET** /api/v2/ability/ | List abilities |
| [**abilityRetrieve**](PokemonApi.md#abilityretrieve) | **GET** /api/v2/ability/{id}/ | Get ability |
| [**characteristicList**](PokemonApi.md#characteristiclist) | **GET** /api/v2/characteristic/ | List characteristics |
| [**characteristicRetrieve**](PokemonApi.md#characteristicretrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic |
| [**eggGroupList**](PokemonApi.md#egggrouplist) | **GET** /api/v2/egg-group/ | List egg groups |
| [**eggGroupRetrieve**](PokemonApi.md#egggroupretrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group |
| [**genderList**](PokemonApi.md#genderlist) | **GET** /api/v2/gender/ | List genders |
| [**genderRetrieve**](PokemonApi.md#genderretrieve) | **GET** /api/v2/gender/{id}/ | Get gender |
| [**growthRateList**](PokemonApi.md#growthratelist) | **GET** /api/v2/growth-rate/ | List growth rates |
| [**growthRateRetrieve**](PokemonApi.md#growthrateretrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate |
| [**moveDamageClassList**](PokemonApi.md#movedamageclasslist) | **GET** /api/v2/move-damage-class/ | List move damage classes |
| [**moveDamageClassRetrieve**](PokemonApi.md#movedamageclassretrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class |
| [**natureList**](PokemonApi.md#naturelist) | **GET** /api/v2/nature/ | List natures |
| [**natureRetrieve**](PokemonApi.md#natureretrieve) | **GET** /api/v2/nature/{id}/ | Get nature |
| [**pokeathlonStatList**](PokemonApi.md#pokeathlonstatlist) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats |
| [**pokeathlonStatRetrieve**](PokemonApi.md#pokeathlonstatretrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat |
| [**pokemonColorList**](PokemonApi.md#pokemoncolorlist) | **GET** /api/v2/pokemon-color/ | List pokemon colors |
| [**pokemonColorRetrieve**](PokemonApi.md#pokemoncolorretrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color |
| [**pokemonFormList**](PokemonApi.md#pokemonformlist) | **GET** /api/v2/pokemon-form/ | List pokemon forms |
| [**pokemonFormRetrieve**](PokemonApi.md#pokemonformretrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form |
| [**pokemonHabitatList**](PokemonApi.md#pokemonhabitatlist) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas |
| [**pokemonHabitatRetrieve**](PokemonApi.md#pokemonhabitatretrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita |
| [**pokemonList**](PokemonApi.md#pokemonlist) | **GET** /api/v2/pokemon/ | List pokemon |
| [**pokemonRetrieve**](PokemonApi.md#pokemonretrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon |
| [**pokemonShapeList**](PokemonApi.md#pokemonshapelist) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes |
| [**pokemonShapeRetrieve**](PokemonApi.md#pokemonshaperetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape |
| [**pokemonSpeciesList**](PokemonApi.md#pokemonspecieslist) | **GET** /api/v2/pokemon-species/ | List pokemon species |
| [**pokemonSpeciesRetrieve**](PokemonApi.md#pokemonspeciesretrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species |
| [**statList**](PokemonApi.md#statlist) | **GET** /api/v2/stat/ | List stats |
| [**statRetrieve**](PokemonApi.md#statretrieve) | **GET** /api/v2/stat/{id}/ | Get stat |
| [**typeList**](PokemonApi.md#typelist) | **GET** /api/v2/type/ | List types |
| [**typeRetrieve**](PokemonApi.md#typeretrieve) | **GET** /api/v2/type/{id}/ | Get types |



## abilityList

> PaginatedAbilitySummaryList abilityList(limit, offset, q)

List abilities

Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { AbilityListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies AbilityListRequest;

  try {
    const data = await api.abilityList(body);
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

[**PaginatedAbilitySummaryList**](PaginatedAbilitySummaryList.md)

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


## abilityRetrieve

> AbilityDetail abilityRetrieve(id)

Get ability

Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { AbilityRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies AbilityRetrieveRequest;

  try {
    const data = await api.abilityRetrieve(body);
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

[**AbilityDetail**](AbilityDetail.md)

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


## characteristicList

> PaginatedCharacteristicSummaryList characteristicList(limit, offset)

List characteristics

Characteristics indicate which stat contains a Pokémon\&#39;s highest IV. A Pokémon\&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { CharacteristicListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
  } satisfies CharacteristicListRequest;

  try {
    const data = await api.characteristicList(body);
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

[**PaginatedCharacteristicSummaryList**](PaginatedCharacteristicSummaryList.md)

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


## characteristicRetrieve

> CharacteristicDetail characteristicRetrieve(id)

Get characteristic

Characteristics indicate which stat contains a Pokémon\&#39;s highest IV. A Pokémon\&#39;s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { CharacteristicRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies CharacteristicRetrieveRequest;

  try {
    const data = await api.characteristicRetrieve(body);
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

[**CharacteristicDetail**](CharacteristicDetail.md)

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


## eggGroupList

> PaginatedEggGroupSummaryList eggGroupList(limit, offset, q)

List egg groups

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { EggGroupListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies EggGroupListRequest;

  try {
    const data = await api.eggGroupList(body);
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

[**PaginatedEggGroupSummaryList**](PaginatedEggGroupSummaryList.md)

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


## eggGroupRetrieve

> EggGroupDetail eggGroupRetrieve(id)

Get egg group

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { EggGroupRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies EggGroupRetrieveRequest;

  try {
    const data = await api.eggGroupRetrieve(body);
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

[**EggGroupDetail**](EggGroupDetail.md)

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


## genderList

> PaginatedGenderSummaryList genderList(limit, offset, q)

List genders

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { GenderListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies GenderListRequest;

  try {
    const data = await api.genderList(body);
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

[**PaginatedGenderSummaryList**](PaginatedGenderSummaryList.md)

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


## genderRetrieve

> GenderDetail genderRetrieve(id)

Get gender

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { GenderRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies GenderRetrieveRequest;

  try {
    const data = await api.genderRetrieve(body);
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

[**GenderDetail**](GenderDetail.md)

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


## growthRateList

> PaginatedGrowthRateSummaryList growthRateList(limit, offset, q)

List growth rates

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { GrowthRateListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies GrowthRateListRequest;

  try {
    const data = await api.growthRateList(body);
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

[**PaginatedGrowthRateSummaryList**](PaginatedGrowthRateSummaryList.md)

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


## growthRateRetrieve

> GrowthRateDetail growthRateRetrieve(id)

Get growth rate

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { GrowthRateRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies GrowthRateRetrieveRequest;

  try {
    const data = await api.growthRateRetrieve(body);
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

[**GrowthRateDetail**](GrowthRateDetail.md)

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


## moveDamageClassList

> PaginatedMoveDamageClassSummaryList moveDamageClassList(limit, offset, q)

List move damage classes

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { MoveDamageClassListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies MoveDamageClassListRequest;

  try {
    const data = await api.moveDamageClassList(body);
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

[**PaginatedMoveDamageClassSummaryList**](PaginatedMoveDamageClassSummaryList.md)

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


## moveDamageClassRetrieve

> MoveDamageClassDetail moveDamageClassRetrieve(id)

Get move damage class

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { MoveDamageClassRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies MoveDamageClassRetrieveRequest;

  try {
    const data = await api.moveDamageClassRetrieve(body);
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

[**MoveDamageClassDetail**](MoveDamageClassDetail.md)

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


## natureList

> PaginatedNatureSummaryList natureList(limit, offset, q)

List natures

Natures influence how a Pokémon\&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { NatureListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies NatureListRequest;

  try {
    const data = await api.natureList(body);
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

[**PaginatedNatureSummaryList**](PaginatedNatureSummaryList.md)

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


## natureRetrieve

> NatureDetail natureRetrieve(id)

Get nature

Natures influence how a Pokémon\&#39;s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { NatureRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies NatureRetrieveRequest;

  try {
    const data = await api.natureRetrieve(body);
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

[**NatureDetail**](NatureDetail.md)

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


## pokeathlonStatList

> PaginatedPokeathlonStatSummaryList pokeathlonStatList(limit, offset, q)

List pokeathlon stats

Pokeathlon Stats are different attributes of a Pokémon\&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokeathlonStatListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies PokeathlonStatListRequest;

  try {
    const data = await api.pokeathlonStatList(body);
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

[**PaginatedPokeathlonStatSummaryList**](PaginatedPokeathlonStatSummaryList.md)

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


## pokeathlonStatRetrieve

> PokeathlonStatDetail pokeathlonStatRetrieve(id)

Get pokeathlon stat

Pokeathlon Stats are different attributes of a Pokémon\&#39;s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokeathlonStatRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies PokeathlonStatRetrieveRequest;

  try {
    const data = await api.pokeathlonStatRetrieve(body);
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

[**PokeathlonStatDetail**](PokeathlonStatDetail.md)

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


## pokemonColorList

> PaginatedPokemonColorSummaryList pokemonColorList(limit, offset, q)

List pokemon colors

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonColorListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies PokemonColorListRequest;

  try {
    const data = await api.pokemonColorList(body);
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

[**PaginatedPokemonColorSummaryList**](PaginatedPokemonColorSummaryList.md)

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


## pokemonColorRetrieve

> PokemonColorDetail pokemonColorRetrieve(id)

Get pokemon color

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\&#39;s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonColorRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies PokemonColorRetrieveRequest;

  try {
    const data = await api.pokemonColorRetrieve(body);
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

[**PokemonColorDetail**](PokemonColorDetail.md)

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


## pokemonFormList

> PaginatedPokemonFormSummaryList pokemonFormList(limit, offset, q)

List pokemon forms

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \&#39;Pokémon\&#39; entity is used to represent such a variety.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonFormListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies PokemonFormListRequest;

  try {
    const data = await api.pokemonFormList(body);
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

[**PaginatedPokemonFormSummaryList**](PaginatedPokemonFormSummaryList.md)

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


## pokemonFormRetrieve

> PokemonFormDetail pokemonFormRetrieve(id)

Get pokemon form

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \&#39;Pokémon\&#39; entity is used to represent such a variety.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonFormRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies PokemonFormRetrieveRequest;

  try {
    const data = await api.pokemonFormRetrieve(body);
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

[**PokemonFormDetail**](PokemonFormDetail.md)

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


## pokemonHabitatList

> PaginatedPokemonHabitatSummaryList pokemonHabitatList(limit, offset, q)

List pokemom habitas

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonHabitatListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies PokemonHabitatListRequest;

  try {
    const data = await api.pokemonHabitatList(body);
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

[**PaginatedPokemonHabitatSummaryList**](PaginatedPokemonHabitatSummaryList.md)

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


## pokemonHabitatRetrieve

> PokemonHabitatDetail pokemonHabitatRetrieve(id)

Get pokemom habita

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonHabitatRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies PokemonHabitatRetrieveRequest;

  try {
    const data = await api.pokemonHabitatRetrieve(body);
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

[**PokemonHabitatDetail**](PokemonHabitatDetail.md)

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


## pokemonList

> PaginatedPokemonSummaryList pokemonList(limit, offset, q)

List pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies PokemonListRequest;

  try {
    const data = await api.pokemonList(body);
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

[**PaginatedPokemonSummaryList**](PaginatedPokemonSummaryList.md)

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


## pokemonRetrieve

> PokemonDetail pokemonRetrieve(id)

Get pokemon

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies PokemonRetrieveRequest;

  try {
    const data = await api.pokemonRetrieve(body);
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

[**PokemonDetail**](PokemonDetail.md)

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


## pokemonShapeList

> PaginatedPokemonShapeSummaryList pokemonShapeList(limit, offset, q)

List pokemon shapes

Shapes used for sorting Pokémon in a Pokédex.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonShapeListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies PokemonShapeListRequest;

  try {
    const data = await api.pokemonShapeList(body);
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

[**PaginatedPokemonShapeSummaryList**](PaginatedPokemonShapeSummaryList.md)

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


## pokemonShapeRetrieve

> PokemonShapeDetail pokemonShapeRetrieve(id)

Get pokemon shape

Shapes used for sorting Pokémon in a Pokédex.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonShapeRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies PokemonShapeRetrieveRequest;

  try {
    const data = await api.pokemonShapeRetrieve(body);
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

[**PokemonShapeDetail**](PokemonShapeDetail.md)

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


## pokemonSpeciesList

> PaginatedPokemonSpeciesSummaryList pokemonSpeciesList(limit, offset, q)

List pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonSpeciesListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies PokemonSpeciesListRequest;

  try {
    const data = await api.pokemonSpeciesList(body);
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

[**PaginatedPokemonSpeciesSummaryList**](PaginatedPokemonSpeciesSummaryList.md)

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


## pokemonSpeciesRetrieve

> PokemonSpeciesDetail pokemonSpeciesRetrieve(id)

Get pokemon species

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { PokemonSpeciesRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies PokemonSpeciesRetrieveRequest;

  try {
    const data = await api.pokemonSpeciesRetrieve(body);
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

[**PokemonSpeciesDetail**](PokemonSpeciesDetail.md)

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


## statList

> PaginatedStatSummaryList statList(limit, offset, q)

List stats

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { StatListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies StatListRequest;

  try {
    const data = await api.statList(body);
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

[**PaginatedStatSummaryList**](PaginatedStatSummaryList.md)

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


## statRetrieve

> StatDetail statRetrieve(id)

Get stat

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { StatRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies StatRetrieveRequest;

  try {
    const data = await api.statRetrieve(body);
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

[**StatDetail**](StatDetail.md)

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


## typeList

> PaginatedTypeSummaryList typeList(limit, offset, q)

List types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { TypeListRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // number | Number of results to return per page. (optional)
    limit: 56,
    // number | The initial index from which to return the results. (optional)
    offset: 56,
    // string | > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
    q: q_example,
  } satisfies TypeListRequest;

  try {
    const data = await api.typeList(body);
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

[**PaginatedTypeSummaryList**](PaginatedTypeSummaryList.md)

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


## typeRetrieve

> TypeDetail typeRetrieve(id)

Get types

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example

```ts
import {
  Configuration,
  PokemonApi,
} from '';
import type { TypeRetrieveRequest } from '';

async function example() {
  console.log("🚀 Testing  SDK...");
  const api = new PokemonApi();

  const body = {
    // string | This parameter can be a string or an integer.
    id: 1,
  } satisfies TypeRetrieveRequest;

  try {
    const data = await api.typeRetrieve(body);
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

[**TypeDetail**](TypeDetail.md)

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

