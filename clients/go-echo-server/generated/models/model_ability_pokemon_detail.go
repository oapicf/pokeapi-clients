package models

type AbilityPokemonDetail struct {

	// Whether or not this a hidden ability for the referenced Pokémon.
	IsHidden bool `json:"is_hidden,omitempty"`

	// Pokémon have 3 ability 'slots' which hold references to possible abilities they could have. This is the slot of this ability for the referenced pokemon.
	Slot int32 `json:"slot"`

	// The Pokémon this ability could belong to.
	Pokemon PokemonSummary `json:"pokemon"`
}
