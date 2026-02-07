# .PokemonApi

All URIs are relative to *https://pokeapi.co*

Method | HTTP request | Description
------------- | ------------- | -------------
[**abilityList**](PokemonApi.md#abilityList) | **GET** /api/v2/ability/ | 
[**abilityRetrieve**](PokemonApi.md#abilityRetrieve) | **GET** /api/v2/ability/{id}/ | 
[**characteristicList**](PokemonApi.md#characteristicList) | **GET** /api/v2/characteristic/ | List charecterictics
[**characteristicRetrieve**](PokemonApi.md#characteristicRetrieve) | **GET** /api/v2/characteristic/{id}/ | Get characteristic
[**eggGroupList**](PokemonApi.md#eggGroupList) | **GET** /api/v2/egg-group/ | List egg groups
[**eggGroupRetrieve**](PokemonApi.md#eggGroupRetrieve) | **GET** /api/v2/egg-group/{id}/ | Get egg group
[**genderList**](PokemonApi.md#genderList) | **GET** /api/v2/gender/ | List genders
[**genderRetrieve**](PokemonApi.md#genderRetrieve) | **GET** /api/v2/gender/{id}/ | Get gender
[**growthRateList**](PokemonApi.md#growthRateList) | **GET** /api/v2/growth-rate/ | List growth rates
[**growthRateRetrieve**](PokemonApi.md#growthRateRetrieve) | **GET** /api/v2/growth-rate/{id}/ | Get growth rate
[**moveDamageClassList**](PokemonApi.md#moveDamageClassList) | **GET** /api/v2/move-damage-class/ | List move damage classes
[**moveDamageClassRetrieve**](PokemonApi.md#moveDamageClassRetrieve) | **GET** /api/v2/move-damage-class/{id}/ | Get move damage class
[**natureList**](PokemonApi.md#natureList) | **GET** /api/v2/nature/ | List natures
[**natureRetrieve**](PokemonApi.md#natureRetrieve) | **GET** /api/v2/nature/{id}/ | Get nature
[**pokeathlonStatList**](PokemonApi.md#pokeathlonStatList) | **GET** /api/v2/pokeathlon-stat/ | List pokeathlon stats
[**pokeathlonStatRetrieve**](PokemonApi.md#pokeathlonStatRetrieve) | **GET** /api/v2/pokeathlon-stat/{id}/ | Get pokeathlon stat
[**pokemonColorList**](PokemonApi.md#pokemonColorList) | **GET** /api/v2/pokemon-color/ | List pokemon colors
[**pokemonColorRetrieve**](PokemonApi.md#pokemonColorRetrieve) | **GET** /api/v2/pokemon-color/{id}/ | Get pokemon color
[**pokemonFormList**](PokemonApi.md#pokemonFormList) | **GET** /api/v2/pokemon-form/ | List pokemon forms
[**pokemonFormRetrieve**](PokemonApi.md#pokemonFormRetrieve) | **GET** /api/v2/pokemon-form/{id}/ | Get pokemon form
[**pokemonHabitatList**](PokemonApi.md#pokemonHabitatList) | **GET** /api/v2/pokemon-habitat/ | List pokemom habitas
[**pokemonHabitatRetrieve**](PokemonApi.md#pokemonHabitatRetrieve) | **GET** /api/v2/pokemon-habitat/{id}/ | Get pokemom habita
[**pokemonList**](PokemonApi.md#pokemonList) | **GET** /api/v2/pokemon/ | List pokemon
[**pokemonRetrieve**](PokemonApi.md#pokemonRetrieve) | **GET** /api/v2/pokemon/{id}/ | Get pokemon
[**pokemonShapeList**](PokemonApi.md#pokemonShapeList) | **GET** /api/v2/pokemon-shape/ | List pokemon shapes
[**pokemonShapeRetrieve**](PokemonApi.md#pokemonShapeRetrieve) | **GET** /api/v2/pokemon-shape/{id}/ | Get pokemon shape
[**pokemonSpeciesList**](PokemonApi.md#pokemonSpeciesList) | **GET** /api/v2/pokemon-species/ | List pokemon species
[**pokemonSpeciesRetrieve**](PokemonApi.md#pokemonSpeciesRetrieve) | **GET** /api/v2/pokemon-species/{id}/ | Get pokemon species
[**statList**](PokemonApi.md#statList) | **GET** /api/v2/stat/ | List stats
[**statRetrieve**](PokemonApi.md#statRetrieve) | **GET** /api/v2/stat/{id}/ | Get stat
[**typeList**](PokemonApi.md#typeList) | **GET** /api/v2/type/ | List types
[**typeRetrieve**](PokemonApi.md#typeRetrieve) | **GET** /api/v2/type/{id}/ | Get types


# **abilityList**
> PaginatedAbilitySummaryList abilityList()

Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiAbilityListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiAbilityListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.abilityList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedAbilitySummaryList**

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

# **abilityRetrieve**
> AbilityDetail abilityRetrieve()

Abilities provide passive effects for Pokémon in battle or in the overworld. Pokémon have multiple possible abilities but can have only one ability at a time. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Ability) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiAbilityRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiAbilityRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.abilityRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**AbilityDetail**

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

# **characteristicList**
> PaginatedCharacteristicSummaryList characteristicList()

Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiCharacteristicListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiCharacteristicListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.characteristicList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedCharacteristicSummaryList**

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

# **characteristicRetrieve**
> CharacteristicDetail characteristicRetrieve()

Characteristics indicate which stat contains a Pokémon\'s highest IV. A Pokémon\'s Characteristic is determined by the remainder of its highest IV divided by 5 (gene_modulo). Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Characteristic) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiCharacteristicRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiCharacteristicRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.characteristicRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**CharacteristicDetail**

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

# **eggGroupList**
> PaginatedEggGroupSummaryList eggGroupList()

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiEggGroupListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiEggGroupListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.eggGroupList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedEggGroupSummaryList**

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

# **eggGroupRetrieve**
> EggGroupDetail eggGroupRetrieve()

Egg Groups are categories which determine which Pokémon are able to interbreed. Pokémon may belong to either one or two Egg Groups. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Egg_Group) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiEggGroupRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiEggGroupRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.eggGroupRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**EggGroupDetail**

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

# **genderList**
> PaginatedGenderSummaryList genderList()

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiGenderListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiGenderListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.genderList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedGenderSummaryList**

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

# **genderRetrieve**
> GenderDetail genderRetrieve()

Genders were introduced in Generation II for the purposes of breeding Pokémon but can also result in visual differences or even different evolutionary lines. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Gender) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiGenderRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiGenderRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.genderRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**GenderDetail**

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

# **growthRateList**
> PaginatedGrowthRateSummaryList growthRateList()

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiGrowthRateListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiGrowthRateListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.growthRateList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedGrowthRateSummaryList**

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

# **growthRateRetrieve**
> GrowthRateDetail growthRateRetrieve()

Growth rates are the speed with which Pokémon gain levels through experience. Check out [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Experience) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiGrowthRateRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiGrowthRateRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.growthRateRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**GrowthRateDetail**

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

# **moveDamageClassList**
> PaginatedMoveDamageClassSummaryList moveDamageClassList()

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiMoveDamageClassListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiMoveDamageClassListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.moveDamageClassList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedMoveDamageClassSummaryList**

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

# **moveDamageClassRetrieve**
> MoveDamageClassDetail moveDamageClassRetrieve()

Damage classes moves can have, e.g. physical, special, or non-damaging.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiMoveDamageClassRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiMoveDamageClassRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.moveDamageClassRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**MoveDamageClassDetail**

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

# **natureList**
> PaginatedNatureSummaryList natureList()

Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiNatureListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiNatureListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.natureList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedNatureSummaryList**

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

# **natureRetrieve**
> NatureDetail natureRetrieve()

Natures influence how a Pokémon\'s stats grow. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Nature) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiNatureRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiNatureRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.natureRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**NatureDetail**

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

# **pokeathlonStatList**
> PaginatedPokeathlonStatSummaryList pokeathlonStatList()

Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokeathlonStatListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokeathlonStatListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.pokeathlonStatList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedPokeathlonStatSummaryList**

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

# **pokeathlonStatRetrieve**
> PokeathlonStatDetail pokeathlonStatRetrieve()

Pokeathlon Stats are different attributes of a Pokémon\'s performance in Pokéathlons. In Pokéathlons, competitions happen on different courses; one for each of the different Pokéathlon stats. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9athlon) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokeathlonStatRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokeathlonStatRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.pokeathlonStatRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**PokeathlonStatDetail**

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

# **pokemonColorList**
> PaginatedPokemonColorSummaryList pokemonColorList()

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonColorListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonColorListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.pokemonColorList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedPokemonColorSummaryList**

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

# **pokemonColorRetrieve**
> PokemonColorDetail pokemonColorRetrieve()

Colors used for sorting Pokémon in a Pokédex. The color listed in the Pokédex is usually the color most apparent or covering each Pokémon\'s body. No orange category exists; Pokémon that are primarily orange are listed as red or brown.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonColorRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonColorRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.pokemonColorRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**PokemonColorDetail**

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

# **pokemonFormList**
> PaginatedPokemonFormSummaryList pokemonFormList()

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonFormListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonFormListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.pokemonFormList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedPokemonFormSummaryList**

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

# **pokemonFormRetrieve**
> PokemonFormDetail pokemonFormRetrieve()

Some Pokémon may appear in one of multiple, visually different forms. These differences are purely cosmetic. For variations within a Pokémon species, which do differ in more than just visuals, the \'Pokémon\' entity is used to represent such a variety.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonFormRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonFormRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.pokemonFormRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**PokemonFormDetail**

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

# **pokemonHabitatList**
> PaginatedPokemonHabitatSummaryList pokemonHabitatList()

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonHabitatListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonHabitatListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.pokemonHabitatList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedPokemonHabitatSummaryList**

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

# **pokemonHabitatRetrieve**
> PokemonHabitatDetail pokemonHabitatRetrieve()

Habitats are generally different terrain Pokémon can be found in but can also be areas designated for rare or legendary Pokémon.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonHabitatRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonHabitatRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.pokemonHabitatRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**PokemonHabitatDetail**

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

# **pokemonList**
> PaginatedPokemonSummaryList pokemonList()

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.pokemonList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedPokemonSummaryList**

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

# **pokemonRetrieve**
> PokemonDetail pokemonRetrieve()

Pokémon are the creatures that inhabit the world of the Pokémon games. They can be caught using Pokéballs and trained by battling with other Pokémon. Each Pokémon belongs to a specific species but may take on a variant which makes it differ from other Pokémon of the same species, such as base stats, available abilities and typings. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Pok%C3%A9mon_(species)) for greater detail.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.pokemonRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**PokemonDetail**

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

# **pokemonShapeList**
> PaginatedPokemonShapeSummaryList pokemonShapeList()

Shapes used for sorting Pokémon in a Pokédex.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonShapeListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonShapeListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.pokemonShapeList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedPokemonShapeSummaryList**

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

# **pokemonShapeRetrieve**
> PokemonShapeDetail pokemonShapeRetrieve()

Shapes used for sorting Pokémon in a Pokédex.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonShapeRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonShapeRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.pokemonShapeRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**PokemonShapeDetail**

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

# **pokemonSpeciesList**
> PaginatedPokemonSpeciesSummaryList pokemonSpeciesList()

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonSpeciesListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonSpeciesListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.pokemonSpeciesList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedPokemonSpeciesSummaryList**

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

# **pokemonSpeciesRetrieve**
> PokemonSpeciesDetail pokemonSpeciesRetrieve()

A Pokémon Species forms the basis for at least one Pokémon. Attributes of a Pokémon species are shared across all varieties of Pokémon within the species. A good example is Wormadam; Wormadam is the species which can be found in three different varieties, Wormadam-Trash, Wormadam-Sandy and Wormadam-Plant.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiPokemonSpeciesRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiPokemonSpeciesRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.pokemonSpeciesRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**PokemonSpeciesDetail**

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

# **statList**
> PaginatedStatSummaryList statList()

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiStatListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiStatListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.statList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedStatSummaryList**

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

# **statRetrieve**
> StatDetail statRetrieve()

Stats determine certain aspects of battles. Each Pokémon has a value for each stat which grows as they gain levels and can be altered momentarily by effects in battles.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiStatRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiStatRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.statRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**StatDetail**

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

# **typeList**
> PaginatedTypeSummaryList typeList()

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiTypeListRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiTypeListRequest = {
    // Number of results to return per page. (optional)
  limit: 1,
    // The initial index from which to return the results. (optional)
  offset: 1,
    // > Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the `name` property.  (optional)
  q: "q_example",
};

const data = await apiInstance.typeList(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | [**number**] | Number of results to return per page. | (optional) defaults to undefined
 **offset** | [**number**] | The initial index from which to return the results. | (optional) defaults to undefined
 **q** | [**string**] | &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.  | (optional) defaults to undefined


### Return type

**PaginatedTypeSummaryList**

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

# **typeRetrieve**
> TypeDetail typeRetrieve()

Types are properties for Pokémon and their moves. Each type has three properties: which types of Pokémon it is super effective against, which types of Pokémon it is not very effective against, and which types of Pokémon it is completely ineffective against.

### Example


```typescript
import { createConfiguration, PokemonApi } from '';
import type { PokemonApiTypeRetrieveRequest } from '';

const configuration = createConfiguration();
const apiInstance = new PokemonApi(configuration);

const request: PokemonApiTypeRetrieveRequest = {
    // This parameter can be a string or an integer.
  id: "id_example",
};

const data = await apiInstance.typeRetrieve(request);
console.log('API called successfully. Returned data:', data);
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**string**] | This parameter can be a string or an integer. | defaults to undefined


### Return type

**TypeDetail**

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


