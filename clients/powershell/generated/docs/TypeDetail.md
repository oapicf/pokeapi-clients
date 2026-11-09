# TypeDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**DamageRelations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] 
**PastDamageRelations** | [**TypePastRelationships[]**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] 
**GameIndices** | [**TypeGameIndex[]**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] 
**Generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | 
**MoveDamageClass** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | 
**Names** | [**TypeName[]**](TypeName.md) | The name of this resource listed in different languages. | [readonly] 
**Pokemon** | [**TypePokemon[]**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] 
**Moves** | [**MoveSummary[]**](MoveSummary.md) | A list of moves that have this type. | [readonly] 
**Sprites** | [**System.Collections.Hashtable**](Map.md) | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] 

## Examples

- Prepare the resource
```powershell
$TypeDetail = Initialize-PSOpenAPIToolsTypeDetail  -Id null `
 -Name null `
 -DamageRelations null `
 -PastDamageRelations null `
 -GameIndices null `
 -Generation null `
 -MoveDamageClass null `
 -Names null `
 -Pokemon null `
 -Moves null `
 -Sprites null
```

- Convert the resource to JSON
```powershell
$TypeDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

