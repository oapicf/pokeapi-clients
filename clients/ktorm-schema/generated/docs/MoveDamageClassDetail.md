
# Table `MoveDamageClassDetail`
(mapped from: MoveDamageClassDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveDamageClassDescription&gt;**](MoveDamageClassDescription.md) |  |  [readonly]
**moves** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveSummary&gt;**](MoveSummary.md) |  |  [readonly]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveDamageClassName&gt;**](MoveDamageClassName.md) |  |  [readonly]




# **Table `MoveDamageClassDetailMoveDamageClassDescription`**
(mapped from: MoveDamageClassDetailMoveDamageClassDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDamageClassDetail | moveDamageClassDetail | long | | kotlin.Long | Primary Key | *one*
moveDamageClassDescription | moveDamageClassDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDamageClassDetailMoveSummary`**
(mapped from: MoveDamageClassDetailMoveSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDamageClassDetail | moveDamageClassDetail | long | | kotlin.Long | Primary Key | *one*
moveSummary | moveSummary | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveDamageClassDetailMoveDamageClassName`**
(mapped from: MoveDamageClassDetailMoveDamageClassName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveDamageClassDetail | moveDamageClassDetail | long | | kotlin.Long | Primary Key | *one*
moveDamageClassName | moveDamageClassName | long | | kotlin.Long | Foreign Key | *many*



