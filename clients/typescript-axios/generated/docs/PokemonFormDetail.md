# PokemonFormDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**order** | **number** | The order in which forms should be sorted within all forms. Multiple forms may have equal order, in which case they should fall back on sorting by name. | [optional] [default to undefined]
**form_order** | **number** | The order in which forms should be sorted within a species\&#39; forms. | [optional] [default to undefined]
**is_default** | **boolean** | True for exactly one form used as the default for each Pokémon. | [optional] [default to undefined]
**is_battle_only** | **boolean** | Whether or not this form can only happen during battle. | [optional] [default to undefined]
**is_mega** | **boolean** | Whether or not this form requires mega evolution. | [optional] [default to undefined]
**form_name** | **string** | The name of this form. | [default to undefined]
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon that can take on this form. | [default to undefined]
**sprites** | [**PokemonFormSprites**](PokemonFormSprites.md) | A set of sprites used to depict this Pokémon form in the game. | [readonly] [default to undefined]
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this Pokémon form was introduced in. | [default to undefined]
**form_names** | [**Array&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific form name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] [default to undefined]
**names** | [**Array&lt;PokemonFormName&gt;**](PokemonFormName.md) | The form specific full name of this Pokémon form, or empty if the form does not have a specific name. | [readonly] [default to undefined]
**types** | [**Array&lt;PokemonFormType&gt;**](PokemonFormType.md) | A list of details showing types this Pokémon form has. | [readonly] [default to undefined]
**trigger_conditions** | [**Array&lt;PokemonFormTriggerCondition&gt;**](PokemonFormTriggerCondition.md) | The conditions that trigger this form. Resource names and URLs are included when the trigger requires a resource. | [readonly] [default to undefined]
**flavor_text_entries** | [**Array&lt;PokemonFormFlavorText&gt;**](PokemonFormFlavorText.md) | The flavor text of this form listed in different languages and versions. | [readonly] [default to undefined]

## Example

```typescript
import { PokemonFormDetail } from './api';

const instance: PokemonFormDetail = {
    id,
    name,
    order,
    form_order,
    is_default,
    is_battle_only,
    is_mega,
    form_name,
    pokemon,
    sprites,
    version_group,
    form_names,
    names,
    types,
    trigger_conditions,
    flavor_text_entries,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
