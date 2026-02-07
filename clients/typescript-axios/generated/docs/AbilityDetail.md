# AbilityDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**is_main_series** | **boolean** |  | [optional] [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) |  | [default to undefined]
**names** | [**Array&lt;AbilityName&gt;**](AbilityName.md) |  | [default to undefined]
**effect_entries** | [**Array&lt;AbilityEffectText&gt;**](AbilityEffectText.md) |  | [default to undefined]
**effect_changes** | [**Array&lt;AbilityChange&gt;**](AbilityChange.md) |  | [default to undefined]
**flavor_text_entries** | [**Array&lt;AbilityFlavorText&gt;**](AbilityFlavorText.md) |  | [default to undefined]
**pokemon** | [**Array&lt;AbilityDetailPokemonInner&gt;**](AbilityDetailPokemonInner.md) |  | [default to undefined]

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
