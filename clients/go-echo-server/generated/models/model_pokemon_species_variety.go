package models

type PokemonSpeciesVariety struct {

	// Whether this variety is the default variety.
	IsDefault bool `json:"is_default"`

	// The Pokémon variety.
	Pokemon PokemonSummary `json:"pokemon"`
}
