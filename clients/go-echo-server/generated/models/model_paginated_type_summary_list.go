package models

type PaginatedTypeSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []TypeSummary `json:"results,omitempty"`
}
