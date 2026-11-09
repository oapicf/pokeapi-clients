
# Table `MoveTargetDetail`
(mapped from: MoveTargetDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveTargetDescription&gt;**](MoveTargetDescription.md) | The description of this resource listed in different languages. |  [readonly]
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that that are directed at this target. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveTargetName&gt;**](MoveTargetName.md) | The name of this resource listed in different languages. |  [readonly]




# **Table `MoveTargetDetailMoveTargetDescription`**
(mapped from: MoveTargetDetailMoveTargetDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveTargetDetail | moveTargetDetail | long | | kotlin.Long | Primary Key | *one*
moveTargetDescription | moveTargetDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveTargetDetailMoveSummary`**
(mapped from: MoveTargetDetailMoveSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveTargetDetail | moveTargetDetail | long | | kotlin.Long | Primary Key | *one*
moveSummary | moveSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveTargetDetailMoveTargetName`**
(mapped from: MoveTargetDetailMoveTargetName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveTargetDetail | moveTargetDetail | long | | kotlin.Long | Primary Key | *one*
moveTargetName | moveTargetName | long | | kotlin.Long | Foreign Key | *many*



