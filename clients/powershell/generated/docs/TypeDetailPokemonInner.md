# TypeDetailPokemonInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Slot** | **Int32** |  | [optional] 
**Pokemon** | [**TypeDetailPokemonInnerPokemon**](TypeDetailPokemonInnerPokemon.md) |  | [optional] 

## Examples

- Prepare the resource
```powershell
$TypeDetailPokemonInner = Initialize-PSOpenAPIToolsTypeDetailPokemonInner  -Slot null `
 -Pokemon null
```

- Convert the resource to JSON
```powershell
$TypeDetailPokemonInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

