<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveMeta
{
    /**
     * @DTA\Data(field="ailment")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMetaAilmentSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMetaAilmentSummary::class})
     * @var \App\DTO\MoveMetaAilmentSummary|null
     */
    public $ailment;

    /**
     * @DTA\Data(field="category")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMetaCategorySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMetaCategorySummary::class})
     * @var \App\DTO\MoveMetaCategorySummary|null
     */
    public $category;

    /**
     * @DTA\Data(field="min_hits", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $min_hits;

    /**
     * @DTA\Data(field="max_hits", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_hits;

    /**
     * @DTA\Data(field="min_turns", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $min_turns;

    /**
     * @DTA\Data(field="max_turns", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_turns;

    /**
     * @DTA\Data(field="drain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $drain;

    /**
     * @DTA\Data(field="healing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $healing;

    /**
     * @DTA\Data(field="crit_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $crit_rate;

    /**
     * @DTA\Data(field="ailment_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $ailment_chance;

    /**
     * @DTA\Data(field="flinch_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $flinch_chance;

    /**
     * @DTA\Data(field="stat_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $stat_chance;

}
