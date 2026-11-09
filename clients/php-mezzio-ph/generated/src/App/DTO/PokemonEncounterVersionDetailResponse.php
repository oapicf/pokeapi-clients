<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonEncounterVersionDetailResponse
{
    /**
     * The game version this encounter happens in.
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionSummary::class})
     * @var \App\DTO\VersionSummary|null
     */
    public $version;

    /**
     * The total percentage of all encounter potential.
     * @DTA\Data(field="max_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_chance;

    /**
     * A list of encounters and their specifics.
     * @DTA\Data(field="encounter_details")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\PokemonEncounterDetailResponse[]|null
     */
    public $encounter_details;

}
