# PokemonStat


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**base_stat** | **number** | The base value of the stat. | [default to undefined]
**effort** | **number** | The effort points (EV) the Pokémon has in the stat. | [default to undefined]
**stat** | [**StatSummary**](StatSummary.md) | The stat the Pokémon has. | [default to undefined]

## Example

```typescript
import { PokemonStat } from './api';

const instance: PokemonStat = {
    base_stat,
    effort,
    stat,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
