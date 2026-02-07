# StatDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** |  | [readonly] 
**Name** | **String** |  | 
**GameIndex** | **Int32** |  | 
**IsBattleOnly** | **Boolean** |  | [optional] 
**AffectingMoves** | [**StatDetailAffectingMoves**](StatDetailAffectingMoves.md) |  | 
**AffectingNatures** | [**StatDetailAffectingNatures**](StatDetailAffectingNatures.md) |  | 
**Characteristics** | [**CharacteristicSummary[]**](CharacteristicSummary.md) |  | 
**MoveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | 
**Names** | [**StatName[]**](StatName.md) |  | 

## Examples

- Prepare the resource
```powershell
$StatDetail = Initialize-PSOpenAPIToolsStatDetail  -Id null `
 -Name null `
 -GameIndex null `
 -IsBattleOnly null `
 -AffectingMoves null `
 -AffectingNatures null `
 -Characteristics null `
 -MoveDamageClass null `
 -Names null
```

- Convert the resource to JSON
```powershell
$StatDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

