package models

type EncounterConditionValueDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The condition this encounter condition value pertains to.
	Condition EncounterConditionSummary `json:"condition"`

	// The name of this resource listed in different languages.
	Names []EncounterConditionValueName `json:"names"`
}
