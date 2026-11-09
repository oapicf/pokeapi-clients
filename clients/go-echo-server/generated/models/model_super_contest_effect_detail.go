package models

type SuperContestEffectDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The level of appeal this super contest effect has.
	Appeal int32 `json:"appeal"`

	// The flavor text of this super contest effect listed in different languages.
	FlavorTextEntries []SuperContestEffectFlavorText `json:"flavor_text_entries"`

	// A list of moves that have the effect when used in super contests.
	Moves []MoveSummary `json:"moves"`
}
