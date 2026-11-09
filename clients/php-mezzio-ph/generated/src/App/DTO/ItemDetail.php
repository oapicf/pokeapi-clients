<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemDetail
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
     * The power of the move Fling when used with this item.
     * @DTA\Data(field="fling_power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="GreaterThan", options={"min":-2147483648, "inclusive":true})
     * @DTA\Validator(name="LessThan", options={"max":2147483647, "inclusive":true})
     * @var int|null
     */
    public $fling_power;

    /**
     * The effect of the move Fling when used with this item.
     * @DTA\Data(field="fling_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemFlingEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemFlingEffectSummary::class})
     * @var \App\DTO\ItemFlingEffectSummary|null
     */
    public $fling_effect;

    /**
     * A list of attributes this item has.
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection55::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection55::class})
     * @var \App\DTO\Collection55|null
     */
    public $attributes;

    /**
     * The category of items this item falls into.
     * @DTA\Data(field="category")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemCategorySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemCategorySummary::class})
     * @var \App\DTO\ItemCategorySummary|null
     */
    public $category;

    /**
     * The effect of this ability listed in different languages.
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection56::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection56::class})
     * @var \App\DTO\Collection56|null
     */
    public $effect_entries;

    /**
     * The flavor text of this ability listed in different languages.
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection57::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection57::class})
     * @var \App\DTO\Collection57|null
     */
    public $flavor_text_entries;

    /**
     * A list of game indices relevent to this item by generation.
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection58::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection58::class})
     * @var \App\DTO\Collection58|null
     */
    public $game_indices;

    /**
     * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
     * @DTA\Data(field="prices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection59::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection59::class})
     * @var \App\DTO\Collection59|null
     */
    public $prices;

    /**
     * The name of this item listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection60::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection60::class})
     * @var \App\DTO\Collection60|null
     */
    public $names;

    /**
     * A list of Pokémon that might be found in the wild holding this item.
     * @DTA\Data(field="held_by_pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection62::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection62::class})
     * @var \App\DTO\Collection62|null
     */
    public $held_by_pokemon;

    /**
     * A set of sprites used to depict this item in the game.
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSprites::class})
     * @var \App\DTO\ItemSprites|null
     */
    public $sprites;

    /**
     * An evolution chain this item requires to produce a bay during mating.
     * @DTA\Data(field="baby_trigger_for")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainSummary::class})
     * @var \App\DTO\EvolutionChainSummary|null
     */
    public $baby_trigger_for;

    /**
     * A list of the machines related to this item.
     * @DTA\Data(field="machines")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection63::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection63::class})
     * @var \App\DTO\Collection63|null
     */
    public $machines;

}
