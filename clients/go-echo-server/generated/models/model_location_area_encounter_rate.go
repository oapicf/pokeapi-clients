package models

type LocationAreaEncounterRate struct {

	// The method in which Pokémon may be encountered in an area..
	EncounterMethod EncounterMethodSummary `json:"encounter_method"`

	// The chance of the encounter to occur on a version of the game.
	VersionDetails []LocationAreaEncounterVersionDetail `json:"version_details"`
}
