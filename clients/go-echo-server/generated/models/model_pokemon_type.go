package models

type PokemonType struct {

	// The order the Pokémon's types are listed in.
	Slot int32 `json:"slot"`

	// The type the referenced Pokémon has.
	Type TypeSummary `json:"type"`
}
