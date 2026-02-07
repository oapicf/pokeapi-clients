package models

type PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInner struct {

	Chance float32 `json:"chance"`

	ConditionValues []PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerConditionValuesInner `json:"condition_values"`

	MaxLevel float32 `json:"max_level"`

	Method PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerEncounterDetailsInnerMethod `json:"method"`

	MinLevel float32 `json:"min_level"`
}
