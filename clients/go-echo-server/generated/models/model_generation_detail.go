package models

type GenerationDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A list of abilities that were introduced in this generation.
	Abilities []AbilitySummary `json:"abilities"`

	// The main region travelled in this generation.
	MainRegion RegionSummary `json:"main_region"`

	// A list of moves that were introduced in this generation.
	Moves []MoveSummary `json:"moves"`

	// The name of this resource listed in different languages.
	Names []GenerationName `json:"names"`

	// A list of Pokémon species that were introduced in this generation.
	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`

	// A list of types that were introduced in this generation.
	Types []TypeSummary `json:"types"`

	// A list of version groups that were introduced in this generation.
	VersionGroups []VersionGroupSummary `json:"version_groups"`
}
