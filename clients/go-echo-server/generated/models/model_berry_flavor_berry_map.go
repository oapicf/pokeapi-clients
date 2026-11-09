package models

type BerryFlavorBerryMap struct {

	// How powerful the referenced flavor is for this berry.
	Potency int32 `json:"potency"`

	// The berry with the referenced flavor.
	Berry BerrySummary `json:"berry"`
}
