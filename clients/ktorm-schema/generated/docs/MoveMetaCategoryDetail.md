
# Table `MoveMetaCategoryDetail`
(mapped from: MoveMetaCategoryDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveMetaCategoryDescription&gt;**](MoveMetaCategoryDescription.md) | The description of this resource listed in different languages. |  [readonly]
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) | A list of moves that fall into this category. |  [readonly]




# **Table `MoveMetaCategoryDetailMoveMetaCategoryDescription`**
(mapped from: MoveMetaCategoryDetailMoveMetaCategoryDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveMetaCategoryDetail | moveMetaCategoryDetail | long | | kotlin.Long | Primary Key | *one*
moveMetaCategoryDescription | moveMetaCategoryDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveMetaCategoryDetailMoveSummary`**
(mapped from: MoveMetaCategoryDetailMoveSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveMetaCategoryDetail | moveMetaCategoryDetail | long | | kotlin.Long | Primary Key | *one*
moveSummary | moveSummary | long | | kotlin.Long | Foreign Key | *many*



