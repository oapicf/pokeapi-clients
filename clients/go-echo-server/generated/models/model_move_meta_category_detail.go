package models

type MoveMetaCategoryDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The description of this resource listed in different languages.
	Descriptions []MoveMetaCategoryDescription `json:"descriptions"`

	// A list of moves that fall into this category.
	Moves []MoveSummary `json:"moves"`
}
