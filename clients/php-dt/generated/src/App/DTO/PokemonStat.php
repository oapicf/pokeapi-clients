<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonStat
{
    /**
     * The base value of the stat.
     * @DTA\Data(field="base_stat")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $base_stat = null;

    /**
     * The effort points (EV) the Pokémon has in the stat.
     * @DTA\Data(field="effort")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $effort = null;

    /**
     * The stat the Pokémon has.
     * @DTA\Data(field="stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatSummary::class})
     */
    public ?\App\DTO\StatSummary $stat = null;

}
