package models

type PaginatedContestTypeSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []ContestTypeSummary `json:"results,omitempty"`
}
