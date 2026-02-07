<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TypeDetailPokemonInner
{
    /**
     * @DTA\Data(field="slot", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $slot;

    /**
     * @DTA\Data(field="pokemon", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TypeDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\TypeDetailPokemonInnerPokemon::class})
     * @var \App\DTO\TypeDetailPokemonInnerPokemon|null
     */
    public $pokemon;

}
