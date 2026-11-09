# openapi::PokemonFormDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **integer** | The identifier for this resource. | [readonly] 
**name** | **character** | The name for this resource. | [Max. length: 200] 
**order** | **integer** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] [Max: 2147483647] [Min: -2147483648] 
**form_order** | **integer** | The order in which forms should be sorted within a species&#39; forms. | [optional] [Max: 2147483647] [Min: -2147483648] 
**is_default** | **character** | True for exactly one form used as the default for each Pokémon. | [optional] 
**is_battle_only** | **character** | Whether or not this form can only happen during battle. | [optional] 
**is_mega** | **character** | Whether or not this form requires mega evolution. | [optional] 
**form_name** | **character** | The name of this form. | [Max. length: 30] 
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | 
**sprites** | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] 
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | 
**form_names** | [**array[PokemonFormName]**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**names** | [**array[PokemonFormName]**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] 
**types** | [**array[PokemonFormType]**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] 
**trigger_conditions** | [**array[PokemonFormTriggerCondition]**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] 
**flavor_text_entries** | [**array[PokemonFormFlavorText]**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] 


