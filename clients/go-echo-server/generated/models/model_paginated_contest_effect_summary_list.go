package models

type PaginatedContestEffectSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []ContestEffectSummary `json:"results,omitempty"`
}
