<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class LocationGameIndex
{
    /**
     * @DTA\Data(field="game_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $game_index = null;

    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     */
    public ?\App\DTO\GenerationSummary $generation = null;

}
