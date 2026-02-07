package models

type PaginatedItemAttributeSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []ItemAttributeSummary `json:"results,omitempty"`
}
