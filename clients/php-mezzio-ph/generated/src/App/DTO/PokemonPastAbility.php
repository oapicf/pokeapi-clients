<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonPastAbility
{
    /**
     * The abilities the referenced pokémon had up to and including the listed generation. If null, the slot was previously empty.
     * @DTA\Data(field="abilities")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection139::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection139::class})
     * @var \App\DTO\Collection139|null
     */
    public $abilities;

    /**
     * The last generation in which the referenced pokémon had the listed abilities.
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

}
