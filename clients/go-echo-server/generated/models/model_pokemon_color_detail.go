package models

type PokemonColorDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Names []PokemonColorName `json:"names"`

	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`
}
