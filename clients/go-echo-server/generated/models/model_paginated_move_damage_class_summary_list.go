package models

type PaginatedMoveDamageClassSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []MoveDamageClassSummary `json:"results,omitempty"`
}
