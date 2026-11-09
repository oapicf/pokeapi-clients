# AbilityPokemonDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**is_hidden** | **boolean** | Whether or not this a hidden ability for the referenced Pokémon. | [optional] [default to undefined]
**slot** | **number** | Pokémon have 3 ability \&#39;slots\&#39; which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon. | [default to undefined]
**pokemon** | [**PokemonSummary**](PokemonSummary.md) | The Pokémon this ability could belong to. | [default to undefined]

## Example

```typescript
import { AbilityPokemonDetail } from './api';

const instance: AbilityPokemonDetail = {
    is_hidden,
    slot,
    pokemon,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
