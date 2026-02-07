<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class MoveTargetDetail
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection119::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection119::class})
     */
    public ?\App\DTO\Collection119 $descriptions = null;

    /**
     * @DTA\Data(field="moves")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection120::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection120::class})
     */
    public ?\App\DTO\Collection120 $moves = null;

    /**
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection121::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection121::class})
     */
    public ?\App\DTO\Collection121 $names = null;

}
