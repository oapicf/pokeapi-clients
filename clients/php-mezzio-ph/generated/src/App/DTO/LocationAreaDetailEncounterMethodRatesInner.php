<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LocationAreaDetailEncounterMethodRatesInner
{
    /**
     * @DTA\Data(field="encounter_method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $encounter_method;

    /**
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection83::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection83::class})
     * @var \App\DTO\Collection83|null
     */
    public $version_details;

}
