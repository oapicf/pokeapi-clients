<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class StatDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":100})
     */
    public ?string $name = null;

    /**
     * @DTA\Data(field="game_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $game_index = null;

    /**
     * @DTA\Data(field="is_battle_only", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_battle_only = null;

    /**
     * @DTA\Data(field="affecting_moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatDetailAffectingMoves::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatDetailAffectingMoves::class})
     */
    public ?\App\DTO\StatDetailAffectingMoves $affecting_moves = null;

    /**
     * @DTA\Data(field="affecting_natures")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatDetailAffectingNatures::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatDetailAffectingNatures::class})
     */
    public ?\App\DTO\StatDetailAffectingNatures $affecting_natures = null;

    /**
     * @DTA\Data(field="characteristics")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection187::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection187::class})
     */
    public ?\App\DTO\Collection187 $characteristics = null;

    /**
     * @DTA\Data(field="move_damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     */
    public ?\App\DTO\MoveDamageClassSummary $move_damage_class = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection188::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection188::class})
     */
    public ?\App\DTO\Collection188 $names = null;

}
