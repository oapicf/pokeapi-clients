package models

type PokemonSpeciesPalParkEncounter struct {

	// The base score given to the player when the referenced Pokémon is caught during a pal park run.
	BaseScore *int32 `json:"base_score,omitempty"`

	// The base rate for encountering the referenced Pokémon in this pal park area.
	Rate int32 `json:"rate"`

	// The pal park area where this encounter happens.
	Area PalParkAreaSummary `json:"area"`
}
