package models

type PokemonEncounterDetailResponse struct {

	// Percent chance that this encounter will occur.
	Chance int32 `json:"chance"`

	// A list of condition values that must be in effect for this encounter to occur.
	ConditionValues []EncounterConditionValueSummary `json:"condition_values"`

	// The highest level the Pokémon could be encountered at.
	MaxLevel int32 `json:"max_level"`

	// The method by which this encounter happens.
	Method EncounterMethodSummary `json:"method"`

	// The lowest level the Pokémon could be encountered at.
	MinLevel int32 `json:"min_level"`
}
