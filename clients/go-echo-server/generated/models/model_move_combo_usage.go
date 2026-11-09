package models

type MoveComboUsage struct {

	// A list of moves to use before this move.
	UseBefore *[]MoveSummary `json:"use_before"`

	// A list of moves to use after this move.
	UseAfter *[]MoveSummary `json:"use_after"`
}
