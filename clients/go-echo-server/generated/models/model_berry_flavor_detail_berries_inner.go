package models

type BerryFlavorDetailBerriesInner struct {

	Potency int32 `json:"potency"`

	Berry BerryFlavorDetailBerriesInnerBerry `json:"berry"`
}
