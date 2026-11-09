
# Table `MoveDetail`
(mapped from: MoveDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**effectChance** | effect_chance | int NOT NULL |  | **kotlin.Int** | The percent value of how likely it is this moves effect will happen. | 
**contestCombos** | contest_combos | long NOT NULL |  | [**MoveCombos**](MoveCombos.md) | A detail of normal and super contest combos that require this move. |  [readonly] [foreignkey]
**contestType** | contest_type | long NOT NULL |  | [**ContestTypeSummary**](ContestTypeSummary.md) | The type of appeal this move gives a Pokémon when used in a contest. |  [foreignkey]
**contestEffect** | contest_effect | long NOT NULL |  | [**ContestEffectSummary**](ContestEffectSummary.md) | The effect the move has when used in a contest. |  [foreignkey]
**damageClass** | damage_class | long NOT NULL |  | [**MoveDamageClassSummary**](MoveDamageClassSummary.md) | The type of damage the move inflicts on the target, e.g. physical. |  [foreignkey]
**effectEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveEffectEffectText&gt;**](MoveEffectEffectText.md) | The effect of this move listed in different languages. |  [readonly]
**effectChanges** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveEffectChange&gt;**](MoveEffectChange.md) | The list of previous effects this move has had across version groups of the games. |  [readonly]
**generation** | generation | long NOT NULL |  | [**GenerationSummary**](GenerationSummary.md) | The generation in which this move was introduced. |  [foreignkey]
**meta** | meta | long NOT NULL |  | [**MoveMeta**](MoveMeta.md) | Metadata about this move |  [readonly] [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveName&gt;**](MoveName.md) | The name of this resource listed in different languages. |  [readonly]
**pastValues** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveChange&gt;**](MoveChange.md) | A list of move resource value changes across version groups of the game. |  [readonly]
**statChanges** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveMetaStatChange&gt;**](MoveMetaStatChange.md) | A list of stats this moves effects and how much it effects them. |  [readonly]
**superContestEffect** | super_contest_effect | long NOT NULL |  | [**SuperContestEffectSummary**](SuperContestEffectSummary.md) | The effect the move has when used in a super contest. |  [foreignkey]
**target** | target | long NOT NULL |  | [**MoveTargetSummary**](MoveTargetSummary.md) | The type of target that will receive the effects of the attack. |  [foreignkey]
**type** | type | long NOT NULL |  | [**TypeSummary**](TypeSummary.md) | The elemental type of this move. |  [foreignkey]
**machines** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;ItemMachine&gt;**](ItemMachine.md) | A list of the machines that teach this move. |  [readonly]
**flavorTextEntries** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveFlavorText&gt;**](MoveFlavorText.md) | The flavor text of this move listed in different languages. |  [readonly]
**learnedByPokemon** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;PokemonSummary&gt;**](PokemonSummary.md) | List of Pokemon that can learn the move |  [readonly]
**accuracy** | accuracy | int |  | **kotlin.Int** | The percent value of how likely this move is to be successful. |  [optional]
**pp** | pp | int |  | **kotlin.Int** | Power points. The number of times this move can be used. |  [optional]
**priority** | priority | int |  | **kotlin.Int** | A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail. |  [optional]
**power** | power | int |  | **kotlin.Int** | The base power of this move, or null if it has no fixed base power. |  [optional]









# **Table `MoveDetailMoveEffectEffectText`**
(mapped from: MoveDetailMoveEffectEffectText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveEffectEffectText | moveEffectEffectText | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDetailMoveEffectChange`**
(mapped from: MoveDetailMoveEffectChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveEffectChange | moveEffectChange | long | | kotlin.Long | Foreign Key | *many*





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



# **Table `MoveDetailMoveMetaStatChange`**
(mapped from: MoveDetailMoveMetaStatChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveMetaStatChange | moveMetaStatChange | long | | kotlin.Long | Foreign Key | *many*






# **Table `MoveDetailItemMachine`**
(mapped from: MoveDetailItemMachine)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
itemMachine | itemMachine | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDetailMoveFlavorText`**
(mapped from: MoveDetailMoveFlavorText)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
moveFlavorText | moveFlavorText | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDetailPokemonSummary`**
(mapped from: MoveDetailPokemonSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDetail | moveDetail | long | | kotlin.Long | Primary Key | *one*
pokemonSummary | pokemonSummary | long | | kotlin.Long | Foreign Key | *many*







