<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationAreaEncounterRate
{
    /**
     * The method in which Pokémon may be encountered in an area..
     * @DTA\Data(field="encounter_method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EncounterMethodSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EncounterMethodSummary::class})
     */
    public ?\App\DTO\EncounterMethodSummary $encounter_method = null;

    /**
     * The chance of the encounter to occur on a version of the game.
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection86::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection86::class})
     */
    public ?\App\DTO\Collection86 $version_details = null;

}
