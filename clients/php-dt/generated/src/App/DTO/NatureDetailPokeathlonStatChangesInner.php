<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class NatureDetailPokeathlonStatChangesInner
{
    /**
     * @DTA\Data(field="max_change")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $max_change = null;

    /**
     * @DTA\Data(field="pokeathlon_stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $pokeathlon_stat = null;

}
