package models

type MoveChange struct {

	Accuracy *int32 `json:"accuracy,omitempty"`

	Power *int32 `json:"power,omitempty"`

	Pp *int32 `json:"pp,omitempty"`

	EffectChance int32 `json:"effect_chance"`

	EffectEntries []MoveChangeEffectEntriesInner `json:"effect_entries"`

	Type TypeSummary `json:"type"`

	VersionGroup VersionGroupSummary `json:"version_group"`
}
