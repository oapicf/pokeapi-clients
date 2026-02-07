# PokemonDetailHeldItems
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Item** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**VersionDetails** | [**ItemDetailHeldByPokemonInnerVersionDetailsInner[]**](ItemDetailHeldByPokemonInnerVersionDetailsInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$PokemonDetailHeldItems = Initialize-PSOpenAPIToolsPokemonDetailHeldItems  -Item null `
 -VersionDetails null
```

- Convert the resource to JSON
```powershell
$PokemonDetailHeldItems | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

