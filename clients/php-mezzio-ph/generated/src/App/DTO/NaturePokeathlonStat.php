<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class NaturePokeathlonStat
{
    /**
     * The amount of change.
     * @DTA\Data(field="max_change")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $max_change;

    /**
     * The stat being affected.
     * @DTA\Data(field="pokeathlon_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokeathlonStatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokeathlonStatSummary::class})
     * @var \App\DTO\PokeathlonStatSummary|null
     */
    public $pokeathlon_stat;

}
