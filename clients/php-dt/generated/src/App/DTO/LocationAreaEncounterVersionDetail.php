<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationAreaEncounterVersionDetail
{
    /**
     * The chance of an encounter to occur.
     * @DTA\Data(field="rate")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $rate = null;

    /**
     * The version of the game in which the encounter can occur with the given chance.
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionSummary::class})
     */
    public ?\App\DTO\VersionSummary $version = null;

}
