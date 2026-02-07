package models

type PokemonDetailTypesInner struct {

	Slot int32 `json:"slot"`

	Type AbilityDetailPokemonInnerPokemon `json:"type"`
}
