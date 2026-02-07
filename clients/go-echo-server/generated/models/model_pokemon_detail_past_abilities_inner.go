package models

type PokemonDetailPastAbilitiesInner struct {

	Abilities []PokemonDetailAbilitiesInner `json:"abilities"`

	Generation AbilityDetailPokemonInnerPokemon `json:"generation"`
}
