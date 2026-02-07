<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
{
    /**
     * @DTA\Data(field="encounter_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection220::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection220::class})
     * @var \App\DTO\Collection220|null
     */
    public $encounter_details;

    /**
     * @DTA\Data(field="max_chance")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     * @var float|null
     */
    public $max_chance;

    /**
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion::class})
     * @var \App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion|null
     */
    public $version;

}
