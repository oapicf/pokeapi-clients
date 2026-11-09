# TYPE_DETAIL

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **INTEGER_32** | The identifier for this resource. | [readonly] [default to null]
**name** | [**STRING_32**](STRING_32.md) | The name for this resource. | [default to null]
**damage_relations** | [**TYPE_RELATIONSHIPS**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] [default to null]
**past_damage_relations** | [**LIST [TYPE_PAST_RELATIONSHIPS]**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] [default to null]
**game_indices** | [**LIST [TYPE_GAME_INDEX]**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] [default to null]
**generation** | [**GENERATION_SUMMARY**](GenerationSummary.md) | The generation this type was introduced in. | [default to null]
**move_damage_class** | [**MOVE_DAMAGE_CLASS_SUMMARY**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | [default to null]
**names** | [**LIST [TYPE_NAME]**](TypeName.md) | The name of this resource listed in different languages. | [readonly] [default to null]
**pokemon** | [**LIST [TYPE_POKEMON]**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] [default to null]
**moves** | [**LIST [MOVE_SUMMARY]**](MoveSummary.md) | A list of moves that have this type. | [readonly] [default to null]
**sprites** | [**STRING_TABLE [STRING_TABLE [TYPE_GAME_SPRITE]]**](STRING_TABLE.md) | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


