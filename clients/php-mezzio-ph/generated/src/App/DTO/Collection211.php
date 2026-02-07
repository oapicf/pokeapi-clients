<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * @DTA\Strategy(name="ScalarMap", options={"type":\App\DTO\Collection210::class})
 * @DTA\Validator(name="Collection", options={"validators":{
 *     {"name":"Scalar", "options":{"type":\App\DTO\Collection210::class}}
 * }})
 */
class Collection211 extends \ArrayObject
{
}
