<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class AbilityDetailPokemonInner
{
    /**
     * @DTA\Data(field="is_hidden")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_hidden = null;

    /**
     * @DTA\Data(field="slot")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $slot = null;

    /**
     * @DTA\Data(field="pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $pokemon = null;

}
