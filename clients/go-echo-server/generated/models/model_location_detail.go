package models

type LocationDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Region RegionSummary `json:"region"`

	Names []LocationName `json:"names"`

	GameIndices []LocationGameIndex `json:"game_indices"`

	Areas []LocationAreaSummary `json:"areas"`
}
