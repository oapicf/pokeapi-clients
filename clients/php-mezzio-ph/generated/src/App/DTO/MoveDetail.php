<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $name;

    /**
     * The percent value of how likely this move is to be successful.
     * @DTA\Data(field="accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $accuracy;

    /**
     * The percent value of how likely it is this moves effect will happen.
     * @DTA\Data(field="effect_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $effect_chance;

    /**
     * Power points. The number of times this move can be used.
     * @DTA\Data(field="pp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $pp;

    /**
     * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
     * @DTA\Data(field="priority", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $priority;

    /**
     * The base power of this move, or null if it has no fixed base power.
     * @DTA\Data(field="power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $power;

    /**
     * A detail of normal and super contest combos that require this move.
     * @DTA\Data(field="contest_combos")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveCombos::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveCombos::class})
     * @var \App\DTO\MoveCombos|null
     */
    public $contest_combos;

    /**
     * The type of appeal this move gives a Pokémon when used in a contest.
     * @DTA\Data(field="contest_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContestTypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContestTypeSummary::class})
     * @var \App\DTO\ContestTypeSummary|null
     */
    public $contest_type;

    /**
     * The effect the move has when used in a contest.
     * @DTA\Data(field="contest_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContestEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContestEffectSummary::class})
     * @var \App\DTO\ContestEffectSummary|null
     */
    public $contest_effect;

    /**
     * The type of damage the move inflicts on the target, e.g. physical.
     * @DTA\Data(field="damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @var \App\DTO\MoveDamageClassSummary|null
     */
    public $damage_class;

    /**
     * The effect of this move listed in different languages.
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection95::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection95::class})
     * @var \App\DTO\Collection95|null
     */
    public $effect_entries;

    /**
     * The list of previous effects this move has had across version groups of the games.
     * @DTA\Data(field="effect_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection97::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection97::class})
     * @var \App\DTO\Collection97|null
     */
    public $effect_changes;

    /**
     * The generation in which this move was introduced.
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

    /**
     * Metadata about this move
     * @DTA\Data(field="meta")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMeta::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMeta::class})
     * @var \App\DTO\MoveMeta|null
     */
    public $meta;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection98::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection98::class})
     * @var \App\DTO\Collection98|null
     */
    public $names;

    /**
     * A list of move resource value changes across version groups of the game.
     * @DTA\Data(field="past_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection100::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection100::class})
     * @var \App\DTO\Collection100|null
     */
    public $past_values;

    /**
     * A list of stats this moves effects and how much it effects them.
     * @DTA\Data(field="stat_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection101::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection101::class})
     * @var \App\DTO\Collection101|null
     */
    public $stat_changes;

    /**
     * The effect the move has when used in a super contest.
     * @DTA\Data(field="super_contest_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SuperContestEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SuperContestEffectSummary::class})
     * @var \App\DTO\SuperContestEffectSummary|null
     */
    public $super_contest_effect;

    /**
     * The type of target that will receive the effects of the attack.
     * @DTA\Data(field="target")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveTargetSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveTargetSummary::class})
     * @var \App\DTO\MoveTargetSummary|null
     */
    public $target;

    /**
     * The elemental type of this move.
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     * @var \App\DTO\TypeSummary|null
     */
    public $type;

    /**
     * A list of the machines that teach this move.
     * @DTA\Data(field="machines")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection102::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection102::class})
     * @var \App\DTO\Collection102|null
     */
    public $machines;

    /**
     * The flavor text of this move listed in different languages.
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection103::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection103::class})
     * @var \App\DTO\Collection103|null
     */
    public $flavor_text_entries;

    /**
     * List of Pokemon that can learn the move
     * @DTA\Data(field="learned_by_pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection104::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection104::class})
     * @var \App\DTO\Collection104|null
     */
    public $learned_by_pokemon;

}
