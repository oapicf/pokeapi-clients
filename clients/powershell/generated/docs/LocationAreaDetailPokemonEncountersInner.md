# LocationAreaDetailPokemonEncountersInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pokemon** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**VersionDetails** | [**LocationAreaDetailPokemonEncountersInnerVersionDetailsInner[]**](LocationAreaDetailPokemonEncountersInnerVersionDetailsInner.md) |  | 

## Examples

- Prepare the resource
```powershell
$LocationAreaDetailPokemonEncountersInner = Initialize-PSOpenAPIToolsLocationAreaDetailPokemonEncountersInner  -Pokemon null `
 -VersionDetails null
```

- Convert the resource to JSON
```powershell
$LocationAreaDetailPokemonEncountersInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

