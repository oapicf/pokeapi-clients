<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class EvolutionChainDetailChain
{
    /**
     * @DTA\Data(field="evolution_details")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection34::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection34::class})
     * @var \App\DTO\Collection34|null
     */
    public $evolution_details;

    /**
     * @DTA\Data(field="evolves_to")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection36::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection36::class})
     * @var \App\DTO\Collection36|null
     */
    public $evolves_to;

    /**
     * @DTA\Data(field="is_baby")
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_baby;

    /**
     * @DTA\Data(field="species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $species;

}
