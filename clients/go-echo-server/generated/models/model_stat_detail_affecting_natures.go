package models

type StatDetailAffectingNatures struct {

	Increase []AbilityDetailPokemonInnerPokemon `json:"increase"`

	Decrease []AbilityDetailPokemonInnerPokemon `json:"decrease"`
}
