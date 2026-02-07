package models

type ContestEffectDetail struct {

	Id int32 `json:"id"`

	Appeal int32 `json:"appeal"`

	Jam int32 `json:"jam"`

	EffectEntries []ContestEffectEffectText `json:"effect_entries"`

	FlavorTextEntries []ContestEffectFlavorText `json:"flavor_text_entries"`
}
