package models

type MoveDetail struct {

	// The identifier for this resource.
	Id int32 `json:"id"`

	// The name for this resource.
	Name string `json:"name"`

	// The percent value of how likely this move is to be successful.
	Accuracy *int32 `json:"accuracy,omitempty"`

	// The percent value of how likely it is this moves effect will happen.
	EffectChance *int32 `json:"effect_chance"`

	// Power points. The number of times this move can be used.
	Pp *int32 `json:"pp,omitempty"`

	// A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
	Priority *int32 `json:"priority,omitempty"`

	// The base power of this move, or null if it has no fixed base power.
	Power *int32 `json:"power,omitempty"`

	// A detail of normal and super contest combos that require this move.
	ContestCombos *MoveCombos `json:"contest_combos"`

	// The type of appeal this move gives a Pokémon when used in a contest.
	ContestType *ContestTypeSummary `json:"contest_type"`

	// The effect the move has when used in a contest.
	ContestEffect *ContestEffectSummary `json:"contest_effect"`

	// The type of damage the move inflicts on the target, e.g. physical.
	DamageClass MoveDamageClassSummary `json:"damage_class"`

	// The effect of this move listed in different languages.
	EffectEntries []MoveEffectEffectText `json:"effect_entries"`

	// The list of previous effects this move has had across version groups of the games.
	EffectChanges []MoveEffectChange `json:"effect_changes"`

	// The generation in which this move was introduced.
	Generation GenerationSummary `json:"generation"`

	// Metadata about this move
	Meta *MoveMeta `json:"meta"`

	// The name of this resource listed in different languages.
	Names []MoveName `json:"names"`

	// A list of move resource value changes across version groups of the game.
	PastValues []MoveChange `json:"past_values"`

	// A list of stats this moves effects and how much it effects them.
	StatChanges []MoveMetaStatChange `json:"stat_changes"`

	// The effect the move has when used in a super contest.
	SuperContestEffect *SuperContestEffectSummary `json:"super_contest_effect"`

	// The type of target that will receive the effects of the attack.
	Target MoveTargetSummary `json:"target"`

	// The elemental type of this move.
	Type TypeSummary `json:"type"`

	// A list of the machines that teach this move.
	Machines []ItemMachine `json:"machines"`

	// The flavor text of this move listed in different languages.
	FlavorTextEntries []MoveFlavorText `json:"flavor_text_entries"`

	// List of Pokemon that can learn the move
	LearnedByPokemon []PokemonSummary `json:"learned_by_pokemon"`
}
