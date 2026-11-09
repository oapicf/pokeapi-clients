package models

type TypePokemon struct {

	// The order the Pokémon's types are listed in.
	Slot int32 `json:"slot"`

	// The Pokémon that has the referenced type.
	Pokemon PokemonSummary `json:"pokemon"`
}
