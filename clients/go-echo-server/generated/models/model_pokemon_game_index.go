package models

type PokemonGameIndex struct {

	// The internal id of an API resource within game data.
	GameIndex int32 `json:"game_index"`

	// The version relevent to this game index.
	Version VersionSummary `json:"version"`
}
