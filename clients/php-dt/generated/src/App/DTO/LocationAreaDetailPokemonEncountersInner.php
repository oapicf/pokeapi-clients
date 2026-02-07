<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationAreaDetailPokemonEncountersInner
{
    /**
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $pokemon = null;

    /**
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection86::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection86::class})
     */
    public ?\App\DTO\Collection86 $version_details = null;

}
