package models

type PaginatedEncounterConditionSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []EncounterConditionSummary `json:"results,omitempty"`
}
