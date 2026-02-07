package models

type GenerationDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Abilities []AbilitySummary `json:"abilities"`

	MainRegion RegionSummary `json:"main_region"`

	Moves []MoveSummary `json:"moves"`

	Names []GenerationName `json:"names"`

	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`

	Types []TypeSummary `json:"types"`

	VersionGroups []VersionGroupSummary `json:"version_groups"`
}
