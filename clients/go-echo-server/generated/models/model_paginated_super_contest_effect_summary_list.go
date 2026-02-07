package models

type PaginatedSuperContestEffectSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []SuperContestEffectSummary `json:"results,omitempty"`
}
