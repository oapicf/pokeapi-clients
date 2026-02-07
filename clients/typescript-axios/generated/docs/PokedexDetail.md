# PokedexDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**is_main_series** | **boolean** |  | [optional] [default to undefined]
**descriptions** | [**Array&lt;PokedexDescription&gt;**](PokedexDescription.md) |  | [default to undefined]
**names** | [**Array&lt;PokedexName&gt;**](PokedexName.md) |  | [default to undefined]
**pokemon_entries** | [**Array&lt;PokedexDetailPokemonEntriesInner&gt;**](PokedexDetailPokemonEntriesInner.md) |  | [default to undefined]
**region** | [**RegionSummary**](RegionSummary.md) |  | [default to undefined]
**version_groups** | [**Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | [default to undefined]

## Example

```typescript
import { PokedexDetail } from './api';

const instance: PokedexDetail = {
    id,
    name,
    is_main_series,
    descriptions,
    names,
    pokemon_entries,
    region,
    version_groups,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
