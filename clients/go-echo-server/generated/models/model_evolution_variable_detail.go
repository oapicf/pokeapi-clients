package models

type EvolutionVariableDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The symbol used for this variable in evolution condition expressions.
	Symbol string `json:"symbol"`

	// The data type of this variable.
	DataType string `json:"data_type,omitempty"`

	// The source of the variable value.
	Source string `json:"source,omitempty"`

	// The version group in which this variable was introduced.
	VersionGroup VersionGroupSummary `json:"version_group"`

	// The name of this resource listed in different languages.
	Names []EvolutionVariableName `json:"names"`

	// The description of this resource listed in different languages.
	Descriptions []EvolutionVariableDescription `json:"descriptions"`
}
