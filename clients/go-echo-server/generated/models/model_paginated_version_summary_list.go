package models

type PaginatedVersionSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []VersionSummary `json:"results,omitempty"`
}
