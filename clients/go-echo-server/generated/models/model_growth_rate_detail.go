package models

type GrowthRateDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Formula string `json:"formula"`

	Descriptions []GrowthRateDescription `json:"descriptions"`

	Levels []Experience `json:"levels"`

	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`
}
