package models

type MoveCombos struct {

	// A detail of moves this move can be used before or after, granting additional appeal points in contests.
	Normal MoveComboUsage `json:"normal"`

	// A detail of moves this move can be used before or after, granting additional appeal points in super contests.
	Super MoveComboUsage `json:"super"`
}
