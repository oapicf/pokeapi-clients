package models

type PokemonAbility struct {

	// Whether or not this is a hidden ability.
	IsHidden bool `json:"is_hidden,omitempty"`

	// The slot this ability occupies in this Pokémon species.
	Slot int32 `json:"slot"`

	// The ability the Pokémon may have.
	Ability AbilitySummary `json:"ability"`
}
