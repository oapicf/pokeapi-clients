package models

type EvolutionChainLink struct {

	// Whether or not this link is for a baby Pokémon. This would only ever be true on the base link.
	IsBaby bool `json:"is_baby"`

	// The Pokémon species at this point in the evolution chain.
	Species PokemonSpeciesSummary `json:"species"`

	// All details regarding the specific details of the referenced Pokémon species evolution.
	EvolutionDetails []PokemonEvolution `json:"evolution_details"`

	// A List of chain objects.
	EvolvesTo []EvolutionChainLink `json:"evolves_to"`
}
