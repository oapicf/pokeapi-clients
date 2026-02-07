package models

type PokemonHabitatDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Names []PokemonHabitatName `json:"names"`

	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`
}
