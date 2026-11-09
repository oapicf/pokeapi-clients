# CharacteristicDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**gene_modulo** | **number** | The remainder of the highest stat/IV divided by 5. | [default to undefined]
**possible_values** | **Array&lt;number&gt;** | The possible values of the highest stat that would result in a Pokémon recieving this characteristic when divided by 5. | [readonly] [default to undefined]
**highest_stat** | [**StatSummary**](StatSummary.md) | The stat which results in this characteristic. | [default to undefined]
**descriptions** | [**Array&lt;CharacteristicDescription&gt;**](CharacteristicDescription.md) | The descriptions of this characteristic listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { CharacteristicDetail } from './api';

const instance: CharacteristicDetail = {
    id,
    gene_modulo,
    possible_values,
    highest_stat,
    descriptions,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
