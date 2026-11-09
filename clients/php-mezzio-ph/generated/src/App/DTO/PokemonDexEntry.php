<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonDexEntry
{
    /**
     * The index number within the Pokédex.
     * @DTA\Data(field="entry_number")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $entry_number;

    /**
     * The Pokédex the referenced Pokémon species can be found in.
     * @DTA\Data(field="pokedex")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokedexSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokedexSummary::class})
     * @var \App\DTO\PokedexSummary|null
     */
    public $pokedex;

}
