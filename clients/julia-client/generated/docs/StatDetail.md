# StatDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`game_index`** | **`Int64`** | ID the games use for this stat. | [default to nothing]
**`is_battle_only`** | **`Bool`** | Whether this stat only exists within a battle. | [optional] [default to nothing]
**`affecting_moves`** | [**`*StatAffectingMoves`**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] [default to nothing]
**`affecting_natures`** | [**`*StatAffectingNatures`**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] [default to nothing]
**`affecting_items`** | [**`Vector{ItemSummary}`**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] [default to nothing]
**`characteristics`** | [**`Vector{CharacteristicSummary}`**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] [default to nothing]
**`move_damage_class`** | [**`*MoveDamageClassSummary`**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | [default to nothing]
**`names`** | [**`Vector{StatName}`**](StatName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


