package models

type BerryFirmnessDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// A list of the berries with this firmness.
	Berries []BerrySummary `json:"berries"`

	// The name of this resource listed in different languages.
	Names []BerryFirmnessName `json:"names"`
}
