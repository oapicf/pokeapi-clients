package models

type PaginatedRegionSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []RegionSummary `json:"results,omitempty"`
}
