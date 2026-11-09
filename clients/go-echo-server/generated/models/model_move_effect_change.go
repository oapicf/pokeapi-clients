package models

type MoveEffectChange struct {

	// The version group in which the previous effect of this ability originated.
	VersionGroup VersionGroupSummary `json:"version_group"`

	// The previous effect of this ability listed in different languages.
	EffectEntries []MoveEffectChangeEffectText `json:"effect_entries"`
}
