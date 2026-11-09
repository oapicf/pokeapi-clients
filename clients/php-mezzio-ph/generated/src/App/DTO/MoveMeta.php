<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveMeta
{
    /**
     * The status ailment this move inflicts on its target.
     * @DTA\Data(field="ailment")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMetaAilmentSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMetaAilmentSummary::class})
     * @var \App\DTO\MoveMetaAilmentSummary|null
     */
    public $ailment;

    /**
     * The category of move this move falls under, e.g. damage or ailment.
     * @DTA\Data(field="category")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMetaCategorySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMetaCategorySummary::class})
     * @var \App\DTO\MoveMetaCategorySummary|null
     */
    public $category;

    /**
     * The minimum number of times this move hits. Null if it always only hits once.
     * @DTA\Data(field="min_hits", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $min_hits;

    /**
     * The maximum number of times this move hits. Null if it always only hits once.
     * @DTA\Data(field="max_hits", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $max_hits;

    /**
     * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
     * @DTA\Data(field="min_turns", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $min_turns;

    /**
     * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
     * @DTA\Data(field="max_turns", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $max_turns;

    /**
     * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
     * @DTA\Data(field="drain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $drain;

    /**
     * The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP.
     * @DTA\Data(field="healing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $healing;

    /**
     * Critical hit rate bonus.
     * @DTA\Data(field="crit_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $crit_rate;

    /**
     * The likelihood this attack will cause an ailment.
     * @DTA\Data(field="ailment_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $ailment_chance;

    /**
     * The likelihood this attack will cause the target Pokémon to flinch.
     * @DTA\Data(field="flinch_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $flinch_chance;

    /**
     * The likelihood this attack will cause a stat change in the target Pokémon.
     * @DTA\Data(field="stat_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $stat_chance;

}
