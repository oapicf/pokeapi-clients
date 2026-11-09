# PokemonFormDetail

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**order** | **int** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] 
**formOrder** | **int** | The order in which forms should be sorted within a species&#39; forms. | [optional] 
**isDefault** | **bool** | True for exactly one form used as the default for each Pokémon. | [optional] 
**isBattleOnly** | **bool** | Whether or not this form can only happen during battle. | [optional] 
**isMega** | **bool** | Whether or not this form requires mega evolution. | [optional] 
**formName** | **string** | The name of this form. | 
**pokemon** | [**OpenAPI\Server\Model\PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | 
**sprites** | [**OpenAPI\Server\Model\PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] 
**versionGroup** | [**OpenAPI\Server\Model\VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**formNames** | [**OpenAPI\Server\Model\PokemonFormName**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**names** | [**OpenAPI\Server\Model\PokemonFormName**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**types** | [**OpenAPI\Server\Model\PokemonFormType**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] 
**triggerConditions** | [**OpenAPI\Server\Model\PokemonFormTriggerCondition**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] 
**flavorTextEntries** | [**OpenAPI\Server\Model\PokemonFormFlavorText**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


