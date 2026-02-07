<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ItemDetailHeldByPokemonInnerVersionDetailsInner
{
    /**
     * @DTA\Data(field="rarity")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $rarity = null;

    /**
     * @DTA\Data(field="version")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $version = null;

}
