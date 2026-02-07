# PokedexDetailPokemonEntriesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntryNumber** | **Int32** |  | 
**PokemonSpecies** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokedexDetailPokemonEntriesInner = Initialize-PSOpenAPIToolsPokedexDetailPokemonEntriesInner  -EntryNumber null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$PokedexDetailPokemonEntriesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

