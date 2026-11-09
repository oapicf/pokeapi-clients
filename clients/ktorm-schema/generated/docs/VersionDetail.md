
# Table `VersionDetail`
(mapped from: VersionDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;VersionName&gt;**](VersionName.md) | The name of this resource listed in different languages. |  [readonly]
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group this version belongs to. |  [foreignkey]




# **Table `VersionDetailVersionName`**
(mapped from: VersionDetailVersionName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
versionDetail | versionDetail | long | | kotlin.Long | Primary Key | *one*
versionName | versionName | long | | kotlin.Long | Foreign Key | *many*




