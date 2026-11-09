# StatDetail

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly]
**name** | **string** | The name for this resource. |
**game_index** | **int** | ID the games use for this stat. |
**is_battle_only** | **bool** | Whether this stat only exists within a battle. | [optional]
**affecting_moves** | [**\OpenAPI\Client\Model\StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly]
**affecting_natures** | [**\OpenAPI\Client\Model\StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly]
**affecting_items** | [**\OpenAPI\Client\Model\ItemSummary[]**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly]
**characteristics** | [**\OpenAPI\Client\Model\CharacteristicSummary[]**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly]
**move_damage_class** | [**\OpenAPI\Client\Model\MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. |
**names** | [**\OpenAPI\Client\Model\StatName[]**](StatName.md) | The name of this resource listed in different languages. | [readonly]

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
