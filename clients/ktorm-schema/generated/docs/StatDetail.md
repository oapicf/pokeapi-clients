
# Table `StatDetail`
(mapped from: StatDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**gameIndex** | game_index | int NOT NULL |  | **kotlin.Int** |  | 
**affectingMoves** | affecting_moves | long NOT NULL |  | [**StatDetailAffectingMoves**](StatDetailAffectingMoves.md) |  |  [foreignkey]
**affectingNatures** | affecting_natures | long NOT NULL |  | [**StatDetailAffectingNatures**](StatDetailAffectingNatures.md) |  |  [foreignkey]
**characteristics** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;CharacteristicSummary&gt;**](CharacteristicSummary.md) |  | 
**moveDamageClass** | move_damage_class | long NOT NULL |  | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;StatName&gt;**](StatName.md) |  | 
**isBattleOnly** | is_battle_only | boolean |  | **kotlin.Boolean** |  |  [optional]







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




