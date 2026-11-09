package models

type PokemonSpritesOtherOfficialArtwork struct {

	// The URL of the default front official artwork, or null if unavailable.
	FrontDefault *string `json:"front_default"`

	// The URL of the shiny front official artwork, or null if unavailable.
	FrontShiny *string `json:"front_shiny"`

	// Additional official artwork grouped by version. Available keys vary by resource.
	Versions map[string]map[string]*interface{} `json:"versions,omitempty"`
}
