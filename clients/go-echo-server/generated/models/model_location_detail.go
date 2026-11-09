package models

type LocationDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The region this location can be found in.
	Region *RegionSummary `json:"region"`

	// The name of this resource listed in different languages.
	Names []LocationName `json:"names"`

	// A list of game indices relevent to this location by generation.
	GameIndices []LocationGameIndex `json:"game_indices"`

	// Areas that can be found within this location.
	Areas []LocationAreaSummary `json:"areas"`
}
