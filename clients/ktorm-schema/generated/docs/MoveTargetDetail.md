
# Table `MoveTargetDetail`
(mapped from: MoveTargetDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveTargetDescription&gt;**](MoveTargetDescription.md) |  | 
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveTargetName&gt;**](MoveTargetName.md) |  | 




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



