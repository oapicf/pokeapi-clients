<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDetailPastAbilitiesInner
{
    /**
     * @DTA\Data(field="abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection137::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection137::class})
     */
    public ?\App\DTO\Collection137 $abilities = null;

    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $generation = null;

}
