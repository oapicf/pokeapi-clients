package models

type LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails struct {

	MinLevel int32 `json:"min_level"`

	MaxLevel int32 `json:"max_level"`

	ConditionValues AbilityDetailPokemonInnerPokemon `json:"condition_values,omitempty"`

	Chance int32 `json:"chance"`

	Method AbilityDetailPokemonInnerPokemon `json:"method"`
}
