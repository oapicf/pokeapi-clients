package models

type BerryFlavorDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A list of the berries with this flavor.
	Berries []BerryFlavorBerryMap `json:"berries"`

	// The contest type that correlates with this berry flavor.
	ContestType ContestTypeSummary `json:"contest_type"`

	// The name of this resource listed in different languages.
	Names []BerryFlavorName `json:"names"`
}
