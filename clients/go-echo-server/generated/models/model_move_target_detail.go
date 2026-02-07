package models

type MoveTargetDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Descriptions []MoveTargetDescription `json:"descriptions"`

	Moves []MoveSummary `json:"moves"`

	Names []MoveTargetName `json:"names"`
}
