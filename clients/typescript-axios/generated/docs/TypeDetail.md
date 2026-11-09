# TypeDetail

Serializer for the Type resource

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **number** | The identifier for this resource. | [readonly] [default to undefined]
**name** | **string** | The name for this resource. | [default to undefined]
**damage_relations** | [**TypeRelationships**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] [default to undefined]
**past_damage_relations** | [**Array&lt;TypePastRelationships&gt;**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] [default to undefined]
**game_indices** | [**Array&lt;TypeGameIndex&gt;**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] [default to undefined]
**generation** | [**GenerationSummary**](GenerationSummary.md) | The generation this type was introduced in. | [default to undefined]
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | [default to undefined]
**names** | [**Array&lt;TypeName&gt;**](TypeName.md) | The name of this resource listed in different languages. | [readonly] [default to undefined]
**pokemon** | [**Array&lt;TypePokemon&gt;**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] [default to undefined]
**moves** | [**Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that have this type. | [readonly] [default to undefined]
**sprites** | **{ [key: string]: { [key: string]: TypeGameSprite; }; }** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] [default to undefined]

## Example

```typescript
import { TypeDetail } from './api';

const instance: TypeDetail = {
    id,
    name,
    damage_relations,
    past_damage_relations,
    game_indices,
    generation,
    move_damage_class,
    names,
    pokemon,
    moves,
    sprites,
};
```

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)
