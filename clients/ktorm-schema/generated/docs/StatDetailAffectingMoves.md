
# Table `StatDetail_affecting_moves`
(mapped from: StatDetailAffectingMoves)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**increase** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;StatDetailAffectingMovesIncreaseInner&gt;**](StatDetailAffectingMovesIncreaseInner.md) |  | 
**decrease** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;StatDetailAffectingMovesIncreaseInner&gt;**](StatDetailAffectingMovesIncreaseInner.md) |  | 


# **Table `StatDetailAffectingMovesStatDetailAffectingMovesIncreaseInner`**
(mapped from: StatDetailAffectingMovesStatDetailAffectingMovesIncreaseInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
statDetailAffectingMoves | statDetailAffectingMoves | long | | kotlin.Long | Primary Key | *one*
statDetailAffectingMovesIncreaseInner | statDetailAffectingMovesIncreaseInner | long | | kotlin.Long | Foreign Key | *many*



# **Table `StatDetailAffectingMovesStatDetailAffectingMovesIncreaseInner`**
(mapped from: StatDetailAffectingMovesStatDetailAffectingMovesIncreaseInner)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
statDetailAffectingMoves | statDetailAffectingMoves | long | | kotlin.Long | Primary Key | *one*
statDetailAffectingMovesIncreaseInner | statDetailAffectingMovesIncreaseInner | long | | kotlin.Long | Foreign Key | *many*



