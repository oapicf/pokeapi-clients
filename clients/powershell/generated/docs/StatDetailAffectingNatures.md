# StatDetailAffectingNatures
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Increase** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 
**Decrease** | [**AbilityDetailPokemonInnerPokemon[]**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$StatDetailAffectingNatures = Initialize-PSOpenAPIToolsStatDetailAffectingNatures  -Increase null `
 -Decrease null
```

- Convert the resource to JSON
```powershell
$StatDetailAffectingNatures | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

