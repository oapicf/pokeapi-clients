package models

type BerryFirmnessDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Berries []BerrySummary `json:"berries"`

	Names []BerryFirmnessName `json:"names"`
}
