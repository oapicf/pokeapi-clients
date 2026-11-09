package models

type PokemonCries struct {

	// The latest depiction of this Pokémon's cry.
	Latest *string `json:"latest"`

	// The legacy depiction of this Pokémon's cry.
	Legacy *string `json:"legacy"`
}
