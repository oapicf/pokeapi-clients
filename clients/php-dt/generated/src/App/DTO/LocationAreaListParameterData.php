<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for locationAreaList
 */
class LocationAreaListParameterData
{
    /**
     * The initial index from which to return the results.
     * @DTA\Data(subset="query", field="offset", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $offset = null;

    /**
     * Number of results to return per page.
     * @DTA\Data(subset="query", field="limit", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"int"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"int"})
     */
    public ?int $limit = null;

}
