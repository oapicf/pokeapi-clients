package models

type PaginatedItemFlingEffectSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []ItemFlingEffectSummary `json:"results,omitempty"`
}
