package models

type PokemonPastStat struct {

	// The last generation in which the referenced pokémon had the listed stats.
	Generation GenerationSummary `json:"generation"`

	// The stat the Pokémon had up to and including the listed generation.
	Stats []PokemonStat `json:"stats"`
}
