
# Table `StatAffectingMoves`
(mapped from: StatAffectingMoves)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**increase** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveStatChange&gt;**](MoveStatChange.md) | A list of moves and how they change the referenced stat. | 
**decrease** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveStatChange&gt;**](MoveStatChange.md) | A list of moves and how they change the referenced stat. | 


# **Table `StatAffectingMovesMoveStatChange`**
(mapped from: StatAffectingMovesMoveStatChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
statAffectingMoves | statAffectingMoves | long | | kotlin.Long | Primary Key | *one*
moveStatChange | moveStatChange | long | | kotlin.Long | Foreign Key | *many*



# **Table `StatAffectingMovesMoveStatChange`**
(mapped from: StatAffectingMovesMoveStatChange)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
statAffectingMoves | statAffectingMoves | long | | kotlin.Long | Primary Key | *one*
moveStatChange | moveStatChange | long | | kotlin.Long | Foreign Key | *many*



