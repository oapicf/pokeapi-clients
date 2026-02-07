package models

type BerryFlavorDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Berries []BerryFlavorDetailBerriesInner `json:"berries"`

	ContestType ContestTypeSummary `json:"contest_type"`

	Names []BerryFlavorName `json:"names"`
}
