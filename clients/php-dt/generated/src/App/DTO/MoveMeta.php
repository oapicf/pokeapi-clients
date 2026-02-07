<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveMeta
{
    /**
     * @DTA\Data(field="ailment")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMetaAilmentSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMetaAilmentSummary::class})
     */
    public ?\App\DTO\MoveMetaAilmentSummary $ailment = null;

    /**
     * @DTA\Data(field="category")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMetaCategorySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMetaCategorySummary::class})
     */
    public ?\App\DTO\MoveMetaCategorySummary $category = null;

    /**
     * @DTA\Data(field="min_hits", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $min_hits = null;

    /**
     * @DTA\Data(field="max_hits", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_hits = null;

    /**
     * @DTA\Data(field="min_turns", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $min_turns = null;

    /**
     * @DTA\Data(field="max_turns", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_turns = null;

    /**
     * @DTA\Data(field="drain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $drain = null;

    /**
     * @DTA\Data(field="healing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $healing = null;

    /**
     * @DTA\Data(field="crit_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $crit_rate = null;

    /**
     * @DTA\Data(field="ailment_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $ailment_chance = null;

    /**
     * @DTA\Data(field="flinch_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $flinch_chance = null;

    /**
     * @DTA\Data(field="stat_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $stat_chance = null;

}
