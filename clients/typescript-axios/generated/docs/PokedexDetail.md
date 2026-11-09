# PokedexDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**is_main_series** | **boolean** | Whether or not this Pokédex originated in the main series of the video games. | [optional] [default to undefined]
**descriptions** | [**Array&lt;PokedexDescription&gt;**](PokedexDescription.md) | The description of this resource listed in different languages. | [readonly] [default to undefined]
**names** | [**Array&lt;PokedexName&gt;**](PokedexName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pokemon_entries** | [**Array&lt;PokemonDexNumber&gt;**](PokemonDexNumber.md) | A list of Pokémon catalogued in this Pokédex and their indexes. | [readonly] [default to undefined]
**region** | [**RegionSummary**](RegionSummary.md) | The region this Pokédex catalogues Pokémon for. | [default to undefined]
**version_groups** | [**Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups this Pokédex is relevant to. | [readonly] [default to undefined]

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
