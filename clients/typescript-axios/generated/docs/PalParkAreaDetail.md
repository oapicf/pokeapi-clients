# PalParkAreaDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**names** | [**Array&lt;PalParkAreaName&gt;**](PalParkAreaName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pokemon_encounters** | [**Array&lt;PalParkEncounter&gt;**](PalParkEncounter.md) | A list of Pokémon encountered in thi pal park area along with details. | [readonly] [default to undefined]

## Example

```typescript
import { PalParkAreaDetail } from './api';

const instance: PalParkAreaDetail = {
    id,
    name,
    names,
    pokemon_encounters,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
