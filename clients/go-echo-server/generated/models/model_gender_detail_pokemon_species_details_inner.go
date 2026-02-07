package models

type GenderDetailPokemonSpeciesDetailsInner struct {

	Rate int32 `json:"rate"`

	PokemonSpecies AbilityDetailPokemonInnerPokemon `json:"pokemon_species"`
}
