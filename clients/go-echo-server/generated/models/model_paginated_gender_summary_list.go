package models

type PaginatedGenderSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []GenderSummary `json:"results,omitempty"`
}
