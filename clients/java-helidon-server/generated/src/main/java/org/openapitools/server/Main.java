package org.openapitools.server;

import org.openapitools.server.api.BerriesServiceImpl;
import org.openapitools.server.api.ContestsServiceImpl;
import org.openapitools.server.api.EncountersServiceImpl;
import org.openapitools.server.api.EvolutionServiceImpl;
import org.openapitools.server.api.GamesServiceImpl;
import org.openapitools.server.api.ItemsServiceImpl;
import org.openapitools.server.api.LocationServiceImpl;
import org.openapitools.server.api.MachinesServiceImpl;
import org.openapitools.server.api.MovesServiceImpl;
import org.openapitools.server.api.PokemonServiceImpl;
import org.openapitools.server.api.UtilityServiceImpl;

import io.helidon.logging.common.LogConfig;
import io.helidon.config.Config;
import io.helidon.webserver.http.HttpRouting;
import io.helidon.webserver.WebServer;

/**
* The application main class.
*/
public final class Main {

    /**
    * Cannot be instantiated.
    */
    private Main() {
    }

    /**
    * Application main entry point.
    * @param args command line arguments.
    */
    public static void main(final String[] args) {
        startServer();
    }

    /**
    * Start the server.
    * @return the created {@link WebServer} instance
    */
    static WebServer startServer() {

        // load logging configuration
        LogConfig.configureRuntime();

        // By default this will pick up application.yaml from the classpath
        Config config = Config.create();
        Config.global(config);

        WebServer webserver = WebServer.builder()
                .config(config.get("server"))
                .routing(Main::routing)
                .build()
                .start();

        System.out.println("WEB server is up! https://pokeapi.co");

        return webserver;
    }

    /**
     * Updates HTTP routing and implicitly registers observe providers.
     */
    static void routing(HttpRouting.Builder routing) {
        routing
            .register("/api/v2", new BerriesServiceImpl())
            .register("/api/v2", new ContestsServiceImpl())
            .register("/api/v2", new EncountersServiceImpl())
            .register("/api/v2", new EvolutionServiceImpl())
            .register("/api/v2", new GamesServiceImpl())
            .register("/api/v2", new ItemsServiceImpl())
            .register("/api/v2", new LocationServiceImpl())
            .register("/api/v2/machine", new MachinesServiceImpl())
            .register("/api/v2", new MovesServiceImpl())
            .register("/api/v2", new PokemonServiceImpl())
            .register("/api/v2/language", new UtilityServiceImpl());
    }
}
