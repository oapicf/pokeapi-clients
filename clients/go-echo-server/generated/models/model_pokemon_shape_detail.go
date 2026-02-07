package models

type PokemonShapeDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	AwesomeNames []PokemonShapeDetailAwesomeNamesInner `json:"awesome_names"`

	Names []PokemonShapeDetailNamesInner `json:"names"`

	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`
}
