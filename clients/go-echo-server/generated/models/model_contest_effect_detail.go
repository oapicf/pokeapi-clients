package models

type ContestEffectDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The base number of hearts the user of this move gets.
	Appeal int32 `json:"appeal"`

	// The base number of hearts the user's opponent loses.
	Jam int32 `json:"jam"`

	// The result of this contest effect listed in different languages.
	EffectEntries []ContestEffectEffectText `json:"effect_entries"`

	// The flavor text of this contest effect listed in different languages.
	FlavorTextEntries []ContestEffectFlavorText `json:"flavor_text_entries"`
}
