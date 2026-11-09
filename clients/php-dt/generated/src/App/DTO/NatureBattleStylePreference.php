<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class NatureBattleStylePreference
{
    /**
     * Chance of using the move, in percent, if HP is under one half.
     * @DTA\Data(field="low_hp_preference")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $low_hp_preference = null;

    /**
     * Chance of using the move, in percent, if HP is over one half.
     * @DTA\Data(field="high_hp_preference")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $high_hp_preference = null;

    /**
     * The move battle style.
     * @DTA\Data(field="move_battle_style")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveBattleStyleSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveBattleStyleSummary::class})
     */
    public ?\App\DTO\MoveBattleStyleSummary $move_battle_style = null;

}
