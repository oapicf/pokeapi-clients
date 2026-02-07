package models

type PalParkAreaDetailPokemonEncountersInner struct {

	BaseScore int32 `json:"base_score"`

	PokemonSpecies AbilityDetailPokemonInnerPokemon `json:"pokemon-species"`

	Rate int32 `json:"rate"`
}
