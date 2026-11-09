# MoveMeta
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) | The status ailment this move inflicts on its target. | 
**Category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) | The category of move this move falls under, e.g. damage or ailment. | 
**MinHits** | **Int32** | The minimum number of times this move hits. Null if it always only hits once. | [optional] 
**MaxHits** | **Int32** | The maximum number of times this move hits. Null if it always only hits once. | [optional] 
**MinTurns** | **Int32** | The minimum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**MaxTurns** | **Int32** | The maximum number of turns this move continues to take effect. Null if it always only lasts one turn. | [optional] 
**Drain** | **Int32** | HP drain (if positive) or Recoil damage (if negative), in percent of damage done. | [optional] 
**Healing** | **Int32** | The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP. | [optional] 
**CritRate** | **Int32** | Critical hit rate bonus. | [optional] 
**AilmentChance** | **Int32** | The likelihood this attack will cause an ailment. | [optional] 
**FlinchChance** | **Int32** | The likelihood this attack will cause the target Pokémon to flinch. | [optional] 
**StatChance** | **Int32** | The likelihood this attack will cause a stat change in the target Pokémon. | [optional] 

## Examples

- Prepare the resource
```powershell
$MoveMeta = Initialize-PSOpenAPIToolsMoveMeta  -Ailment null `
 -Category null `
 -MinHits null `
 -MaxHits null `
 -MinTurns null `
 -MaxTurns null `
 -Drain null `
 -Healing null `
 -CritRate null `
 -AilmentChance null `
 -FlinchChance null `
 -StatChance null
```

- Convert the resource to JSON
```powershell
$MoveMeta | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

