<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveChangeEffectEntriesInner
{
    /**
     * @DTA\Data(field="effect")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $effect;

    /**
     * @DTA\Data(field="short_effect")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $short_effect;

    /**
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $language;

}
