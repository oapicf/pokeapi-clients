<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ItemCategoryDetail
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
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection64::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection64::class})
     */
    public ?\App\DTO\Collection64 $items = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection65::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection65::class})
     */
    public ?\App\DTO\Collection65 $names = null;

    /**
     * @DTA\Data(field="pocket")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ItemPocketSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ItemPocketSummary::class})
     */
    public ?\App\DTO\ItemPocketSummary $pocket = null;

}
