<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class StatDetailAffectingMoves
{
    /**
     * @DTA\Data(field="increase")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection183::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection183::class})
     * @var \App\DTO\Collection183|null
     */
    public $increase;

    /**
     * @DTA\Data(field="decrease")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection184::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection184::class})
     * @var \App\DTO\Collection184|null
     */
    public $decrease;

}
