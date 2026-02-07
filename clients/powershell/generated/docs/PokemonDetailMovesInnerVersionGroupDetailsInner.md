# PokemonDetailMovesInnerVersionGroupDetailsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LevelLearnedAt** | **Int32** |  | 
**MoveLearnMethod** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**VersionGroup** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonDetailMovesInnerVersionGroupDetailsInner = Initialize-PSOpenAPIToolsPokemonDetailMovesInnerVersionGroupDetailsInner  -LevelLearnedAt null `
 -MoveLearnMethod null `
 -VersionGroup null
```

- Convert the resource to JSON
```powershell
$PokemonDetailMovesInnerVersionGroupDetailsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

