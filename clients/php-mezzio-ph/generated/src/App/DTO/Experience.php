<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Experience
{
    /**
     * @DTA\Data(field="level")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $level;

    /**
     * @DTA\Data(field="experience")
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $experience;

}
