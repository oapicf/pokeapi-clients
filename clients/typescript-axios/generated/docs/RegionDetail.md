# RegionDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**locations** | [**Array&lt;LocationSummary&gt;**](LocationSummary.md) |  | [default to undefined]
**main_generation** | [**GenerationSummary**](GenerationSummary.md) |  | [readonly] [default to undefined]
**names** | [**Array&lt;RegionName&gt;**](RegionName.md) |  | [default to undefined]
**pokedexes** | [**Array&lt;PokedexSummary&gt;**](PokedexSummary.md) |  | [default to undefined]
**version_groups** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [default to undefined]

## Example

```typescript
import { RegionDetail } from './api';

const instance: RegionDetail = {
    id,
    name,
    locations,
    main_generation,
    names,
    pokedexes,
    version_groups,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
