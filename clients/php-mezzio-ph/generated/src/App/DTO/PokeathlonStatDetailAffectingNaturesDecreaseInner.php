<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokeathlonStatDetailAffectingNaturesDecreaseInner
{
    /**
     * @DTA\Data(field="max_change")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="LessThan", options={"max":-1, "inclusive":true})
     * @var int|null
     */
    public $max_change;

    /**
     * @DTA\Data(field="nature")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $nature;

}
