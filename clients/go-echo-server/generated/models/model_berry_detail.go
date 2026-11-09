package models

type BerryDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// Time it takes the tree to grow one stage, in hours. Berry trees go through four of these growth stages before they can be picked.
	GrowthTime *int32 `json:"growth_time,omitempty"`

	// The maximum number of these berries that can grow on one tree in Generation IV.
	MaxHarvest *int32 `json:"max_harvest,omitempty"`

	// The power of the move \"Natural Gift\" when used with this Berry.
	NaturalGiftPower *int32 `json:"natural_gift_power,omitempty"`

	// The size of this Berry, in millimeters.
	Size *int32 `json:"size,omitempty"`

	// The smoothness of this Berry, used in making Pokéblocks or Poffins.
	Smoothness *int32 `json:"smoothness,omitempty"`

	// The speed at which this Berry dries out the soil as it grows. A higher rate means the soil dries more quickly.
	SoilDryness *int32 `json:"soil_dryness,omitempty"`

	// The firmness of this berry, used in making Pokéblocks or Poffins.
	Firmness *BerryFirmnessSummary `json:"firmness"`

	// A list of references to each flavor a berry can have and the potency of each of those flavors in regard to this berry.
	Flavors []BerryFlavorMap `json:"flavors"`

	// Berries are actually items. This is a reference to the item specific data for this berry.
	Item ItemSummary `json:"item"`

	// The type inherited by \"Natural Gift\" when used with this Berry.
	NaturalGiftType *TypeSummary `json:"natural_gift_type"`
}
