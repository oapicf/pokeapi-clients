
# Table `MoveBattleStyleDetail`
(mapped from: MoveBattleStyleDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveBattleStyleName&gt;**](MoveBattleStyleName.md) | The name of this resource listed in different languages. |  [readonly]




# **Table `MoveBattleStyleDetailMoveBattleStyleName`**
(mapped from: MoveBattleStyleDetailMoveBattleStyleName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveBattleStyleDetail | moveBattleStyleDetail | long | | kotlin.Long | Primary Key | *one*
moveBattleStyleName | moveBattleStyleName | long | | kotlin.Long | Foreign Key | *many*



