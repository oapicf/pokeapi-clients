# EvolutionVariableDetail


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**`id`** | **`Int64`** | The identifier for this resource. | [readonly] [default to nothing]
**`name`** | **`String`** | The name for this resource. | [default to nothing]
**`symbol`** | **`String`** | The symbol used for this variable in evolution condition expressions. | [default to nothing]
**`data_type`** | **`String`** | The data type of this variable. | [optional] [default to nothing]
**`source`** | **`String`** | The source of the variable value. | [optional] [default to nothing]
**`version_group`** | [**`*VersionGroupSummary`**](VersionGroupSummary.md) | The version group in which this variable was introduced. | [default to nothing]
**`names`** | [**`Vector{EvolutionVariableName}`**](EvolutionVariableName.md) | The name of this resource listed in different languages. | [readonly] [default to nothing]
**`descriptions`** | [**`Vector{EvolutionVariableDescription}`**](EvolutionVariableDescription.md) | The description of this resource listed in different languages. | [readonly] [default to nothing]


[[Back to Model list]](../README.md#models) [[Back to API list]](../README.md#api-endpoints) [[Back to README]](../README.md)


