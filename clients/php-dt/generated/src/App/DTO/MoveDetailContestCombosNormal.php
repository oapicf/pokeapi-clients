<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveDetailContestCombosNormal
{
    /**
     * @DTA\Data(field="use_before")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection90::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection90::class})
     */
    public ?\App\DTO\Collection90 $use_before = null;

    /**
     * @DTA\Data(field="use_after")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection91::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection91::class})
     */
    public ?\App\DTO\Collection91 $use_after = null;

}
