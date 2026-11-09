package models

type PokemonFormSprites struct {

	// The default depiction of this Pokémon from the front in battle.
	FrontDefault *string `json:"front_default"`

	// The shiny depiction of this Pokémon from the front in battle.
	FrontShiny *string `json:"front_shiny"`

	// The female depiction of this Pokémon from the front in battle.
	FrontFemale *string `json:"front_female"`

	// The shiny female depiction of this Pokémon from the front in battle.
	FrontShinyFemale *string `json:"front_shiny_female"`

	// The default depiction of this Pokémon from the back in battle.
	BackDefault *string `json:"back_default"`

	// The shiny depiction of this Pokémon from the back in battle.
	BackShiny *string `json:"back_shiny"`

	// The female depiction of this Pokémon from the back in battle.
	BackFemale *string `json:"back_female"`

	// The shiny female depiction of this Pokémon from the back in battle.
	BackShinyFemale *string `json:"back_shiny_female"`

	// Additional sprites grouped by source, such as official artwork, HOME, and Showdown. Available keys vary by resource.
	Other PokemonSpritesOther `json:"other,omitempty"`

	// Sprites grouped by generation and game. Available keys vary by resource.
	Versions map[string]map[string]*interface{} `json:"versions,omitempty"`
}
