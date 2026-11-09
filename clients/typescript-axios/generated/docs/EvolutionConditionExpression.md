# EvolutionConditionExpression


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **string** | Evaluatable RPN condition expression using evolution variables (e.g. \&#39;EC 100 % 0 &#x3D;&#x3D;\&#39;) | [default to undefined]
**percentage_chance** | **number** | Percentage chance of evolution under this condition (0-100) | [default to undefined]
**variables** | [**Array&lt;EvolutionVariableSummary&gt;**](EvolutionVariableSummary.md) | Evolution variables referenced in the expression | [default to undefined]

## Example

```typescript
import { EvolutionConditionExpression } from './api';

const instance: EvolutionConditionExpression = {
    expression,
    percentage_chance,
    variables,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
