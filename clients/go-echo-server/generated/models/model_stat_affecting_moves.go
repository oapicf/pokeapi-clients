package models

type StatAffectingMoves struct {

	// A list of moves and how they change the referenced stat.
	Increase []MoveStatChange `json:"increase"`

	// A list of moves and how they change the referenced stat.
	Decrease []MoveStatChange `json:"decrease"`
}
