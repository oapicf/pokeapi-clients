package models

type MoveLearnMethodDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Names []MoveLearnMethodName `json:"names"`

	Descriptions []MoveLearnMethodDescription `json:"descriptions"`

	VersionGroups []AbilityDetailPokemonInnerPokemon `json:"version_groups"`
}
