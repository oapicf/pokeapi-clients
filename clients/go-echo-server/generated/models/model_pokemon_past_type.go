package models

type PokemonPastType struct {

	// The last generation in which the referenced pokémon had the listed types.
	Generation GenerationSummary `json:"generation"`

	// The types the referenced pokémon had up to and including the listed generation.
	Types []PokemonType `json:"types"`
}
