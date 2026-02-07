package models

type PaginatedBerrySummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []BerrySummary `json:"results,omitempty"`
}
