package models

type PaginatedPokemonFormSummaryList struct {

	Count int32 `json:"count,omitempty"`

	Next string `json:"next,omitempty"`

	Previous string `json:"previous,omitempty"`

	Results []PokemonFormSummary `json:"results,omitempty"`
}
