
# Table `MoveLearnMethodDetail`
(mapped from: MoveLearnMethodDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveLearnMethodName&gt;**](MoveLearnMethodName.md) |  | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveLearnMethodDescription&gt;**](MoveLearnMethodDescription.md) |  | 
**versionGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 




# **Table `MoveLearnMethodDetailMoveLearnMethodName`**
(mapped from: MoveLearnMethodDetailMoveLearnMethodName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveLearnMethodDetail | moveLearnMethodDetail | long | | kotlin.Long | Primary Key | *one*
moveLearnMethodName | moveLearnMethodName | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveLearnMethodDetailMoveLearnMethodDescription`**
(mapped from: MoveLearnMethodDetailMoveLearnMethodDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveLearnMethodDetail | moveLearnMethodDetail | long | | kotlin.Long | Primary Key | *one*
moveLearnMethodDescription | moveLearnMethodDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveLearnMethodDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: MoveLearnMethodDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveLearnMethodDetail | moveLearnMethodDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*



