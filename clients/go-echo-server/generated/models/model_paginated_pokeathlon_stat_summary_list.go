package models

type PaginatedPokeathlonStatSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []PokeathlonStatSummary `json:"results,omitempty"`
}
