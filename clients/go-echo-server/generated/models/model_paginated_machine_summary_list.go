package models

type PaginatedMachineSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []MachineSummary `json:"results,omitempty"`
}
