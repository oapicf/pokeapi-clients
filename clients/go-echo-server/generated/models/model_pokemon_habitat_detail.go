package models

type PokemonHabitatDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The name of this resource listed in different languages.
	Names []PokemonHabitatName `json:"names"`

	// A list of the Pokémon species that can be found in this habitat.
	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`
}
