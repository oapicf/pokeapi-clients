<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PaginatedBerryFlavorSummaryList
{
    /**
     * @DTA\Data(field="count", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $count = null;

    /**
     * @DTA\Data(field="next", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $next = null;

    /**
     * @DTA\Data(field="previous", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $previous = null;

    /**
     * @DTA\Data(field="results", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection12::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection12::class})
     */
    public ?\App\DTO\Collection12 $results = null;

}
