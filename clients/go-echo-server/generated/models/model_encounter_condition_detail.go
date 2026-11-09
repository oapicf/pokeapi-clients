package models

type EncounterConditionDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A list of possible values for this encounter condition.
	Values []EncounterConditionValueSummary `json:"values"`

	// The name of this resource listed in different languages.
	Names []EncounterConditionName `json:"names"`
}
