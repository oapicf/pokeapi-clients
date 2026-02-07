package models

type MoveDetailContestCombosNormal struct {

	UseBefore []AbilityDetailPokemonInnerPokemon `json:"use_before"`

	UseAfter []AbilityDetailPokemonInnerPokemon `json:"use_after"`
}
