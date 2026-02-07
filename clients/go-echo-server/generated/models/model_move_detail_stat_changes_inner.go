package models

type MoveDetailStatChangesInner struct {

	Change int32 `json:"change"`

	Stat AbilityDetailPokemonInnerPokemon `json:"stat"`
}
