<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveComboUsage
{
    /**
     * A list of moves to use before this move.
     * @DTA\Data(field="use_before")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\MoveSummary[]|null
     */
    public $use_before;

    /**
     * A list of moves to use after this move.
     * @DTA\Data(field="use_after")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\MoveSummary[]|null
     */
    public $use_after;

}
