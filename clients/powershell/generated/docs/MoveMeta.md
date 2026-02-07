# MoveMeta
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Ailment** | [**MoveMetaAilmentSummary**](MoveMetaAilmentSummary.md) |  | 
**Category** | [**MoveMetaCategorySummary**](MoveMetaCategorySummary.md) |  | 
**MinHits** | **Int32** |  | [optional] 
**MaxHits** | **Int32** |  | [optional] 
**MinTurns** | **Int32** |  | [optional] 
**MaxTurns** | **Int32** |  | [optional] 
**Drain** | **Int32** |  | [optional] 
**Healing** | **Int32** |  | [optional] 
**CritRate** | **Int32** |  | [optional] 
**AilmentChance** | **Int32** |  | [optional] 
**FlinchChance** | **Int32** |  | [optional] 
**StatChance** | **Int32** |  | [optional] 

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

