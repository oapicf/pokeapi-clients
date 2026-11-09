<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonPastStat
{
    /**
     * The last generation in which the referenced pokémon had the listed stats.
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

    /**
     * The stat the Pokémon had up to and including the listed generation.
     * @DTA\Data(field="stats")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection148::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection148::class})
     * @var \App\DTO\Collection148|null
     */
    public $stats;

}
