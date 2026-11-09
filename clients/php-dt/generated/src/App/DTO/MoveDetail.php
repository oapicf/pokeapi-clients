<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $name = null;

    /**
     * The percent value of how likely this move is to be successful.
     * @DTA\Data(field="accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $accuracy = null;

    /**
     * The percent value of how likely it is this moves effect will happen.
     * @DTA\Data(field="effect_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $effect_chance = null;

    /**
     * Power points. The number of times this move can be used.
     * @DTA\Data(field="pp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $pp = null;

    /**
     * A value between -8 and 8. Sets the order in which moves are executed during battle. See [Bulbapedia](http://bulbapedia.bulbagarden.net/wiki/Priority) for greater detail.
     * @DTA\Data(field="priority", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $priority = null;

    /**
     * The base power of this move, or null if it has no fixed base power.
     * @DTA\Data(field="power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $power = null;

    /**
     * A detail of normal and super contest combos that require this move.
     * @DTA\Data(field="contest_combos")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveCombos::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveCombos::class})
     */
    public ?\App\DTO\MoveCombos $contest_combos = null;

    /**
     * The type of appeal this move gives a Pokémon when used in a contest.
     * @DTA\Data(field="contest_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContestTypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContestTypeSummary::class})
     */
    public ?\App\DTO\ContestTypeSummary $contest_type = null;

    /**
     * The effect the move has when used in a contest.
     * @DTA\Data(field="contest_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContestEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContestEffectSummary::class})
     */
    public ?\App\DTO\ContestEffectSummary $contest_effect = null;

    /**
     * The type of damage the move inflicts on the target, e.g. physical.
     * @DTA\Data(field="damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     */
    public ?\App\DTO\MoveDamageClassSummary $damage_class = null;

    /**
     * The effect of this move listed in different languages.
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection95::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection95::class})
     */
    public ?\App\DTO\Collection95 $effect_entries = null;

    /**
     * The list of previous effects this move has had across version groups of the games.
     * @DTA\Data(field="effect_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection97::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection97::class})
     */
    public ?\App\DTO\Collection97 $effect_changes = null;

    /**
     * The generation in which this move was introduced.
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $generation = null;

    /**
     * Metadata about this move
     * @DTA\Data(field="meta")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMeta::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMeta::class})
     */
    public ?\App\DTO\MoveMeta $meta = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection98::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection98::class})
     */
    public ?\App\DTO\Collection98 $names = null;

    /**
     * A list of move resource value changes across version groups of the game.
     * @DTA\Data(field="past_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection100::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection100::class})
     */
    public ?\App\DTO\Collection100 $past_values = null;

    /**
     * A list of stats this moves effects and how much it effects them.
     * @DTA\Data(field="stat_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection101::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection101::class})
     */
    public ?\App\DTO\Collection101 $stat_changes = null;

    /**
     * The effect the move has when used in a super contest.
     * @DTA\Data(field="super_contest_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SuperContestEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SuperContestEffectSummary::class})
     */
    public ?\App\DTO\SuperContestEffectSummary $super_contest_effect = null;

    /**
     * The type of target that will receive the effects of the attack.
     * @DTA\Data(field="target")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveTargetSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveTargetSummary::class})
     */
    public ?\App\DTO\MoveTargetSummary $target = null;

    /**
     * The elemental type of this move.
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     */
    public ?\App\DTO\TypeSummary $type = null;

    /**
     * A list of the machines that teach this move.
     * @DTA\Data(field="machines")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection102::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection102::class})
     */
    public ?\App\DTO\Collection102 $machines = null;

    /**
     * The flavor text of this move listed in different languages.
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection103::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection103::class})
     */
    public ?\App\DTO\Collection103 $flavor_text_entries = null;

    /**
     * List of Pokemon that can learn the move
     * @DTA\Data(field="learned_by_pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection104::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection104::class})
     */
    public ?\App\DTO\Collection104 $learned_by_pokemon = null;

}
