<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemFlingEffectDetail
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
     * The result of this fling effect listed in different languages.
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection72::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection72::class})
     * @var \App\DTO\Collection72|null
     */
    public $effect_entries;

    /**
     * A list of items that have this fling effect.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection73::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection73::class})
     * @var \App\DTO\Collection73|null
     */
    public $items;

}
