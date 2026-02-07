<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonShapeDetailAwesomeNamesInner
{
    /**
     * @DTA\Data(field="awesome_name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $awesome_name;

    /**
     * @DTA\Data(field="language")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @var \App\DTO\AbilityDetailPokemonInnerPokemon|null
     */
    public $language;

}
