
# Table `StatDetail`
(mapped from: StatDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**gameIndex** | game_index | int NOT NULL |  | **kotlin.Int** | ID the games use for this stat. | 
**affectingMoves** | affecting_moves | long NOT NULL |  | [**StatAffectingMoves**](StatAffectingMoves.md) | A detail of moves which affect this stat positively or negatively. |  [readonly] [foreignkey]
**affectingNatures** | affecting_natures | long NOT NULL |  | [**StatAffectingNatures**](StatAffectingNatures.md) | A detail of natures which affect this stat positively or negatively. |  [readonly] [foreignkey]
**affectingItems** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemSummary&gt;**](ItemSummary.md) | Items that affect this stat, such as vitamins and battle items. |  [readonly]
**characteristics** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CharacteristicSummary&gt;**](CharacteristicSummary.md) | A list of characteristics that are set on a Pokémon when its highest base stat is this stat. |  [readonly]
**moveDamageClass** | move_damage_class | long NOT NULL |  | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The class of damage this stat is directly related to. |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;StatName&gt;**](StatName.md) | The name of this resource listed in different languages. |  [readonly]
**isBattleOnly** | is_battle_only | boolean |  | **kotlin.Boolean** | Whether this stat only exists within a battle. |  [optional]







# **Table `StatDetailItemSummary`**
(mapped from: StatDetailItemSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
statDetail | statDetail | long | | kotlin.Long | Primary Key | *one*
itemSummary | itemSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `StatDetailCharacteristicSummary`**
(mapped from: StatDetailCharacteristicSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
statDetail | statDetail | long | | kotlin.Long | Primary Key | *one*
characteristicSummary | characteristicSummary | long | | kotlin.Long | Foreign Key | *many*




# **Table `StatDetailStatName`**
(mapped from: StatDetailStatName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
statDetail | statDetail | long | | kotlin.Long | Primary Key | *one*
statName | statName | long | | kotlin.Long | Foreign Key | *many*




