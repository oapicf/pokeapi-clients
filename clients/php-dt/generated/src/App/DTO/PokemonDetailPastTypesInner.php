<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDetailPastTypesInner
{
    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $generation = null;

    /**
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection147::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection147::class})
     */
    public ?\App\DTO\Collection147 $types = null;

}
