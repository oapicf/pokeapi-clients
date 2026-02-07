<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="accuracy", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $accuracy = null;

    /**
     * @DTA\Data(field="effect_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $effect_chance = null;

    /**
     * @DTA\Data(field="pp", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $pp = null;

    /**
     * @DTA\Data(field="priority", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $priority = null;

    /**
     * @DTA\Data(field="power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $power = null;

    /**
     * @DTA\Data(field="contest_combos")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDetailContestCombos::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDetailContestCombos::class})
     */
    public ?\App\DTO\MoveDetailContestCombos $contest_combos = null;

    /**
     * @DTA\Data(field="contest_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContestTypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContestTypeSummary::class})
     */
    public ?\App\DTO\ContestTypeSummary $contest_type = null;

    /**
     * @DTA\Data(field="contest_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContestEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContestEffectSummary::class})
     */
    public ?\App\DTO\ContestEffectSummary $contest_effect = null;

    /**
     * @DTA\Data(field="damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     */
    public ?\App\DTO\MoveDamageClassSummary $damage_class = null;

    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection92::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection92::class})
     */
    public ?\App\DTO\Collection92 $effect_entries = null;

    /**
     * @DTA\Data(field="effect_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection94::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection94::class})
     */
    public ?\App\DTO\Collection94 $effect_changes = null;

    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $generation = null;

    /**
     * @DTA\Data(field="meta")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMeta::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMeta::class})
     */
    public ?\App\DTO\MoveMeta $meta = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection95::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection95::class})
     */
    public ?\App\DTO\Collection95 $names = null;

    /**
     * @DTA\Data(field="past_values")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection97::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection97::class})
     */
    public ?\App\DTO\Collection97 $past_values = null;

    /**
     * @DTA\Data(field="stat_changes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection98::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection98::class})
     */
    public ?\App\DTO\Collection98 $stat_changes = null;

    /**
     * @DTA\Data(field="super_contest_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\SuperContestEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\SuperContestEffectSummary::class})
     */
    public ?\App\DTO\SuperContestEffectSummary $super_contest_effect = null;

    /**
     * @DTA\Data(field="target")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveTargetSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveTargetSummary::class})
     */
    public ?\App\DTO\MoveTargetSummary $target = null;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeSummary::class})
     */
    public ?\App\DTO\TypeSummary $type = null;

    /**
     * @DTA\Data(field="machines")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection99::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection99::class})
     */
    public ?\App\DTO\Collection99 $machines = null;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection100::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection100::class})
     */
    public ?\App\DTO\Collection100 $flavor_text_entries = null;

    /**
     * @DTA\Data(field="learned_by_pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection101::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection101::class})
     */
    public ?\App\DTO\Collection101 $learned_by_pokemon = null;

}
