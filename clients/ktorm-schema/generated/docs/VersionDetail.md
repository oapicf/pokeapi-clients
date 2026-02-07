
# Table `VersionDetail`
(mapped from: VersionDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** |  |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** |  | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VersionName&gt;**](VersionName.md) |  | 
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) |  |  [foreignkey]




# **Table `VersionDetailVersionName`**
(mapped from: VersionDetailVersionName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionDetail | versionDetail | long | | kotlin.Long | Primary Key | *one*
versionName | versionName | long | | kotlin.Long | Foreign Key | *many*




