<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for abilityList
 */
class AbilityListParameterData
{
    /**
     * &gt; Only available locally and not at [pokeapi.co](https://pokeapi.co/docs/v2) Case-insensitive query applied on the &#x60;name&#x60; property.
     * @DTA\Data(subset="query", field="q", nullable=true)
     * @DTA\Strategy(subset="query", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="query", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $q = null;

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
