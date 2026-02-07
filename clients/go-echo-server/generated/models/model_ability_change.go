package models

type AbilityChange struct {

	VersionGroup VersionGroupSummary `json:"version_group"`

	EffectEntries []AbilityChangeEffectText `json:"effect_entries"`
}
