package models

type BerryDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	GrowthTime int32 `json:"growth_time"`

	MaxHarvest int32 `json:"max_harvest"`

	NaturalGiftPower int32 `json:"natural_gift_power"`

	Size int32 `json:"size"`

	Smoothness int32 `json:"smoothness"`

	SoilDryness int32 `json:"soil_dryness"`

	Firmness BerryFirmnessSummary `json:"firmness"`

	Flavors []BerryDetailFlavorsInner `json:"flavors"`

	Item ItemSummary `json:"item"`

	NaturalGiftType TypeSummary `json:"natural_gift_type"`
}
