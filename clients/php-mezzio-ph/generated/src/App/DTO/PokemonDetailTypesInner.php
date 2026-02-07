<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonDetailTypesInner
{
    /**
     * @DTA\Data(field="slot")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $slot;

    /**
     * @DTA\Data(field="type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $type;

}
