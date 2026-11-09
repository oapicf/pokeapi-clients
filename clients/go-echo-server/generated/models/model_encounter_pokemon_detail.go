package models

type EncounterPokemonDetail struct {

	// The minimum number of perfect IVs, or null if unspecified.
	MinPerfectIvs *int32 `json:"min_perfect_ivs,omitempty"`

	// Whether the encountered Pokémon is always shiny.
	AlwaysShiny bool `json:"always_shiny,omitempty"`

	// Whether the encountered Pokémon can never be shiny.
	NeverShiny bool `json:"never_shiny,omitempty"`

	// Whether the encountered Pokémon is an alpha Pokémon.
	IsAlpha bool `json:"is_alpha,omitempty"`
}
