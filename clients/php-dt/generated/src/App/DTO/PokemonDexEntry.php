<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokemonDexEntry
{
    /**
     * @DTA\Data(field="entry_number")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $entry_number = null;

    /**
     * @DTA\Data(field="pokedex")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokedexSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokedexSummary::class})
     */
    public ?\App\DTO\PokedexSummary $pokedex = null;

}
