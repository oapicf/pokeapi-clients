package models

type PokemonEncounterVersionDetailResponse struct {

	// The game version this encounter happens in.
	Version VersionSummary `json:"version"`

	// The total percentage of all encounter potential.
	MaxChance int32 `json:"max_chance"`

	// A list of encounters and their specifics.
	EncounterDetails []PokemonEncounterDetailResponse `json:"encounter_details"`
}
