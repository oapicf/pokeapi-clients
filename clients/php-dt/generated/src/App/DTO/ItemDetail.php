<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ItemDetail
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
     * The power of the move Fling when used with this item.
     * @DTA\Data(field="fling_power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @DTA\Validator(name="Range", options={"min":-2147483648, "max":2147483647})
     */
    public ?int $fling_power = null;

    /**
     * The effect of the move Fling when used with this item.
     * @DTA\Data(field="fling_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemFlingEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemFlingEffectSummary::class})
     */
    public ?\App\DTO\ItemFlingEffectSummary $fling_effect = null;

    /**
     * A list of attributes this item has.
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection55::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection55::class})
     */
    public ?\App\DTO\Collection55 $attributes = null;

    /**
     * The category of items this item falls into.
     * @DTA\Data(field="category")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemCategorySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemCategorySummary::class})
     */
    public ?\App\DTO\ItemCategorySummary $category = null;

    /**
     * The effect of this ability listed in different languages.
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection56::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection56::class})
     */
    public ?\App\DTO\Collection56 $effect_entries = null;

    /**
     * The flavor text of this ability listed in different languages.
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection57::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection57::class})
     */
    public ?\App\DTO\Collection57 $flavor_text_entries = null;

    /**
     * A list of game indices relevent to this item by generation.
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection58::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection58::class})
     */
    public ?\App\DTO\Collection58 $game_indices = null;

    /**
     * Purchase and sell prices by currency and version group. Prices may be null when the item cannot be bought or sold.
     * @DTA\Data(field="prices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection59::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection59::class})
     */
    public ?\App\DTO\Collection59 $prices = null;

    /**
     * The name of this item listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection60::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection60::class})
     */
    public ?\App\DTO\Collection60 $names = null;

    /**
     * A list of Pokémon that might be found in the wild holding this item.
     * @DTA\Data(field="held_by_pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection62::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection62::class})
     */
    public ?\App\DTO\Collection62 $held_by_pokemon = null;

    /**
     * A set of sprites used to depict this item in the game.
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemSprites::class})
     */
    public ?\App\DTO\ItemSprites $sprites = null;

    /**
     * An evolution chain this item requires to produce a bay during mating.
     * @DTA\Data(field="baby_trigger_for")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\EvolutionChainSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\EvolutionChainSummary::class})
     */
    public ?\App\DTO\EvolutionChainSummary $baby_trigger_for = null;

    /**
     * A list of the machines related to this item.
     * @DTA\Data(field="machines")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection63::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection63::class})
     */
    public ?\App\DTO\Collection63 $machines = null;

}
