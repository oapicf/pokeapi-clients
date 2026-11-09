package models

type ContestTypeDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The berry flavor that correlates with this contest type.
	BerryFlavor BerryFlavorSummary `json:"berry_flavor"`

	// The name of this contest type listed in different languages.
	Names []ContestTypeName `json:"names"`
}
