# PokemonMoveVersionGroup


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**level_learned_at** | **number** | The minimum level to learn the move. | [default to undefined]
**move_learn_method** | [**MoveLearnMethodSummary**](MoveLearnMethodSummary.md) | The method by which the move is learned. | [default to undefined]
**version_group** | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which the move is learned. | [default to undefined]
**order** | **number** | Order by which the pokemon will learn the move. A newly learnt move will replace the move with lowest order. | [optional] [default to undefined]

## Example

```typescript
import { PokemonMoveVersionGroup } from './api';

const instance: PokemonMoveVersionGroup = {
    level_learned_at,
    move_learn_method,
    version_group,
    order,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
