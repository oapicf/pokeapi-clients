<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveDetailStatChangesInner
{
    /**
     * @DTA\Data(field="change")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $change = null;

    /**
     * @DTA\Data(field="stat")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $stat = null;

}
