<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ItemPocketDetail
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
     * @DTA\Data(field="categories")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection74::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection74::class})
     * @var \App\DTO\Collection74|null
     */
    public $categories;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection75::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection75::class})
     * @var \App\DTO\Collection75|null
     */
    public $names;

}
