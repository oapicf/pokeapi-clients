package models

type LocationAreaDetailPokemonEncountersInnerVersionDetailsInner struct {

	Version AbilityDetailPokemonInnerPokemon `json:"version"`

	MaxChance int32 `json:"max_chance"`

	EncounterDetails LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails `json:"encounter_details"`
}
