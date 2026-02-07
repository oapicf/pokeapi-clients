package models

type PaginatedNatureSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []NatureSummary `json:"results,omitempty"`
}
