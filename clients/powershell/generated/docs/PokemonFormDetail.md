# PokemonFormDetail
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **Int32** | The identifier for this resource. | [readonly] 
**Name** | **String** | The name for this resource. | 
**Order** | **Int32** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] 
**FormOrder** | **Int32** | The order in which forms should be sorted within a species&#39; forms. | [optional] 
**IsDefault** | **Boolean** | True for exactly one form used as the default for each Pokémon. | [optional] 
**IsBattleOnly** | **Boolean** | Whether or not this form can only happen during battle. | [optional] 
**IsMega** | **Boolean** | Whether or not this form requires mega evolution. | [optional] 
**FormName** | **String** | The name of this form. | 
**Pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | 
**Sprites** | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] 
**VersionGroup** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**FormNames** | [**PokemonFormName[]**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**Names** | [**PokemonFormName[]**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**Types** | [**PokemonFormType[]**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] 
**TriggerConditions** | [**PokemonFormTriggerCondition[]**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] 
**FlavorTextEntries** | [**PokemonFormFlavorText[]**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] 

## Examples

- Prepare the resource
```powershell
$PokemonFormDetail = Initialize-PSOpenAPIToolsPokemonFormDetail  -Id null `
 -Name null `
 -Order null `
 -FormOrder null `
 -IsDefault null `
 -IsBattleOnly null `
 -IsMega null `
 -FormName null `
 -Pokemon null `
 -Sprites null `
 -VersionGroup null `
 -FormNames null `
 -Names null `
 -Types null `
 -TriggerConditions null `
 -FlavorTextEntries null
```

- Convert the resource to JSON
```powershell
$PokemonFormDetail | ConvertTo-JSON
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

