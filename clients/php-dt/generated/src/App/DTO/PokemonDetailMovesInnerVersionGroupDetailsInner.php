<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDetailMovesInnerVersionGroupDetailsInner
{
    /**
     * @DTA\Data(field="level_learned_at")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $level_learned_at = null;

    /**
     * @DTA\Data(field="move_learn_method")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $move_learn_method = null;

    /**
     * @DTA\Data(field="version_group")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\AbilityDetailPokemonInnerPokemon::class})
     */
    public ?\App\DTO\AbilityDetailPokemonInnerPokemon $version_group = null;

}
