<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonEncountersRetrieve200ResponseInner
{
    /**
     * @DTA\Data(field="location_area")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonEncountersRetrieve200ResponseInnerLocationArea::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonEncountersRetrieve200ResponseInnerLocationArea::class})
     * @var \App\DTO\PokemonEncountersRetrieve200ResponseInnerLocationArea|null
     */
    public $location_area;

    /**
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection221::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection221::class})
     * @var \App\DTO\Collection221|null
     */
    public $version_details;

}
