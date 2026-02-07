# NatureDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**DecreasedStat** | [**StatSummary**](StatSummary.md) |  | 
**IncreasedStat** | [**StatSummary**](StatSummary.md) |  | 
**LikesFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | 
**HatesFlavor** | [**BerryFlavorSummary**](BerryFlavorSummary.md) |  | 
**Berries** | [**BerrySummary[]**](BerrySummary.md) |  | 
**PokeathlonStatChanges** | [**NatureDetailPokeathlonStatChangesInner[]**](NatureDetailPokeathlonStatChangesInner.md) |  | 
**MoveBattleStylePreferences** | [**NatureBattleStylePreference[]**](NatureBattleStylePreference.md) |  | 
**Names** | [**NatureName[]**](NatureName.md) |  | 

## Examples

- Prepare the resource
```powershell
$NatureDetail = Initialize-PSOpenAPIToolsNatureDetail  -Id null `
 -Name null `
 -DecreasedStat null `
 -IncreasedStat null `
 -LikesFlavor null `
 -HatesFlavor null `
 -Berries null `
 -PokeathlonStatChanges null `
 -MoveBattleStylePreferences null `
 -Names null
```

- Convert the resource to JSON
```powershell
$NatureDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

