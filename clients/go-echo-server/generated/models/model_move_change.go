package models

type MoveChange struct {

	// The percent value of how likely this move is to be successful.
	Accuracy *int32 `json:"accuracy,omitempty"`

	// The base power before the listed version group, or null if power did not change.
	Power *int32 `json:"power,omitempty"`

	// Power points. The number of times this move can be used.
	Pp *int32 `json:"pp,omitempty"`

	// The percent value of how likely it is this moves effect will take effect.
	EffectChance *int32 `json:"effect_chance"`

	// The effect of this move listed in different languages.
	EffectEntries []MoveEffectEffectText `json:"effect_entries"`

	// The elemental type of this move.
	Type *TypeSummary `json:"type"`

	// The version group in which these move stat values were in effect.
	VersionGroup VersionGroupSummary `json:"version_group"`
}
