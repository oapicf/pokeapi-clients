# VersionGroupDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**order** | **number** |  | [optional] [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | [default to undefined]
**move_learn_methods** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [default to undefined]
**pokedexes** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [default to undefined]
**regions** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [default to undefined]
**versions** | [**Array&lt;VersionSummary&gt;**](VersionSummary.md) |  | [default to undefined]

## Example

```typescript
import { VersionGroupDetail } from './api';

const instance: VersionGroupDetail = {
    id,
    name,
    order,
    generation,
    move_learn_methods,
    pokedexes,
    regions,
    versions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
