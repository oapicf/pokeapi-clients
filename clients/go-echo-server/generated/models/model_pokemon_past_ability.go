package models

type PokemonPastAbility struct {

	// The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
	Abilities []PokemonAbilityPast `json:"abilities"`

	// The last generation in which the referenced pokémon had the listed abilities.
	Generation GenerationSummary `json:"generation"`
}
