<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class StatDetail
{
    /**
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":100})
     * @var string|null
     */
    public $name;

    /**
     * @DTA\Data(field="game_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $game_index;

    /**
     * @DTA\Data(field="is_battle_only", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_battle_only;

    /**
     * @DTA\Data(field="affecting_moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatDetailAffectingMoves::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatDetailAffectingMoves::class})
     * @var \App\DTO\StatDetailAffectingMoves|null
     */
    public $affecting_moves;

    /**
     * @DTA\Data(field="affecting_natures")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatDetailAffectingNatures::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatDetailAffectingNatures::class})
     * @var \App\DTO\StatDetailAffectingNatures|null
     */
    public $affecting_natures;

    /**
     * @DTA\Data(field="characteristics")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection187::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection187::class})
     * @var \App\DTO\Collection187|null
     */
    public $characteristics;

    /**
     * @DTA\Data(field="move_damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @var \App\DTO\MoveDamageClassSummary|null
     */
    public $move_damage_class;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection188::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection188::class})
     * @var \App\DTO\Collection188|null
     */
    public $names;

}
