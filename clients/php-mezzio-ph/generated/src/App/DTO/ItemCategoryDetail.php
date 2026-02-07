<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemCategoryDetail
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
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection64::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection64::class})
     * @var \App\DTO\Collection64|null
     */
    public $items;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection65::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection65::class})
     * @var \App\DTO\Collection65|null
     */
    public $names;

    /**
     * @DTA\Data(field="pocket")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemPocketSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemPocketSummary::class})
     * @var \App\DTO\ItemPocketSummary|null
     */
    public $pocket;

}
