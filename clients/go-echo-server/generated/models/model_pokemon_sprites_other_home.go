package models

type PokemonSpritesOtherHome struct {

	// The URL of the default Pokémon HOME front image, or null if unavailable.
	FrontDefault *string `json:"front_default"`

	// The URL of the female Pokémon HOME front image, or null if unavailable.
	FrontFemale *string `json:"front_female"`

	// The URL of the shiny Pokémon HOME front image, or null if unavailable.
	FrontShiny *string `json:"front_shiny"`

	// The URL of the shiny female Pokémon HOME front image, or null if unavailable.
	FrontShinyFemale *string `json:"front_shiny_female"`
}
