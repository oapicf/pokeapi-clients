package models

type MoveDamageClassDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The description of this resource listed in different languages.
	Descriptions []MoveDamageClassDescription `json:"descriptions"`

	// A list of moves that fall into this damage class.
	Moves []MoveSummary `json:"moves"`

	// The name of this resource listed in different languages.
	Names []MoveDamageClassName `json:"names"`
}
