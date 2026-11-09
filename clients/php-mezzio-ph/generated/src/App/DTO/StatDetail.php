<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class StatDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $id;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="StringLength", options={"max":200})
     * @var string|null
     */
    public $name;

    /**
     * ID the games use for this stat.
     * @DTA\Data(field="game_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $game_index;

    /**
     * Whether this stat only exists within a battle.
     * @DTA\Data(field="is_battle_only", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     * @var bool|null
     */
    public $is_battle_only;

    /**
     * A detail of moves which affect this stat positively or negatively.
     * @DTA\Data(field="affecting_moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatAffectingMoves::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatAffectingMoves::class})
     * @var \App\DTO\StatAffectingMoves|null
     */
    public $affecting_moves;

    /**
     * A detail of natures which affect this stat positively or negatively.
     * @DTA\Data(field="affecting_natures")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatAffectingNatures::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatAffectingNatures::class})
     * @var \App\DTO\StatAffectingNatures|null
     */
    public $affecting_natures;

    /**
     * Items that affect this stat, such as vitamins and battle items.
     * @DTA\Data(field="affecting_items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection186::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection186::class})
     * @var \App\DTO\Collection186|null
     */
    public $affecting_items;

    /**
     * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
     * @DTA\Data(field="characteristics")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection187::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection187::class})
     * @var \App\DTO\Collection187|null
     */
    public $characteristics;

    /**
     * The class of damage this stat is directly related to.
     * @DTA\Data(field="move_damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @var \App\DTO\MoveDamageClassSummary|null
     */
    public $move_damage_class;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection188::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection188::class})
     * @var \App\DTO\Collection188|null
     */
    public $names;

}
