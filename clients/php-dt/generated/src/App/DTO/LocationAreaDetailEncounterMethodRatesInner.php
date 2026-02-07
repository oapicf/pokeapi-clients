<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationAreaDetailEncounterMethodRatesInner
{
    /**
     * @DTA\Data(field="encounter_method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $encounter_method = null;

    /**
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection83::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection83::class})
     */
    public ?\App\DTO\Collection83 $version_details = null;

}
