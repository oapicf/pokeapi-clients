# PokemonMoveVersionGroup
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**LevelLearnedAt** | **Int32** | The minimum level to learn the move. | 
**MoveLearnMethod** | [**MoveLearnMethodSummary**](MoveLearnMethodSummary.md) | The method by which the move is learned. | 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the move is learned. | 
**Order** | **Int32** | Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. | [optional] 

## Examples

- Prepare the resource
```powershell
$PokemonMoveVersionGroup = Initialize-PSOpenAPIToolsPokemonMoveVersionGroup  -LevelLearnedAt null `
 -MoveLearnMethod null `
 -VersionGroup null `
 -Order null
```

- Convert the resource to JSON
```powershell
$PokemonMoveVersionGroup | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

