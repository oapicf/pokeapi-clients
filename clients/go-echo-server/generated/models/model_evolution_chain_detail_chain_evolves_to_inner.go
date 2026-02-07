package models

type EvolutionChainDetailChainEvolvesToInner struct {

	EvolutionDetails []EvolutionChainDetailChainEvolvesToInnerEvolutionDetailsInner `json:"evolution_details"`

	IsBaby bool `json:"is_baby"`

	Species AbilityDetailPokemonInnerPokemon `json:"species"`
}
