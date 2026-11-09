<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDexNumber
{
    /**
     * The index of this Pokémon species entry within the Pokédex.
     * @DTA\Data(field="entry_number")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $entry_number = null;

    /**
     * The Pokémon species being encountered.
     * @DTA\Data(field="pokemon_species")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonSpeciesSummary::class})
     */
    public ?\App\DTO\PokemonSpeciesSummary $pokemon_species = null;

}
