package models

type PaginatedEggGroupSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []EggGroupSummary `json:"results,omitempty"`
}
