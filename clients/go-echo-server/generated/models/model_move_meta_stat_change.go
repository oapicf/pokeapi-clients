package models

type MoveMetaStatChange struct {

	// The amount of change.
	Change int32 `json:"change"`

	// The stat being affected.
	Stat StatSummary `json:"stat"`
}
