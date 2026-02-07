package models

type StatDetailAffectingMoves struct {

	Increase []StatDetailAffectingMovesIncreaseInner `json:"increase"`

	Decrease []StatDetailAffectingMovesIncreaseInner `json:"decrease"`
}
