<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemGameIndex
{
    /**
     * @DTA\Data(field="game_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $game_index;

    /**
     * @DTA\Data(field="generation")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\GenerationSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\GenerationSummary::class})
     * @var \App\DTO\GenerationSummary|null
     */
    public $generation;

}
