# ContestEffectDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**appeal** | **number** | The base number of hearts the user of this move gets. | [default to undefined]
**jam** | **number** | The base number of hearts the user\&#39;s opponent loses. | [default to undefined]
**effect_entries** | [**Array&lt;ContestEffectEffectText&gt;**](ContestEffectEffectText.md) | The result of this contest effect listed in different languages. | [readonly] [default to undefined]
**flavor_text_entries** | [**Array&lt;ContestEffectFlavorText&gt;**](ContestEffectFlavorText.md) | The flavor text of this contest effect listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { ContestEffectDetail } from './api';

const instance: ContestEffectDetail = {
    id,
    appeal,
    jam,
    effect_entries,
    flavor_text_entries,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
