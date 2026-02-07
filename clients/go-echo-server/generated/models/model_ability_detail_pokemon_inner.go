package models

type AbilityDetailPokemonInner struct {

	IsHidden bool `json:"is_hidden"`

	Slot int32 `json:"slot"`

	Pokemon AbilityDetailPokemonInnerPokemon `json:"pokemon"`
}
