
# Table `MoveMetaAilmentDetail`
(mapped from: MoveMetaAilmentDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that cause this ailment. |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveMetaAilmentName&gt;**](MoveMetaAilmentName.md) | The name of this resource listed in different languages. |  [readonly]




# **Table `MoveMetaAilmentDetailMoveSummary`**
(mapped from: MoveMetaAilmentDetailMoveSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveMetaAilmentDetail | moveMetaAilmentDetail | long | | kotlin.Long | Primary Key | *one*
moveSummary | moveSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveMetaAilmentDetailMoveMetaAilmentName`**
(mapped from: MoveMetaAilmentDetailMoveMetaAilmentName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveMetaAilmentDetail | moveMetaAilmentDetail | long | | kotlin.Long | Primary Key | *one*
moveMetaAilmentName | moveMetaAilmentName | long | | kotlin.Long | Foreign Key | *many*



