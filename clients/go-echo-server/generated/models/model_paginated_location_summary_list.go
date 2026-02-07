package models

type PaginatedLocationSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []LocationSummary `json:"results,omitempty"`
}
