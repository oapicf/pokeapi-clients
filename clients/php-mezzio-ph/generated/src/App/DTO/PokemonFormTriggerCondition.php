<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class PokemonFormTriggerCondition
{
    /**
     * The trigger for this form change.
     * @DTA\Data(field="trigger")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $trigger;

    /**
     * The name of the required item, ability, or move. Only present for a resource-based trigger.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $name;

    /**
     * The URL of the required item, ability, or move. Only present for a resource-based trigger.
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $url;

    /**
     * The required base form. Only present when the trigger specifies one.
     * @DTA\Data(field="base_form", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\PokemonFormSummary::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\PokemonFormSummary::class})
     * @var \App\DTO\PokemonFormSummary|null
     */
    public $base_form;

}
