# MoveDetailMachinesInner
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Machine** | [**MoveDetailMachinesInnerMachine**](MoveDetailMachinesInnerMachine.md) |  | 
**VersionGroup** | [**AbilityDetailPokemonInnerPokemon**](AbilityDetailPokemonInnerPokemon.md) |  | 

## Examples

- Prepare the resource
```powershell
$MoveDetailMachinesInner = Initialize-PSOpenAPIToolsMoveDetailMachinesInner  -Machine null `
 -VersionGroup null
```

- Convert the resource to JSON
```powershell
$MoveDetailMachinesInner | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

