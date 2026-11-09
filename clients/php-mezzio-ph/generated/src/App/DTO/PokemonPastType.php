<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonPastType
{
    /**
     * The last generation in which the referenced pokémon had the listed types.
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

    /**
     * The types the referenced pokémon had up to and including the listed generation.
     * @DTA\Data(field="types")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection151::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection151::class})
     * @var \App\DTO\Collection151|null
     */
    public $types;

}
