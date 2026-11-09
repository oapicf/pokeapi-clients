# PokemonDexEntry
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntryNumber** | **Int32** | The index number within the Pokédex. | 
**Pokedex** | [**PokedexSummary**](PokedexSummary.md) | The Pokédex the referenced Pokémon species can be found in. | 

## Examples

- Prepare the resource
```powershell
$PokemonDexEntry = Initialize-PSOpenAPIToolsPokemonDexEntry  -EntryNumber null `
 -Pokedex null
```

- Convert the resource to JSON
```powershell
$PokemonDexEntry | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

