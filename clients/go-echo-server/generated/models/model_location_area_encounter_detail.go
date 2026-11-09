package models

type LocationAreaEncounterDetail struct {

	// The lowest level the Pokémon could be encountered at.
	MinLevel int32 `json:"min_level"`

	// The highest level the Pokémon could be encountered at.
	MaxLevel int32 `json:"max_level"`

	// Percent chance that this encounter will occur.
	Chance int32 `json:"chance,omitempty"`

	// The method by which this encounter happens.
	Method EncounterMethodSummary `json:"method,omitempty"`

	// A list of condition values that must be in effect for this encounter to occur.
	ConditionValues []EncounterConditionValueSummary `json:"condition_values"`

	// Additional properties of the encountered Pokémon, or null if unspecified.
	PokemonDetails *EncounterPokemonDetail `json:"pokemon_details"`
}
