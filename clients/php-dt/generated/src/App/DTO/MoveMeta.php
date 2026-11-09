<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveMeta
{
    /**
     * The status ailment this move inflicts on its target.
     * @DTA\Data(field="ailment")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMetaAilmentSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMetaAilmentSummary::class})
     */
    public ?\App\DTO\MoveMetaAilmentSummary $ailment = null;

    /**
     * The category of move this move falls under, e.g. damage or ailment.
     * @DTA\Data(field="category")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveMetaCategorySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveMetaCategorySummary::class})
     */
    public ?\App\DTO\MoveMetaCategorySummary $category = null;

    /**
     * The minimum number of times this move hits. Null if it always only hits once.
     * @DTA\Data(field="min_hits", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $min_hits = null;

    /**
     * The maximum number of times this move hits. Null if it always only hits once.
     * @DTA\Data(field="max_hits", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $max_hits = null;

    /**
     * The minimum number of turns this move continues to take effect. Null if it always only lasts one turn.
     * @DTA\Data(field="min_turns", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $min_turns = null;

    /**
     * The maximum number of turns this move continues to take effect. Null if it always only lasts one turn.
     * @DTA\Data(field="max_turns", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $max_turns = null;

    /**
     * HP drain (if positive) or Recoil damage (if negative), in percent of damage done.
     * @DTA\Data(field="drain", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $drain = null;

    /**
     * The amount of hp gained by the attacking Pokemon, in percent of it&#39;s maximum HP.
     * @DTA\Data(field="healing", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $healing = null;

    /**
     * Critical hit rate bonus.
     * @DTA\Data(field="crit_rate", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $crit_rate = null;

    /**
     * The likelihood this attack will cause an ailment.
     * @DTA\Data(field="ailment_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $ailment_chance = null;

    /**
     * The likelihood this attack will cause the target Pokémon to flinch.
     * @DTA\Data(field="flinch_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $flinch_chance = null;

    /**
     * The likelihood this attack will cause a stat change in the target Pokémon.
     * @DTA\Data(field="stat_chance", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $stat_chance = null;

}
