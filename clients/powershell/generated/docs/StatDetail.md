# StatDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**GameIndex** | **Int32** | ID the games use for this stat. | 
**IsBattleOnly** | **Boolean** | Whether this stat only exists within a battle. | [optional] 
**AffectingMoves** | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] 
**AffectingNatures** | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] 
**AffectingItems** | [**ItemSummary[]**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] 
**Characteristics** | [**CharacteristicSummary[]**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] 
**MoveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | 
**Names** | [**StatName[]**](StatName.md) | The name of this resource listed in different languages. | [readonly] 

## Examples

- Prepare the resource
```powershell
$StatDetail = Initialize-PSOpenAPIToolsStatDetail  -Id null `
 -Name null `
 -GameIndex null `
 -IsBattleOnly null `
 -AffectingMoves null `
 -AffectingNatures null `
 -AffectingItems null `
 -Characteristics null `
 -MoveDamageClass null `
 -Names null
```

- Convert the resource to JSON
```powershell
$StatDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

