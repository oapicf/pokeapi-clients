<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class GenderDetailPokemonSpeciesDetailsInner
{
    /**
     * @DTA\Data(field="rate")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $rate = null;

    /**
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $pokemon_species = null;

}
