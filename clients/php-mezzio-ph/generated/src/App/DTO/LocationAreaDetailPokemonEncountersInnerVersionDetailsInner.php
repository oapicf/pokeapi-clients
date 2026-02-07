<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
{
    /**
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $version;

    /**
     * @DTA\Data(field="max_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $max_chance;

    /**
     * @DTA\Data(field="encounter_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails::class})
     * @var \App\DTO\LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails|null
     */
    public $encounter_details;

}
