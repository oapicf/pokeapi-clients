
# Table `MoveLearnMethodDetail`
(mapped from: MoveLearnMethodDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveLearnMethodName&gt;**](MoveLearnMethodName.md) | The name of this resource listed in different languages. |  [readonly]
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;MoveLearnMethodDescription&gt;**](MoveLearnMethodDescription.md) | The description of this resource listed in different languages. |  [readonly]
**versionGroups** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VersionGroupSummary&gt;**](VersionGroupSummary.md) | A list of version groups where moves can be learned through this method. |  [readonly]




# **Table `MoveLearnMethodDetailMoveLearnMethodName`**
(mapped from: MoveLearnMethodDetailMoveLearnMethodName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveLearnMethodDetail | moveLearnMethodDetail | long | | kotlin.Long | Primary Key | *one*
moveLearnMethodName | moveLearnMethodName | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveLearnMethodDetailMoveLearnMethodDescription`**
(mapped from: MoveLearnMethodDetailMoveLearnMethodDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveLearnMethodDetail | moveLearnMethodDetail | long | | kotlin.Long | Primary Key | *one*
moveLearnMethodDescription | moveLearnMethodDescription | long | | kotlin.Long | Foreign Key | *many*



# **Table `MoveLearnMethodDetailVersionGroupSummary`**
(mapped from: MoveLearnMethodDetailVersionGroupSummary)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
moveLearnMethodDetail | moveLearnMethodDetail | long | | kotlin.Long | Primary Key | *one*
versionGroupSummary | versionGroupSummary | long | | kotlin.Long | Foreign Key | *many*



