package models

type ContestTypeDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	BerryFlavor BerryFlavorSummary `json:"berry_flavor"`

	Names []ContestTypeName `json:"names"`
}
