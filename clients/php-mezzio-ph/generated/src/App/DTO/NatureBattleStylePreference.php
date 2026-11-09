<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class NatureBattleStylePreference
{
    /**
     * Chance of using the move, in percent, if HP is under one half.
     * @DTA\Data(field="low_hp_preference")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $low_hp_preference;

    /**
     * Chance of using the move, in percent, if HP is over one half.
     * @DTA\Data(field="high_hp_preference")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $high_hp_preference;

    /**
     * The move battle style.
     * @DTA\Data(field="move_battle_style")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveBattleStyleSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveBattleStyleSummary::class})
     * @var \App\DTO\MoveBattleStyleSummary|null
     */
    public $move_battle_style;

}
