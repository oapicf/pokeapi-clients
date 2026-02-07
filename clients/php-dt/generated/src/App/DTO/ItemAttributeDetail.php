<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class ItemAttributeDetail
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
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection67::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection67::class})
     */
    public ?\App\DTO\Collection67 $descriptions = null;

    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection68::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection68::class})
     */
    public ?\App\DTO\Collection68 $items = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection69::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection69::class})
     */
    public ?\App\DTO\Collection69 $names = null;

}
