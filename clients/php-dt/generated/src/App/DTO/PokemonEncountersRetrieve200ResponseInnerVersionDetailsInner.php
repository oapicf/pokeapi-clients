<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonEncountersRetrieve200ResponseInnerVersionDetailsInner
{
    /**
     * @DTA\Data(field="encounter_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection220::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection220::class})
     */
    public ?\App\DTO\Collection220 $encounter_details = null;

    /**
     * @DTA\Data(field="max_chance")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $max_chance = null;

    /**
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion::class})
     */
    public ?\App\DTO\PokemonEncountersRetrieve200ResponseInnerVersionDetailsInnerVersion $version = null;

}
