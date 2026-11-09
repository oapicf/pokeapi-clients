package models

type GenderDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A list of Pokémon species that can be this gender and how likely it is that they will be.
	PokemonSpeciesDetails []GenderPokemonSpecies `json:"pokemon_species_details"`

	// A list of Pokémon species that required this gender in order for a Pokémon to evolve into them.
	RequiredForEvolution []PokemonSpeciesSummary `json:"required_for_evolution"`
}
