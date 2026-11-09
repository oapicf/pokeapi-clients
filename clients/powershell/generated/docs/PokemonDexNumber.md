# PokemonDexNumber
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntryNumber** | **Int32** | The index of this Pokémon species entry within the Pokédex. | 
**PokemonSpecies** | [**PokemonSpeciesSummary**](PokemonSpeciesSummary.md) | The Pokémon species being encountered. | 

## Examples

- Prepare the resource
```powershell
$PokemonDexNumber = Initialize-PSOpenAPIToolsPokemonDexNumber  -EntryNumber null `
 -PokemonSpecies null
```

- Convert the resource to JSON
```powershell
$PokemonDexNumber | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

