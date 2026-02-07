<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class AbilityDetailPokemonInner
{
    /**
     * @DTA\Data(field="is_hidden")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_hidden;

    /**
     * @DTA\Data(field="slot")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $slot;

    /**
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $pokemon;

}
