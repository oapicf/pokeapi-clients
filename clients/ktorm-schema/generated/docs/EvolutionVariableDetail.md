
# Table `EvolutionVariableDetail`
(mapped from: EvolutionVariableDetail)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**id** | id | int NOT NULL PRIMARY KEY AUTOINCREMENT |  | **kotlin.Int** | The identifier for this resource. |  [readonly]
**name** | name | text NOT NULL |  | **kotlin.String** | The name for this resource. | 
**symbol** | symbol | text NOT NULL |  | **kotlin.String** | The symbol used for this variable in evolution condition expressions. | 
**versionGroup** | version_group | long NOT NULL |  | [**VersionGroupSummary**](VersionGroupSummary.md) | The version group in which this variable was introduced. |  [foreignkey]
**names** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EvolutionVariableName&gt;**](EvolutionVariableName.md) | The name of this resource listed in different languages. |  [readonly]
**descriptions** | `One-To-Many` | `----` | `----`  | [**kotlin.Array&lt;EvolutionVariableDescription&gt;**](EvolutionVariableDescription.md) | The description of this resource listed in different languages. |  [readonly]
**dataType** | data_type | text |  | **kotlin.String** | The data type of this variable. |  [optional]
**source** | source | text |  | **kotlin.String** | The source of the variable value. |  [optional]






# **Table `EvolutionVariableDetailEvolutionVariableName`**
(mapped from: EvolutionVariableDetailEvolutionVariableName)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionVariableDetail | evolutionVariableDetail | long | | kotlin.Long | Primary Key | *one*
evolutionVariableName | evolutionVariableName | long | | kotlin.Long | Foreign Key | *many*



# **Table `EvolutionVariableDetailEvolutionVariableDescription`**
(mapped from: EvolutionVariableDetailEvolutionVariableDescription)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
evolutionVariableDetail | evolutionVariableDetail | long | | kotlin.Long | Primary Key | *one*
evolutionVariableDescription | evolutionVariableDescription | long | | kotlin.Long | Foreign Key | *many*





