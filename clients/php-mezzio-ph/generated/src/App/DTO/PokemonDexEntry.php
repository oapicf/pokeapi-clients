<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonDexEntry
{
    /**
     * @DTA\Data(field="entry_number")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $entry_number;

    /**
     * @DTA\Data(field="pokedex")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokedexSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokedexSummary::class})
     * @var \App\DTO\PokedexSummary|null
     */
    public $pokedex;

}
