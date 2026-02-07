
# Table `MoveDetail`
(mapped from: MoveDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**effectChance** | effect_chance | int NOT NULL |  | **kotlin.Int** |  | 
**contestCombos** | contest_combos | long NOT NULL |  | [**MoveDetailContestCombos**](MoveDetailContestCombos.md) |  |  [foreignkey]
**contestType** | contest_type | long NOT NULL |  | [**ContestTypeSummary**](ContestTypeSummary.md) |  |  [foreignkey]
**contestEffect** | contest_effect | long NOT NULL |  | [**ContestEffectSummary**](ContestEffectSummary.md) |  |  [foreignkey]
**damageClass** | damage_class | long NOT NULL |  | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) |  |  [foreignkey]
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveChangeEffectEntriesInner&gt;**](MoveChangeEffectEntriesInner.md) |  | 
**effectChanges** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveDetailEffectChangesInner&gt;**](MoveDetailEffectChangesInner.md) |  | 
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) |  |  [foreignkey]
**meta** | meta | long NOT NULL |  | [**MoveMeta**](MoveMeta.md) |  |  [readonly] [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveName&gt;**](MoveName.md) |  | 
**pastValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveChange&gt;**](MoveChange.md) |  | 
**statChanges** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveDetailStatChangesInner&gt;**](MoveDetailStatChangesInner.md) |  | 
**superContestEffect** | super_contest_effect | long NOT NULL |  | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) |  |  [foreignkey]
**target** | target | long NOT NULL |  | [**MoveTargetSummary**](MoveTargetSummary.md) |  |  [foreignkey]
**type** | type | long NOT NULL |  | [**TypeSummary**](TypeSummary.md) |  |  [foreignkey]
**machines** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveDetailMachinesInner&gt;**](MoveDetailMachinesInner.md) |  | 
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveFlavorText&gt;**](MoveFlavorText.md) |  | 
**learnedByPokemon** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;AbilityDetailPokemonInnerPokemon&gt;**](AbilityDetailPokemonInnerPokemon.md) |  | 
**accuracy** | accuracy | int |  | **kotlin.Int** |  |  [optional]
**pp** | pp | int |  | **kotlin.Int** |  |  [optional]
**priority** | priority | int |  | **kotlin.Int** |  |  [optional]
**power** | power | int |  | **kotlin.Int** |  |  [optional]









# **Table `MoveDetailMoveChangeEffectEntriesInner`**
(mapped from: MoveDetailMoveChangeEffectEntriesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveChangeEffectEntriesInner | moveChangeEffectEntriesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDetailMoveDetailEffectChangesInner`**
(mapped from: MoveDetailMoveDetailEffectChangesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveDetailEffectChangesInner | moveDetailEffectChangesInner | long | | kotlin.Long | Foreign Key | *many*





# **Table `MoveDetailMoveName`**
(mapped from: MoveDetailMoveName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveName | moveName | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDetailMoveChange`**
(mapped from: MoveDetailMoveChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveChange | moveChange | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDetailMoveDetailStatChangesInner`**
(mapped from: MoveDetailMoveDetailStatChangesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveDetailStatChangesInner | moveDetailStatChangesInner | long | | kotlin.Long | Foreign Key | *many*






# **Table `MoveDetailMoveDetailMachinesInner`**
(mapped from: MoveDetailMoveDetailMachinesInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveDetailMachinesInner | moveDetailMachinesInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDetailMoveFlavorText`**
(mapped from: MoveDetailMoveFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveFlavorText | moveFlavorText | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDetailAbilityDetailPokemonInnerPokemon`**
(mapped from: MoveDetailAbilityDetailPokemonInnerPokemon)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
abilityDetailPokemonInnerPokemon | abilityDetailPokemonInnerPokemon | long | | kotlin.Long | Foreign Key | *many*







