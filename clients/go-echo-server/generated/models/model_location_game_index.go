package models

type LocationGameIndex struct {

	GameIndex int32 `json:"game_index"`

	Generation GenerationSummary `json:"generation"`
}
