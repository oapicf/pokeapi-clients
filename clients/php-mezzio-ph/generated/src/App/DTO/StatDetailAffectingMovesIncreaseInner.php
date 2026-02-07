<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class StatDetailAffectingMovesIncreaseInner
{
    /**
     * @DTA\Data(field="change")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $change;

    /**
     * @DTA\Data(field="move")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $move;

}
