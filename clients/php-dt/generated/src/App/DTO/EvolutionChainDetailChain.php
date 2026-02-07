<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EvolutionChainDetailChain
{
    /**
     * @DTA\Data(field="evolution_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection34::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection34::class})
     */
    public ?\App\DTO\Collection34 $evolution_details = null;

    /**
     * @DTA\Data(field="evolves_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection36::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection36::class})
     */
    public ?\App\DTO\Collection36 $evolves_to = null;

    /**
     * @DTA\Data(field="is_baby")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_baby = null;

    /**
     * @DTA\Data(field="species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $species = null;

}
