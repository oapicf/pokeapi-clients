package models

type EvolutionTriggerDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Names []EvolutionTriggerName `json:"names"`

	PokemonSpecies []AbilityDetailPokemonInnerPokemon `json:"pokemon_species"`
}
