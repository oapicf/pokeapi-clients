<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for itemAttributeRetrieve
 */
class ItemAttributeRetrieveParameterData
{
    /**
     * This parameter can be a string or an integer.
     * @DTA\Data(subset="path", field="id")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $id = null;

}
