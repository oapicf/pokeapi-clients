# PokemonPastType


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed types. | [default to undefined]
**types** | [**Array&lt;PokemonType&gt;**](PokemonType.md) | The types the referenced pokémon had up to and including the listed generation. | [default to undefined]

## Example

```typescript
import { PokemonPastType } from './api';

const instance: PokemonPastType = {
    generation,
    types,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
