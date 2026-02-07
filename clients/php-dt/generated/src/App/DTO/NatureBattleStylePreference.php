<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class NatureBattleStylePreference
{
    /**
     * @DTA\Data(field="low_hp_preference")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $low_hp_preference = null;

    /**
     * @DTA\Data(field="high_hp_preference")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $high_hp_preference = null;

    /**
     * @DTA\Data(field="move_battle_style")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveBattleStyleSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveBattleStyleSummary::class})
     */
    public ?\App\DTO\MoveBattleStyleSummary $move_battle_style = null;

}
