package models

type GenderDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	PokemonSpeciesDetails []GenderDetailPokemonSpeciesDetailsInner `json:"pokemon_species_details"`

	RequiredForEvolution []AbilityDetailPokemonInnerPokemon `json:"required_for_evolution"`
}
