package models

type PokemonGameIndex struct {

	GameIndex int32 `json:"game_index"`

	Version VersionSummary `json:"version"`
}
