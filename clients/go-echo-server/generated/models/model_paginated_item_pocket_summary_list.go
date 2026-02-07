package models

type PaginatedItemPocketSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []ItemPocketSummary `json:"results,omitempty"`
}
