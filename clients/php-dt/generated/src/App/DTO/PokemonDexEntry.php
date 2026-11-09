<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDexEntry
{
    /**
     * The index number within the Pokédex.
     * @DTA\Data(field="entry_number")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $entry_number = null;

    /**
     * The Pokédex the referenced Pokémon species can be found in.
     * @DTA\Data(field="pokedex")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokedexSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokedexSummary::class})
     */
    public ?\App\DTO\PokedexSummary $pokedex = null;

}
