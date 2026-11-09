package models

type PokemonSpritesOtherShowdown struct {

	// The URL of the default Pokémon Showdown front image, or null if unavailable.
	FrontDefault *string `json:"front_default"`

	// The URL of the female Pokémon Showdown front image, or null if unavailable.
	FrontFemale *string `json:"front_female"`

	// The URL of the shiny Pokémon Showdown front image, or null if unavailable.
	FrontShiny *string `json:"front_shiny"`

	// The URL of the shiny female Pokémon Showdown front image, or null if unavailable.
	FrontShinyFemale *string `json:"front_shiny_female"`

	// The URL of the default Pokémon Showdown back image, or null if unavailable.
	BackDefault *string `json:"back_default"`

	// The URL of the female Pokémon Showdown back image, or null if unavailable.
	BackFemale *string `json:"back_female"`

	// The URL of the shiny Pokémon Showdown back image, or null if unavailable.
	BackShiny *string `json:"back_shiny"`

	// The URL of the shiny female Pokémon Showdown back image, or null if unavailable.
	BackShinyFemale *string `json:"back_shiny_female"`
}
