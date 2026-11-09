# LocationAreaDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**GameIndex** | **Int32** | The internal id of an API resource within game data. | 
**EncounterMethodRates** | [**LocationAreaEncounterRate[]**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] 
**Location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. | 
**Names** | [**LocationAreaName[]**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonEncounters** | [**LocationAreaPokemonEncounter[]**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] 

## Examples

- Prepare the resource
```powershell
$LocationAreaDetail = Initialize-PSOpenAPIToolsLocationAreaDetail  -Id null `
 -Name null `
 -GameIndex null `
 -EncounterMethodRates null `
 -Location null `
 -Names null `
 -PokemonEncounters null
```

- Convert the resource to JSON
```powershell
$LocationAreaDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

