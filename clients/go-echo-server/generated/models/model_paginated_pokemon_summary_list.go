package models

type PaginatedPokemonSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []PokemonSummary `json:"results,omitempty"`
}
