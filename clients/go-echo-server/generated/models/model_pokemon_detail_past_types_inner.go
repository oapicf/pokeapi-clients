package models

type PokemonDetailPastTypesInner struct {

	Generation AbilityDetailPokemonInnerPokemon `json:"generation"`

	Types []PokemonDetailTypesInner `json:"types"`
}
