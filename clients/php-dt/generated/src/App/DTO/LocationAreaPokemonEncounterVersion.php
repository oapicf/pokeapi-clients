<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationAreaPokemonEncounterVersion
{
    /**
     * The game version this encounter happens in.
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionSummary::class})
     */
    public ?\App\DTO\VersionSummary $version = null;

    /**
     * The total percentage of all encounter potential.
     * @DTA\Data(field="max_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_chance = null;

    /**
     * A list of encounters and their specifics.
     * @DTA\Data(field="encounter_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection90::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection90::class})
     */
    public ?\App\DTO\Collection90 $encounter_details = null;

}
