package models

type BerryDetailFlavorsInner struct {

	Potency int32 `json:"potency"`

	Flavor BerryDetailFlavorsInnerFlavor `json:"flavor"`
}
