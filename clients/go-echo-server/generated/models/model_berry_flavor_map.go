package models

type BerryFlavorMap struct {

	// How powerful the referenced flavor is for this berry.
	Potency int32 `json:"potency"`

	// The referenced berry flavor.
	Flavor BerryFlavorSummary `json:"flavor"`
}
