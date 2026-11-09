# Org.OpenAPITools.Model.LocationAreaDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int** | The identifier for this resource. | [readonly] 
**Name** | **string** | The name for this resource. | 
**GameIndex** | **int** | The internal id of an API resource within game data. | 
**EncounterMethodRates** | [**List&lt;LocationAreaEncounterRate&gt;**](LocationAreaEncounterRate.md) | A list of methods in which Pokémon may be encountered in this area and how likely the method will occur depending on the version of the game. | [readonly] 
**Location** | [**LocationSummary**](LocationSummary.md) | The region this location area can be found in. | 
**Names** | [**List&lt;LocationAreaName&gt;**](LocationAreaName.md) | The name of this resource listed in different languages. | [readonly] 
**PokemonEncounters** | [**List&lt;LocationAreaPokemonEncounter&gt;**](LocationAreaPokemonEncounter.md) | A list of Pokémon that can be encountered in this area along with version specific details about the encounter. | [readonly] 

[[Back to Model list]](../../README.md#documentation-for-models) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to README]](../../README.md)

