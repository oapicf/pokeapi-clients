<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class StatAffectingMoves
{
    /**
     * A list of moves and how they change the referenced stat.
     * @DTA\Data(field="increase")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\MoveStatChange[]|null
     */
    public $increase;

    /**
     * A list of moves and how they change the referenced stat.
     * @DTA\Data(field="decrease")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     * @var \App\DTO\MoveStatChange[]|null
     */
    public $decrease;

}
