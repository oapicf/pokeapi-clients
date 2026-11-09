package models

type PokemonFormType struct {

	// The order the Pokémon's types are listed in.
	Slot int32 `json:"slot"`

	// The type the referenced Form has.
	Type TypeSummary `json:"type"`
}
