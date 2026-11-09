# PokemonAbilityPast


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_hidden** | **boolean** | Whether or not this is a hidden ability. | [optional] [default to undefined]
**slot** | **number** | The slot this ability occupies in this Pokémon species. | [default to undefined]
**ability** | [**AbilitySummary**](AbilitySummary.md) | The ability the Pokémon may have. | [default to undefined]

## Example

```typescript
import { PokemonAbilityPast } from './api';

const instance: PokemonAbilityPast = {
    is_hidden,
    slot,
    ability,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
