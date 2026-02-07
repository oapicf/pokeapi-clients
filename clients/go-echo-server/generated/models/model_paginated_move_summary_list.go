package models

type PaginatedMoveSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []MoveSummary `json:"results,omitempty"`
}
