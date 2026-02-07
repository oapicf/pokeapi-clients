<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ScalarList", options={"type":"mixed"})
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"Scalar", "options":{"type":"mixed"}}
 * }})
 */
class Collection34 extends \ArrayObject
{
}
