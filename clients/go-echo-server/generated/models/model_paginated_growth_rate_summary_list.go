package models

type PaginatedGrowthRateSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []GrowthRateSummary `json:"results,omitempty"`
}
