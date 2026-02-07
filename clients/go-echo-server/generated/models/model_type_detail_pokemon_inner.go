package models

type TypeDetailPokemonInner struct {

	Slot int32 `json:"slot,omitempty"`

	Pokemon TypeDetailPokemonInnerPokemon `json:"pokemon,omitempty"`
}
