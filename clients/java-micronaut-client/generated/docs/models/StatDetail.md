

# StatDetail

The class is defined in **[StatDetail.java](../../src/main/java/org/openapitools/model/StatDetail.java)**

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | `Integer` | The identifier for this resource. |  [readonly property]
**name** | `String` | The name for this resource. | 
**gameIndex** | `Integer` | ID the games use for this stat. | 
**isBattleOnly** | `Boolean` | Whether this stat only exists within a battle. |  [optional property]
**affectingMoves** | [`StatAffectingMoves`](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. |  [readonly property]
**affectingNatures** | [`StatAffectingNatures`](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. |  [readonly property]
**affectingItems** | [`List&lt;ItemSummary&gt;`](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. |  [readonly property]
**characteristics** | [`List&lt;CharacteristicSummary&gt;`](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. |  [readonly property]
**moveDamageClass** | [`MoveDamageClassSummary`](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. | 
**names** | [`List&lt;StatName&gt;`](StatName.md) | The name of this resource listed in different languages. |  [readonly property]












