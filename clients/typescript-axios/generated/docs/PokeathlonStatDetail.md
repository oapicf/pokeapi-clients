# PokeathlonStatDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**affecting_natures** | [**PokeathlonStatAffectingNatures**](PokeathlonStatAffectingNatures.md) | A detail of natures which affect this Pokéathlon stat positively or negatively. | [readonly] [default to undefined]
**names** | [**Array&lt;PokeathlonStatName&gt;**](PokeathlonStatName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

## Example

```typescript
import { PokeathlonStatDetail } from './api';

const instance: PokeathlonStatDetail = {
    id,
    name,
    affecting_natures,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
