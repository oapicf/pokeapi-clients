<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemFlingEffectDetail
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
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection71::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection71::class})
     * @var \App\DTO\Collection71|null
     */
    public $effect_entries;

    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection72::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection72::class})
     * @var \App\DTO\Collection72|null
     */
    public $items;

}
