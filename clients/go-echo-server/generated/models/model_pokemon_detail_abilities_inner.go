package models

type PokemonDetailAbilitiesInner struct {

	Ability AbilityDetailPokemonInnerPokemon `json:"ability"`

	IsHidden bool `json:"is_hidden"`

	Slot int32 `json:"slot"`
}
