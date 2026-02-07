<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MoveDetailContestCombos
{
    /**
     * @DTA\Data(field="normal")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDetailContestCombosNormal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDetailContestCombosNormal::class})
     * @var \App\DTO\MoveDetailContestCombosNormal|null
     */
    public $normal;

    /**
     * @DTA\Data(field="super")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDetailContestCombosNormal::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDetailContestCombosNormal::class})
     * @var \App\DTO\MoveDetailContestCombosNormal|null
     */
    public $super;

}
