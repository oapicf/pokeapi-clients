package models

type GrowthRateDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The formula used to calculate the rate at which the Pokémon species gains level.
	Formula string `json:"formula"`

	// The descriptions of this characteristic listed in different languages.
	Descriptions []GrowthRateDescription `json:"descriptions"`

	// A list of levels and the amount of experienced needed to atain them based on this growth rate.
	Levels []Experience `json:"levels"`

	// A list of Pokémon species that gain levels at this growth rate.
	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`
}
