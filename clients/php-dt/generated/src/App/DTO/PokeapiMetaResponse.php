<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class PokeapiMetaResponse
{
    /**
     * The deployment time as a Unix timestamp string.
     * @DTA\Data(field="deploy_date")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $deploy_date = null;

    /**
     * The source commit hash used for this deployment.
     * @DTA\Data(field="hash")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $hash = null;

    /**
     * The deployment tag, or null if the deployment has no tag.
     * @DTA\Data(field="tag")
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $tag = null;

}
