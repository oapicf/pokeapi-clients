package models

type PokemonSpritesOtherDreamWorld struct {

	// The URL of the default Pokémon Dream World front image, or null if unavailable.
	FrontDefault *string `json:"front_default"`

	// The URL of the female Pokémon Dream World front image, or null if unavailable.
	FrontFemale *string `json:"front_female"`
}
