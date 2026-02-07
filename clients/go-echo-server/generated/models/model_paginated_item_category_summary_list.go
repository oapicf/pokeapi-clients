package models

type PaginatedItemCategorySummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []ItemCategorySummary `json:"results,omitempty"`
}
