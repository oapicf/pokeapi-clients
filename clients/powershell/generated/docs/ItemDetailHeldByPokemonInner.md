# ItemDetailHeldByPokemonInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pokemon** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**VersionDetails** | [**ItemDetailHeldByPokemonInnerVersionDetailsInner[]**](ItemDetailHeldByPokemonInnerVersionDetailsInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$ItemDetailHeldByPokemonInner = Initialize-PSOpenAPIToolsItemDetailHeldByPokemonInner  -Pokemon null `
 -VersionDetails null
```

- Convert the resource to JSON
```powershell
$ItemDetailHeldByPokemonInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

