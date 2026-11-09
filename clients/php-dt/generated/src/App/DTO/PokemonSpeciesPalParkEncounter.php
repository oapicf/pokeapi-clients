<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonSpeciesPalParkEncounter
{
    /**
     * The base score given to the player when the referenced Pokémon is caught during a pal park run.
     * @DTA\Data(field="base_score", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $base_score = null;

    /**
     * The base rate for encountering the referenced Pokémon in this pal park area.
     * @DTA\Data(field="rate")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $rate = null;

    /**
     * The pal park area where this encounter happens.
     * @DTA\Data(field="area")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PalParkAreaSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PalParkAreaSummary::class})
     */
    public ?\App\DTO\PalParkAreaSummary $area = null;

}
