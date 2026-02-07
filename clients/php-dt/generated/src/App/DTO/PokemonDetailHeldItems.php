<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDetailHeldItems
{
    /**
     * @DTA\Data(field="item")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $item = null;

    /**
     * @DTA\Data(field="version_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection141::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection141::class})
     */
    public ?\App\DTO\Collection141 $version_details = null;

}
