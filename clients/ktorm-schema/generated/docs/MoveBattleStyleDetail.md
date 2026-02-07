
# Table `MoveBattleStyleDetail`
(mapped from: MoveBattleStyleDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveBattleStyleName&gt;**](MoveBattleStyleName.md) |  | 




# **Table `MoveBattleStyleDetailMoveBattleStyleName`**
(mapped from: MoveBattleStyleDetailMoveBattleStyleName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveBattleStyleDetail | moveBattleStyleDetail | long | | kotlin.Long | Primary Key | *one*
moveBattleStyleName | moveBattleStyleName | long | | kotlin.Long | Foreign Key | *many*



