<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class BerryFirmnessDetail
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
     * @DTA\Data(field="berries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection10::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection10::class})
     * @var \App\DTO\Collection10|null
     */
    public $berries;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection11::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection11::class})
     * @var \App\DTO\Collection11|null
     */
    public $names;

}
