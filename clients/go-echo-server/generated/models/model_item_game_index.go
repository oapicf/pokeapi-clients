package models

type ItemGameIndex struct {

	// The internal id of an API resource within game data.
	GameIndex int32 `json:"game_index"`

	// The generation relevent to this game index.
	Generation GenerationSummary `json:"generation"`
}
