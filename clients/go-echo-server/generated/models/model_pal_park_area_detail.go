package models

type PalParkAreaDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Names []PalParkAreaName `json:"names"`

	PokemonEncounters []PalParkAreaDetailPokemonEncountersInner `json:"pokemon_encounters"`
}
