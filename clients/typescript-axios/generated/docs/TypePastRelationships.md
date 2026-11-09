# TypePastRelationships


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced type had the listed damage relations | [default to undefined]
**damage_relations** | [**TypeRelationships**](TypeRelationships.md) | The damage relations the referenced type had up to and including the listed generation | [default to undefined]

## Example

```typescript
import { TypePastRelationships } from './api';

const instance: TypePastRelationships = {
    generation,
    damage_relations,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
