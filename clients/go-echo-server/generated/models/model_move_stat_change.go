package models

type MoveStatChange struct {

	// The maximum amount of change to the referenced stat.
	Change int32 `json:"change"`

	// The move causing the change.
	Move MoveSummary `json:"move"`
}
