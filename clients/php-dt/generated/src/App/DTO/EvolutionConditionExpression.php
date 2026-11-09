<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class EvolutionConditionExpression
{
    /**
     * Evaluatable RPN condition expression using evolution variables (e.g. &#39;EC 100 % 0 &#x3D;&#x3D;&#39;)
     * @DTA\Data(field="expression")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $expression = null;

    /**
     * Percentage chance of evolution under this condition (0-100)
     * @DTA\Data(field="percentage_chance")
     * @DTA\Validator(name="Scalar", options={"type":"float"})
     */
    public ?float $percentage_chance = null;

    /**
     * Evolution variables referenced in the expression
     * @DTA\Data(field="variables")
     * @DTA\Strategy(name="Object", options={"type":::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":::class})
     */
    public ?array $variables = null;

}
