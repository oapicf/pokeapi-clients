<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveDetailContestCombosNormal
{
    /**
     * @DTA\Data(field="use_before")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection90::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection90::class})
     * @var \App\DTO\Collection90|null
     */
    public $use_before;

    /**
     * @DTA\Data(field="use_after")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection91::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection91::class})
     * @var \App\DTO\Collection91|null
     */
    public $use_after;

}
