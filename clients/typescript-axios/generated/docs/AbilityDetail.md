# AbilityDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**is_main_series** | **boolean** | Whether or not this ability originated in the main series of the video games. | [optional] [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this ability originated in. | [default to undefined]
**names** | [**Array&lt;AbilityName&gt;**](AbilityName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**effect_entries** | [**Array&lt;AbilityEffectText&gt;**](AbilityEffectText.md) | The effect of this ability listed in different languages. | [readonly] [default to undefined]
**effect_changes** | [**Array&lt;AbilityChange&gt;**](AbilityChange.md) | The list of previous effects this ability has had across version groups. | [readonly] [default to undefined]
**flavor_text_entries** | [**Array&lt;AbilityFlavorText&gt;**](AbilityFlavorText.md) | The flavor text of this ability listed in different languages. | [readonly] [default to undefined]
**pokemon** | [**Array&lt;AbilityPokemonDetail&gt;**](AbilityPokemonDetail.md) | A list of Pokémon that could potentially have this ability. | [readonly] [default to undefined]

## Example

```typescript
import { AbilityDetail } from './api';

const instance: AbilityDetail = {
    id,
    name,
    is_main_series,
    generation,
    names,
    effect_entries,
    effect_changes,
    flavor_text_entries,
    pokemon,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
