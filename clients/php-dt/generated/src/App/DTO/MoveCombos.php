<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveCombos
{
    /**
     * A detail of moves this move can be used before or after, granting additional appeal points in contests.
     * @DTA\Data(field="normal")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveComboUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveComboUsage::class})
     */
    public ?\App\DTO\MoveComboUsage $normal = null;

    /**
     * A detail of moves this move can be used before or after, granting additional appeal points in super contests.
     * @DTA\Data(field="super")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveComboUsage::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveComboUsage::class})
     */
    public ?\App\DTO\MoveComboUsage $super = null;

}
