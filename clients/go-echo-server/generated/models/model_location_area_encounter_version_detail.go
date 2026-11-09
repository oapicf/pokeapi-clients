package models

type LocationAreaEncounterVersionDetail struct {

	// The chance of an encounter to occur.
	Rate int32 `json:"rate"`

	// The version of the game in which the encounter can occur with the given chance.
	Version VersionSummary `json:"version"`
}
