# PokemonMove
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Move** | [**MoveSummary**](MoveSummary.md) | The move the Pokémon can learn. | 
**VersionGroupDetails** | [**PokemonMoveVersionGroup[]**](PokemonMoveVersionGroup.md) | The details of the version in which the Pokémon can learn the move. | 

## Examples

- Prepare the resource
```powershell
$PokemonMove = Initialize-PSOpenAPIToolsPokemonMove  -Move null `
 -VersionGroupDetails null
```

- Convert the resource to JSON
```powershell
$PokemonMove | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

