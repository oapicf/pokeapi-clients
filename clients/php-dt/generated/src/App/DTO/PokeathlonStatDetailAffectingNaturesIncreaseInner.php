<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokeathlonStatDetailAffectingNaturesIncreaseInner
{
    /**
     * @DTA\Data(field="max_change")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":1})
     */
    public ?int $max_change = null;

    /**
     * @DTA\Data(field="nature")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $nature = null;

}
