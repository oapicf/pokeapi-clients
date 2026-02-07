<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDetailMovesInner
{
    /**
     * @DTA\Data(field="move")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $move = null;

    /**
     * @DTA\Data(field="version_group_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection142::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection142::class})
     */
    public ?\App\DTO\Collection142 $version_group_details = null;

}
