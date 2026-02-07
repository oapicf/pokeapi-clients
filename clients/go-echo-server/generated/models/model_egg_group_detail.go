package models

type EggGroupDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Names []EggGroupName `json:"names"`

	PokemonSpecies []EggGroupDetailPokemonSpeciesInner `json:"pokemon_species"`
}
