<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemAttributeDetail
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
     * @DTA\Data(field="descriptions")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection67::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection67::class})
     * @var \App\DTO\Collection67|null
     */
    public $descriptions;

    /**
     * @DTA\Data(field="items")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection68::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection68::class})
     * @var \App\DTO\Collection68|null
     */
    public $items;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection69::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection69::class})
     * @var \App\DTO\Collection69|null
     */
    public $names;

}
