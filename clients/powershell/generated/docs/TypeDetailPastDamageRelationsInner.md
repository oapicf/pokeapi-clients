# TypeDetailPastDamageRelationsInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Generation** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 
**DamageRelations** | [**TypeDetailPastDamageRelationsInnerDamageRelations**](TypeDetailPastDamageRelationsInnerDamageRelations.md) |  | 

## Examples

- Prepare the resource
```powershell
$TypeDetailPastDamageRelationsInner = Initialize-PSOpenAPIToolsTypeDetailPastDamageRelationsInner  -Generation null `
 -DamageRelations null
```

- Convert the resource to JSON
```powershell
$TypeDetailPastDamageRelationsInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

