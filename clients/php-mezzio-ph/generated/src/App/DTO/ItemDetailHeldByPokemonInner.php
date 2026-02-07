<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemDetailHeldByPokemonInner
{
    /**
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $pokemon;

    /**
     * @DTA\Data(field="version-details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection60::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection60::class})
     * @var \App\DTO\Collection60|null
     */
    public $version_details;

}
