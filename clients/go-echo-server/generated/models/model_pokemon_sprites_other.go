package models

type PokemonSpritesOther struct {

	// Pokémon Dream World artwork URLs.
	DreamWorld PokemonSpritesOtherDreamWorld `json:"dream_world,omitempty"`

	// Pokémon HOME sprite URLs.
	Home PokemonSpritesOtherHome `json:"home,omitempty"`

	// Pokémon Showdown sprite URLs.
	Showdown PokemonSpritesOtherShowdown `json:"showdown,omitempty"`

	// Official Pokémon artwork URLs, including shiny artwork and version-specific variants.
	OfficialArtwork PokemonSpritesOtherOfficialArtwork `json:"official-artwork,omitempty"`
}
