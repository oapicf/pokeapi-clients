<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ItemDetail
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
     * @DTA\Data(field="cost", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $cost = null;

    /**
     * @DTA\Data(field="fling_power", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $fling_power = null;

    /**
     * @DTA\Data(field="fling_effect")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemFlingEffectSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemFlingEffectSummary::class})
     */
    public ?\App\DTO\ItemFlingEffectSummary $fling_effect = null;

    /**
     * @DTA\Data(field="attributes")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection55::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection55::class})
     */
    public ?\App\DTO\Collection55 $attributes = null;

    /**
     * @DTA\Data(field="category")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemCategorySummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemCategorySummary::class})
     */
    public ?\App\DTO\ItemCategorySummary $category = null;

    /**
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection56::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection56::class})
     */
    public ?\App\DTO\Collection56 $effect_entries = null;

    /**
     * @DTA\Data(field="flavor_text_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection57::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection57::class})
     */
    public ?\App\DTO\Collection57 $flavor_text_entries = null;

    /**
     * @DTA\Data(field="game_indices")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection58::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection58::class})
     */
    public ?\App\DTO\Collection58 $game_indices = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection59::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection59::class})
     */
    public ?\App\DTO\Collection59 $names = null;

    /**
     * @DTA\Data(field="held_by_pokemon")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection61::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection61::class})
     */
    public ?\App\DTO\Collection61 $held_by_pokemon = null;

    /**
     * @DTA\Data(field="sprites")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemDetailSprites::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemDetailSprites::class})
     */
    public ?\App\DTO\ItemDetailSprites $sprites = null;

    /**
     * @DTA\Data(field="baby_trigger_for")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemDetailBabyTriggerFor::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemDetailBabyTriggerFor::class})
     */
    public ?\App\DTO\ItemDetailBabyTriggerFor $baby_trigger_for = null;

    /**
     * @DTA\Data(field="machines")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection62::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection62::class})
     */
    public ?\App\DTO\Collection62 $machines = null;

}
