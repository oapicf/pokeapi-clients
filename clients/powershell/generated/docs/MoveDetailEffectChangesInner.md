# MoveDetailEffectChangesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EffectEntries** | [**MoveDetailEffectChangesInnerEffectEntriesInner[]**](MoveDetailEffectChangesInnerEffectEntriesInner.md) |  | 
**VersionGroup** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$MoveDetailEffectChangesInner = Initialize-PSOpenAPIToolsMoveDetailEffectChangesInner  -EffectEntries null `
 -VersionGroup null
```

- Convert the resource to JSON
```powershell
$MoveDetailEffectChangesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

