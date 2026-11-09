# SuperContestEffectDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**appeal** | **number** | The level of appeal this super contest effect has. | [default to undefined]
**flavor_text_entries** | [**Array&lt;SuperContestEffectFlavorText&gt;**](SuperContestEffectFlavorText.md) | The flavor text of this super contest effect listed in different languages. | [readonly] [default to undefined]
**moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that have the effect when used in super contests. | [readonly] [default to undefined]

## Example

```typescript
import { SuperContestEffectDetail } from './api';

const instance: SuperContestEffectDetail = {
    id,
    appeal,
    flavor_text_entries,
    moves,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
