# StatDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**game_index** | **number** | ID the games use for this stat. | [default to undefined]
**is_battle_only** | **boolean** | Whether this stat only exists within a battle. | [optional] [default to undefined]
**affecting_moves** | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] [default to undefined]
**affecting_natures** | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] [default to undefined]
**affecting_items** | [**Array&lt;ItemSummary&gt;**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] [default to undefined]
**characteristics** | [**Array&lt;CharacteristicSummary&gt;**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] [default to undefined]
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | [default to undefined]
**names** | [**Array&lt;StatName&gt;**](StatName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]

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
    affecting_items,
    characteristics,
    move_damage_class,
    names,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
