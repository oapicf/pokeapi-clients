<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonEncounterResponse
{
    /**
     * The location area the referenced Pokémon can be encountered in.
     * @DTA\Data(field="location_area")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LocationAreaSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LocationAreaSummary::class})
     */
    public ?\App\DTO\LocationAreaSummary $location_area = null;

    /**
     * A list of versions and encounters with the referenced Pokémon that might happen.
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $version_details = null;

}
