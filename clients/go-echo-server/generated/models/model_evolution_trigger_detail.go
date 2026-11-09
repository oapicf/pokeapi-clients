package models

type EvolutionTriggerDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The name of this resource listed in different languages.
	Names []EvolutionTriggerName `json:"names"`

	// A list of pokemon species that result from this evolution trigger.
	PokemonSpecies []PokemonSpeciesSummary `json:"pokemon_species"`
}
