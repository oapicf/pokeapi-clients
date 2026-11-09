package models

type MoveTargetDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The description of this resource listed in different languages.
	Descriptions []MoveTargetDescription `json:"descriptions"`

	// A list of moves that that are directed at this target.
	Moves []MoveSummary `json:"moves"`

	// The name of this resource listed in different languages.
	Names []MoveTargetName `json:"names"`
}
