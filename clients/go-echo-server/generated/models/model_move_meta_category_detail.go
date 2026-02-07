package models

type MoveMetaCategoryDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Descriptions []MoveMetaCategoryDescription `json:"descriptions"`

	Moves []AbilityDetailPokemonInnerPokemon `json:"moves"`
}
