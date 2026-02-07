package models

type StatDetailAffectingMovesIncreaseInner struct {

	Change int32 `json:"change"`

	Move AbilityDetailPokemonInnerPokemon `json:"move"`
}
