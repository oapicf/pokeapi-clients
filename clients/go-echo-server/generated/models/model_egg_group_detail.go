package models

type EggGroupDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The name of this resource listed in different languages.
	Names []EggGroupName `json:"names"`

	// A list of all Pokémon species that are members of this egg group.
	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`
}
