package models

type PaginatedEncounterConditionValueSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []EncounterConditionValueSummary `json:"results,omitempty"`
}
