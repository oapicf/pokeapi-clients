package models

type MoveMetaAilmentDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A list of moves that cause this ailment.
	Moves []MoveSummary `json:"moves"`

	// The name of this resource listed in different languages.
	Names []MoveMetaAilmentName `json:"names"`
}
