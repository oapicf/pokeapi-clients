package models

type SuperContestEffectDetail struct {

	Id int32 `json:"id"`

	Appeal int32 `json:"appeal"`

	FlavorTextEntries []SuperContestEffectFlavorText `json:"flavor_text_entries"`

	Moves []MoveSummary `json:"moves"`
}
