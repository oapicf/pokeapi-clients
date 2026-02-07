<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationAreaDetailPokemonEncountersInnerVersionDetailsInner
{
    /**
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $version = null;

    /**
     * @DTA\Data(field="max_chance")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_chance = null;

    /**
     * @DTA\Data(field="encounter_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails::class})
     */
    public ?\App\DTO\LocationAreaDetailPokemonEncountersInnerVersionDetailsInnerEncounterDetails $encounter_details = null;

}
