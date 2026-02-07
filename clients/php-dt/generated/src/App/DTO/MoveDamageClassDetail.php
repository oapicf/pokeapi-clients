<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveDamageClassDetail
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection111::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection111::class})
     */
    public ?\App\DTO\Collection111 $descriptions = null;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection112::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection112::class})
     */
    public ?\App\DTO\Collection112 $moves = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection113::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection113::class})
     */
    public ?\App\DTO\Collection113 $names = null;

}
