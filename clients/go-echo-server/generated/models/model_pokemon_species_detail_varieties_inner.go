package models

type PokemonSpeciesDetailVarietiesInner struct {

	IsDefault bool `json:"is_default"`

	Pokemon AbilityDetailPokemonInnerPokemon `json:"pokemon"`
}
