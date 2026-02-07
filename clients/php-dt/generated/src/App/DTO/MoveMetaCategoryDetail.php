<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveMetaCategoryDetail
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection108::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection108::class})
     */
    public ?\App\DTO\Collection108 $descriptions = null;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection109::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection109::class})
     */
    public ?\App\DTO\Collection109 $moves = null;

}
