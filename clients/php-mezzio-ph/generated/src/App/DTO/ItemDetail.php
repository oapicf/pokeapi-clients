<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemDetail
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
     * @DTA\Data(field="cost", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $cost;

    /**
     * @DTA\Data(field="fling_power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $fling_power;

    /**
     * @DTA\Data(field="fling_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemFlingEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemFlingEffectSummary::class})
     * @var \App\DTO\ItemFlingEffectSummary|null
     */
    public $fling_effect;

    /**
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection55::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection55::class})
     * @var \App\DTO\Collection55|null
     */
    public $attributes;

    /**
     * @DTA\Data(field="category")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemCategorySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemCategorySummary::class})
     * @var \App\DTO\ItemCategorySummary|null
     */
    public $category;

    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection56::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection56::class})
     * @var \App\DTO\Collection56|null
     */
    public $effect_entries;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection57::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection57::class})
     * @var \App\DTO\Collection57|null
     */
    public $flavor_text_entries;

    /**
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection58::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection58::class})
     * @var \App\DTO\Collection58|null
     */
    public $game_indices;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection59::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection59::class})
     * @var \App\DTO\Collection59|null
     */
    public $names;

    /**
     * @DTA\Data(field="held_by_pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection61::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection61::class})
     * @var \App\DTO\Collection61|null
     */
    public $held_by_pokemon;

    /**
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemDetailSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemDetailSprites::class})
     * @var \App\DTO\ItemDetailSprites|null
     */
    public $sprites;

    /**
     * @DTA\Data(field="baby_trigger_for")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemDetailBabyTriggerFor::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemDetailBabyTriggerFor::class})
     * @var \App\DTO\ItemDetailBabyTriggerFor|null
     */
    public $baby_trigger_for;

    /**
     * @DTA\Data(field="machines")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection62::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection62::class})
     * @var \App\DTO\Collection62|null
     */
    public $machines;

}
