# TypeDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`damage_relations`** | [**`*TypeRelationships`**](TypeRelationships.md) | A detail of how effective this type is toward others and vice versa. | [readonly] [default to nothing]
**`past_damage_relations`** | [**`Vector{TypePastRelationships}`**](TypePastRelationships.md) | A list of details of how effective this type was toward others and vice versa in previous generations | [readonly] [default to nothing]
**`game_indices`** | [**`Vector{TypeGameIndex}`**](TypeGameIndex.md) | A list of game indices relevent to this item by generation. | [readonly] [default to nothing]
**`generation`** | [**`*GenerationSummary`**](GenerationSummary.md) | The generation this type was introduced in. | [default to nothing]
**`move_damage_class`** | [**`*MoveDamageClassSummary`**](MoveDamageClassSummary.md) | The class of damage inflicted by this type. | [default to nothing]
**`names`** | [**`Vector{TypeName}`**](TypeName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]
**`pokemon`** | [**`Vector{TypePokemon}`**](TypePokemon.md) | A list of details of Pokémon that have this type. | [readonly] [default to nothing]
**`moves`** | [**`Vector{MoveSummary}`**](MoveSummary.md) | A list of moves that have this type. | [readonly] [default to nothing]
**`sprites`** | **`Dict{String, Dict{String, TypeGameSprite}}`** | Type icons grouped by generation and game, with name_icon and symbol_icon URLs. Unavailable icons are null. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


