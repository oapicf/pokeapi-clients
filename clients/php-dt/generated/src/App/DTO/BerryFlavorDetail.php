<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class BerryFlavorDetail
{
    /**
     * The identifier for this resource.
     * @DTA\Data(field="id")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $id = null;

    /**
     * The name for this resource.
     * @DTA\Data(field="name")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @DTA\Validator(name="Length", options={"max":200})
     */
    public ?string $name = null;

    /**
     * A list of the berries with this flavor.
     * @DTA\Data(field="berries")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection13::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection13::class})
     */
    public ?\App\DTO\Collection13 $berries = null;

    /**
     * The contest type that correlates with this berry flavor.
     * @DTA\Data(field="contest_type")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\ContestTypeSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\ContestTypeSummary::class})
     */
    public ?\App\DTO\ContestTypeSummary $contest_type = null;

    /**
     * The name of this resource listed in different languages.
     * @DTA\Data(field="names")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection14::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection14::class})
     */
    public ?\App\DTO\Collection14 $names = null;

}
