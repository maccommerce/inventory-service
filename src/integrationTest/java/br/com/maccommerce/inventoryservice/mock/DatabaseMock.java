package br.com.maccommerce.inventoryservice.mock;

import io.zonky.test.db.postgres.embedded.EmbeddedPostgres;

import java.io.IOException;

public class DatabaseMock {

    private static DatabaseMock INSTANCE;

    private final EmbeddedPostgres embeddedPostgres;

    private DatabaseMock() throws IOException {
        this.embeddedPostgres = EmbeddedPostgres.builder().setPort(5433).start();
    }

    public static DatabaseMock startServer() throws IOException {
        if(INSTANCE == null) {
            INSTANCE = new DatabaseMock();
        }
        return INSTANCE;
    }

    public void stopServer() throws IOException {
        embeddedPostgres.close();
    }

}
