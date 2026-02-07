package models

type MoveMetaAilmentDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Moves []AbilityDetailPokemonInnerPokemon `json:"moves"`

	Names []MoveMetaAilmentName `json:"names"`
}
