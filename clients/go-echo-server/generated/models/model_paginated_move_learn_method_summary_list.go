package models

type PaginatedMoveLearnMethodSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []MoveLearnMethodSummary `json:"results,omitempty"`
}
