# TypeRelationships


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**no_damage_to** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types this type has no effect on. | [default to undefined]
**half_damage_to** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types this type is not very effect against. | [default to undefined]
**double_damage_to** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types this type is very effect against. | [default to undefined]
**no_damage_from** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types that have no effect on this type. | [default to undefined]
**half_damage_from** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types that are not very effective against this type. | [default to undefined]
**double_damage_from** | [**Array&lt;TypeSummary&gt;**](TypeSummary.md) | A list of types that are very effective against this type. | [default to undefined]

## Example

```typescript
import { TypeRelationships } from './api';

const instance: TypeRelationships = {
    no_damage_to,
    half_damage_to,
    double_damage_to,
    no_damage_from,
    half_damage_from,
    double_damage_from,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
