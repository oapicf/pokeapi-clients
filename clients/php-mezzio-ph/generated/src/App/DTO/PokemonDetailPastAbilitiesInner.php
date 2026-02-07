<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonDetailPastAbilitiesInner
{
    /**
     * @DTA\Data(field="abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection137::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection137::class})
     * @var \App\DTO\Collection137|null
     */
    public $abilities;

    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $generation;

}
