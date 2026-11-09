# EvolutionVariableDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**symbol** | **string** | The symbol used for this variable in evolution condition expressions. | [default to undefined]
**data_type** | **string** | The data type of this variable. | [optional] [default to undefined]
**source** | **string** | The source of the variable value. | [optional] [default to undefined]
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which this variable was introduced. | [default to undefined]
**names** | [**Array&lt;EvolutionVariableName&gt;**](EvolutionVariableName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**descriptions** | [**Array&lt;EvolutionVariableDescription&gt;**](EvolutionVariableDescription.md) | The description of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { EvolutionVariableDetail } from './api';

const instance: EvolutionVariableDetail = {
    id,
    name,
    symbol,
    data_type,
    source,
    version_group,
    names,
    descriptions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
