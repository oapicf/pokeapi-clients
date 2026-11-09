# WWW::OpenAPIClient::Object::StatDetail

## Load the model package
```perl
use WWW::OpenAPIClient::Object::StatDetail;
```

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **int** | The identifier for this resource. | [readonly] 
**name** | **string** | The name for this resource. | 
**game_index** | **int** | ID the games use for this stat. | 
**is_battle_only** | **boolean** | Whether this stat only exists within a battle. | [optional] 
**affecting_moves** | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [readonly] 
**affecting_natures** | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [readonly] 
**affecting_items** | [**ARRAY[ItemSummary]**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [readonly] 
**characteristics** | [**ARRAY[CharacteristicSummary]**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [readonly] 
**move_damage_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | 
**names** | [**ARRAY[StatName]**](StatName.md) | The name of this resource listed in different languages. | [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


