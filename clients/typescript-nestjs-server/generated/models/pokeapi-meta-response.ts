

export interface PokeapiMetaResponse { 
  /**
   * The deployment time as a Unix timestamp string.
   */
  deploy_date: string | null;
  /**
   * The source commit hash used for this deployment.
   */
  hash: string | null;
  /**
   * The deployment tag, or null if the deployment has no tag.
   */
  tag: string | null;
}

