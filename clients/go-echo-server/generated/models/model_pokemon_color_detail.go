package models

type PokemonColorDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The name of this resource listed in different languages.
	Names []PokemonColorName `json:"names"`

	// A list of the Pokémon species that have this color.
	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`
}
