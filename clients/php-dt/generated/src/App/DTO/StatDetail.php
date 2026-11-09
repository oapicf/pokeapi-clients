<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class StatDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $name = null;

    /**
     * ID the games use for this stat.
     * @DTA\Data(field="game_index")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $game_index = null;

    /**
     * Whether this stat only exists within a battle.
     * @DTA\Data(field="is_battle_only", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"bool"})
     */
    public ?bool $is_battle_only = null;

    /**
     * A detail of moves which affect this stat positively or negatively.
     * @DTA\Data(field="affecting_moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatAffectingMoves::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatAffectingMoves::class})
     */
    public ?\App\DTO\StatAffectingMoves $affecting_moves = null;

    /**
     * A detail of natures which affect this stat positively or negatively.
     * @DTA\Data(field="affecting_natures")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\StatAffectingNatures::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\StatAffectingNatures::class})
     */
    public ?\App\DTO\StatAffectingNatures $affecting_natures = null;

    /**
     * Items that affect this stat, such as vitamins and battle items.
     * @DTA\Data(field="affecting_items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection186::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection186::class})
     */
    public ?\App\DTO\Collection186 $affecting_items = null;

    /**
     * A list of characteristics that are set on a Pokémon when its highest base stat is this stat.
     * @DTA\Data(field="characteristics")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection187::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection187::class})
     */
    public ?\App\DTO\Collection187 $characteristics = null;

    /**
     * The class of damage this stat is directly related to.
     * @DTA\Data(field="move_damage_class")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\MoveDamageClassSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\MoveDamageClassSummary::class})
     */
    public ?\App\DTO\MoveDamageClassSummary $move_damage_class = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection188::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection188::class})
     */
    public ?\App\DTO\Collection188 $names = null;

}
