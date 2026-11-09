<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ItemCategoryDetail
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
     * A list of items that are a part of this category.
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection65::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection65::class})
     */
    public ?\App\DTO\Collection65 $items = null;

    /**
     * The name of this item category listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection66::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection66::class})
     */
    public ?\App\DTO\Collection66 $names = null;

    /**
     * The pocket items in this category would be put in.
     * @DTA\Data(field="pocket")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemPocketSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemPocketSummary::class})
     */
    public ?\App\DTO\ItemPocketSummary $pocket = null;

}
