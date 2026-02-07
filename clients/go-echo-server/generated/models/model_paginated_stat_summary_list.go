package models

type PaginatedStatSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []StatSummary `json:"results,omitempty"`
}
