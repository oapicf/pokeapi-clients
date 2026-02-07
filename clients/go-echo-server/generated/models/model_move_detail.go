package models

type MoveDetail struct {

	Id int32 `json:"id"`

	Name string `json:"name"`

	Accuracy *int32 `json:"accuracy,omitempty"`

	EffectChance int32 `json:"effect_chance"`

	Pp *int32 `json:"pp,omitempty"`

	Priority *int32 `json:"priority,omitempty"`

	Power *int32 `json:"power,omitempty"`

	ContestCombos MoveDetailContestCombos `json:"contest_combos"`

	ContestType ContestTypeSummary `json:"contest_type"`

	ContestEffect ContestEffectSummary `json:"contest_effect"`

	DamageClass MoveDamageClassSummary `json:"damage_class"`

	EffectEntries []MoveChangeEffectEntriesInner `json:"effect_entries"`

	EffectChanges []MoveDetailEffectChangesInner `json:"effect_changes"`

	Generation GenerationSummary `json:"generation"`

	Meta MoveMeta `json:"meta"`

	Names []MoveName `json:"names"`

	PastValues []MoveChange `json:"past_values"`

	StatChanges []MoveDetailStatChangesInner `json:"stat_changes"`

	SuperContestEffect SuperContestEffectSummary `json:"super_contest_effect"`

	Target MoveTargetSummary `json:"target"`

	Type TypeSummary `json:"type"`

	Machines []MoveDetailMachinesInner `json:"machines"`

	FlavorTextEntries []MoveFlavorText `json:"flavor_text_entries"`

	LearnedByPokemon []AbilityDetailPokemonInnerPokemon `json:"learned_by_pokemon"`
}
