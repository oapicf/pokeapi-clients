<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonSpeciesDetailPalParkEncountersInner
{
    /**
     * @DTA\Data(field="area")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $area;

    /**
     * @DTA\Data(field="base_score")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $base_score;

    /**
     * @DTA\Data(field="rate")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $rate;

}
