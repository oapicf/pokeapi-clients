package models

type EvolutionChainDetailChain struct {

	EvolutionDetails []interface{} `json:"evolution_details"`

	EvolvesTo []EvolutionChainDetailChainEvolvesToInner `json:"evolves_to"`

	IsBaby bool `json:"is_baby"`

	Species AbilityDetailPokemonInnerPokemon `json:"species"`
}
