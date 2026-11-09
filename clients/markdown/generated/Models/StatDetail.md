# StatDetail
## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **id** | **Integer** | The identifier for this resource. | [default to null] |
| **name** | **String** | The name for this resource. | [default to null] |
| **game\_index** | **Integer** | ID the games use for this stat. | [default to null] |
| **is\_battle\_only** | **Boolean** | Whether this stat only exists within a battle. | [optional] [default to null] |
| **affecting\_moves** | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. | [default to null] |
| **affecting\_natures** | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. | [default to null] |
| **affecting\_items** | [**List**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. | [default to null] |
| **characteristics** | [**List**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. | [default to null] |
| **move\_damage\_class** | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | [default to null] |
| **names** | [**List**](StatName.md) | The name of this resource listed in different languages. | [default to null] |

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

