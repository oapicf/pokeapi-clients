# NatureDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**DecreasedStat** | [**StatSummary**](StatSummary.md) | The stat decreased by 10% in Pokémon with this nature. | 
**IncreasedStat** | [**StatSummary**](StatSummary.md) | The stat increased by 10% in Pokémon with this nature. | 
**LikesFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor liked by Pokémon with this nature. | 
**HatesFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) | The flavor hated by Pokémon with this nature. | 
**PokeathlonStatChanges** | [**NaturePokeathlonStat[]**](NaturePokeathlonStat.md) | A list of Pokéathlon stats this nature effects and how much it effects them. | [readonly] 
**MoveBattleStylePreferences** | [**NatureBattleStylePreference[]**](NatureBattleStylePreference.md) | A list of battle styles and how likely a Pokémon with this nature is to use them in the Battle Palace or Battle Tent. | [readonly] 
**Names** | [**NatureName[]**](NatureName.md) | The name of this resource listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$NatureDetail = Initialize-PSOpenAPIToolsNatureDetail  -Id null `
 -Name null `
 -DecreasedStat null `
 -IncreasedStat null `
 -LikesFlavor null `
 -HatesFlavor null `
 -PokeathlonStatChanges null `
 -MoveBattleStylePreferences null `
 -Names null
```

- Convert the resource to JSON
```powershell
$NatureDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

