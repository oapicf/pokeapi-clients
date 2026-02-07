package models

type MoveDamageClassDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Descriptions []MoveDamageClassDescription `json:"descriptions"`

	Moves []MoveSummary `json:"moves"`

	Names []MoveDamageClassName `json:"names"`
}
