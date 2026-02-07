<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $accuracy;

    /**
     * @DTA\Data(field="effect_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $effect_chance;

    /**
     * @DTA\Data(field="pp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $pp;

    /**
     * @DTA\Data(field="priority", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $priority;

    /**
     * @DTA\Data(field="power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $power;

    /**
     * @DTA\Data(field="contest_combos")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDetailContestCombos::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDetailContestCombos::class})
     * @var \App\DTO\MoveDetailContestCombos|null
     */
    public $contest_combos;

    /**
     * @DTA\Data(field="contest_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContestTypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContestTypeSummary::class})
     * @var \App\DTO\ContestTypeSummary|null
     */
    public $contest_type;

    /**
     * @DTA\Data(field="contest_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContestEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContestEffectSummary::class})
     * @var \App\DTO\ContestEffectSummary|null
     */
    public $contest_effect;

    /**
     * @DTA\Data(field="damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @var \App\DTO\MoveDamageClassSummary|null
     */
    public $damage_class;

    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection92::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection92::class})
     * @var \App\DTO\Collection92|null
     */
    public $effect_entries;

    /**
     * @DTA\Data(field="effect_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection94::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection94::class})
     * @var \App\DTO\Collection94|null
     */
    public $effect_changes;

    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

    /**
     * @DTA\Data(field="meta")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMeta::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMeta::class})
     * @var \App\DTO\MoveMeta|null
     */
    public $meta;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection95::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection95::class})
     * @var \App\DTO\Collection95|null
     */
    public $names;

    /**
     * @DTA\Data(field="past_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection97::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection97::class})
     * @var \App\DTO\Collection97|null
     */
    public $past_values;

    /**
     * @DTA\Data(field="stat_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection98::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection98::class})
     * @var \App\DTO\Collection98|null
     */
    public $stat_changes;

    /**
     * @DTA\Data(field="super_contest_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SuperContestEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SuperContestEffectSummary::class})
     * @var \App\DTO\SuperContestEffectSummary|null
     */
    public $super_contest_effect;

    /**
     * @DTA\Data(field="target")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveTargetSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveTargetSummary::class})
     * @var \App\DTO\MoveTargetSummary|null
     */
    public $target;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     * @var \App\DTO\TypeSummary|null
     */
    public $type;

    /**
     * @DTA\Data(field="machines")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection99::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection99::class})
     * @var \App\DTO\Collection99|null
     */
    public $machines;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection100::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection100::class})
     * @var \App\DTO\Collection100|null
     */
    public $flavor_text_entries;

    /**
     * @DTA\Data(field="learned_by_pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection101::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection101::class})
     * @var \App\DTO\Collection101|null
     */
    public $learned_by_pokemon;

}
