package models

type EncounterConditionDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Values []EncounterConditionValueSummary `json:"values"`

	Names []EncounterConditionName `json:"names"`
}
