<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class ContestTypeDetail
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
     * @DTA\Data(field="berry_flavor")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\BerryFlavorSummary::class})
     * @var \App\DTO\BerryFlavorSummary|null
     */
    public $berry_flavor;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection19::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection19::class})
     * @var \App\DTO\Collection19|null
     */
    public $names;

}
