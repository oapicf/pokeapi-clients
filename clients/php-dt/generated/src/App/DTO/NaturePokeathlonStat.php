<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class NaturePokeathlonStat
{
    /**
     * The amount of change.
     * @DTA\Data(field="max_change")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $max_change = null;

    /**
     * The stat being affected.
     * @DTA\Data(field="pokeathlon_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokeathlonStatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokeathlonStatSummary::class})
     */
    public ?\App\DTO\PokeathlonStatSummary $pokeathlon_stat = null;

}
