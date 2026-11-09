<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PaginatedItemAttributeSummaryList
{
    /**
     * The total number of resources available from this API.
     * @DTA\Data(field="count")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $count = null;

    /**
     * The URL for the next page in the list, or null if there is no next page.
     * @DTA\Data(field="next", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $next = null;

    /**
     * The URL for the previous page in the list, or null if there is no previous page.
     * @DTA\Data(field="previous", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $previous = null;

    /**
     * A list of API resources on this page.
     * @DTA\Data(field="results")
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection67::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection67::class})
     */
    public ?\App\DTO\Collection67 $results = null;

}
