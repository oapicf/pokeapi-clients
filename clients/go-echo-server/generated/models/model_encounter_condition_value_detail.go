package models

type EncounterConditionValueDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Condition EncounterConditionSummary `json:"condition"`

	Names []EncounterConditionValueName `json:"names"`
}
