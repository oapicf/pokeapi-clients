package models

type PalParkEncounter struct {

	// The base score given to the player when this Pokémon is caught during a pal park run.
	BaseScore *int32 `json:"base_score,omitempty"`

	// The base rate for encountering this Pokémon in this pal park area.
	Rate int32 `json:"rate"`

	// The Pokémon species being encountered.
	PokemonSpecies PokemonSpeciesSummary `json:"pokemon_species"`
}
