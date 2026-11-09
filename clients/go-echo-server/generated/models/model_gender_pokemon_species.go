package models

type GenderPokemonSpecies struct {

	// The chance of this Pokémon being female, in eighths; or -1 for genderless.
	Rate int32 `json:"rate"`

	// A Pokémon species that can be the referenced gender.
	PokemonSpecies PokemonSpeciesSummary `json:"pokemon_species"`
}
