# StatDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** |  | [readonly] [default to undefined]
**name** | **string** |  | [default to undefined]
**game_index** | **number** |  | [default to undefined]
**is_battle_only** | **boolean** |  | [optional] [default to undefined]
**affecting_moves** | [**StatDetailAffectingMoves**](StatDetailAffectingMoves.md) |  | [default to undefined]
**affecting_natures** | [**StatDetailAffectingNatures**](StatDetailAffectingNatures.md) |  | [default to undefined]
**characteristics** | [**Array&lt;CharacteristicSummary&gt;**](CharacteristicSummary.md) |  | [default to undefined]
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  | [default to undefined]
**names** | [**Array&lt;StatName&gt;**](StatName.md) |  | [default to undefined]

## Example

```typescript
import { StatDetail } from './api';

const instance: StatDetail = {
    id,
    name,
    game_index,
    is_battle_only,
    affecting_moves,
    affecting_natures,
    characteristics,
    move_damage_class,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
