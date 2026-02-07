<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ItemFlingEffectDetail
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
     * @DTA\Data(field="effect_entries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection71::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection71::class})
     */
    public ?\App\DTO\Collection71 $effect_entries = null;

    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection72::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection72::class})
     */
    public ?\App\DTO\Collection72 $items = null;

}
