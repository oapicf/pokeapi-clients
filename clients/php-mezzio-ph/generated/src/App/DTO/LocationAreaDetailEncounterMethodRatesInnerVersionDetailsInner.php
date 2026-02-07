<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class LocationAreaDetailEncounterMethodRatesInnerVersionDetailsInner
{
    /**
     * @DTA\Data(field="rate")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $rate;

    /**
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $version;

}
