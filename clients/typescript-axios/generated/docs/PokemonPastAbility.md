# PokemonPastAbility


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**abilities** | [**Array&lt;PokemonAbilityPast&gt;**](PokemonAbilityPast.md) | The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty. | [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) | The last generation in which the referenced pokémon had the listed abilities. | [default to undefined]

## Example

```typescript
import { PokemonPastAbility } from './api';

const instance: PokemonPastAbility = {
    abilities,
    generation,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
